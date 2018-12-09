package jiemian.Action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.opensymphony.xwork2.ActionContext;

import jiemian.Dao.ToolDao;
import jiemian.entities.BandSre;
import jiemian.entities.BorrowT;
import jiemian.entities.Sdback;
import jiemian.entities.Tool;

@Repository(value="toolaction")
@Scope("prototype")
public class ToolAction {

	
	@Autowired
	ToolDao toolDao;
	
	
	
	public String xianshiTool()
	{
		HttpServletRequest request = ServletActionContext.getRequest();
		
		
		
		List<Tool> ttl = toolDao.findAllTools();
		
		if(ttl.isEmpty())
		{
			return "notool";
		}
		
		request.setAttribute("tl", ttl);
		
		return "success";
	}
	
	public String AddTool()
	{
		HttpServletRequest request = ServletActionContext.getRequest();
		
		String xgjname = request.getParameter("xgj");
		
		//有没有已经插入该工具
		if(toolDao.isyouTool(xgjname)==false)
			return "youle";
		
		toolDao.AddTools(xgjname);
		
		
		
		return "success";
	}
	
	
	
	
	
	
	public String ChangeWear()
	{
		HttpServletRequest request = ServletActionContext.getRequest();
		
		String gjname = request.getParameter("ggjm");
		String gnjd = request.getParameter("njd");
		
		if(gnjd.equals("良好")||gnjd.equals("差"))
		{
			if(toolDao.isyouTool(gjname)==false)
			{
				toolDao.ChangeWear(gjname, gnjd);
				return "success";
			}
			else
				return "shibai";
		}
		else
		return "shibai";
	}
	
	
	public String jiechuT()
	{
		
		HttpServletRequest request = ServletActionContext.getRequest();
		ActionContext actionContext = ActionContext.getContext();
		Map session = actionContext.getSession();
		
		String Xname = (String)session.get("sn");
		
		String Tname = request.getParameter("jgj");
		
		
		//查有没有这个工具
		if(toolDao.isyouTool(Tname) == true)
		{
			System.out.println("1执行");
			return "notool";
		}
		
		//查这个工具有没有已被该用户借出
		if(toolDao.isBorrow(Xname, Tname)==false)
		{
			System.out.println("2执行");
			return "notool";
		}
		
		//查耐久
		if(toolDao.naijiu(Tname)==false)
		{
			System.out.println("3执行");
			return "notool";
		}
		
		
		
		toolDao.BorrowTools(Xname, Tname);
		toolDao.AddSendBackTools(Xname, Tname);
		
		
		return "success";
	}
	
	
	
	public String XBorrowgj()
	{
		HttpServletRequest request = ServletActionContext.getRequest();
		ActionContext actionContext = ActionContext.getContext();
		Map session = actionContext.getSession();
		
		String name = (String)session.get("sn");
		
		List<BorrowT> btl = toolDao.findBorrowinfo(name);
		
		request.setAttribute("bbtl", btl);
		
		return "success";
	}
	
	
	
	
	
	
	public String huanruT()
	{
		HttpServletRequest request = ServletActionContext.getRequest();
		ActionContext actionContext = ActionContext.getContext();
		Map session = actionContext.getSession();
		
		String Xname = (String)session.get("sn");
		
		String Tname = request.getParameter("hgj");
		
		
		//查这个工具有没有还入
		if(toolDao.isSendBack(Xname, Tname)==false)
		{
			return "nosend";
		}
		
		//还入
		toolDao.SendBackTools(Xname, Tname);
		//删除借出记录
		toolDao.SendBackToolsBorrow(Xname, Tname);
		return "success";
	}
	
	public String Xhuanru()
	{
		HttpServletRequest request = ServletActionContext.getRequest();
		ActionContext actionContext = ActionContext.getContext();
		Map session = actionContext.getSession();
		
		String name = (String)session.get("sn");
		
		List<Sdback> ssdd = toolDao.findSendBackInfo(name);
		
		
		request.setAttribute("sd", ssdd);
		
		return "success";
	}
	
	
	
	
	public String TongjiBandS()
	{
//		
		HttpServletRequest request = ServletActionContext.getRequest();
//		ActionContext actionContext = ActionContext.getContext();
//		Map session = actionContext.getSession();
		
		//记录该学生
		
		//判断学生是否被添加
		
		List<BorrowT> bList = toolDao.findAllBorrowT();
		int allcount = 0;
		
		for(BorrowT bt :bList)
		{
			System.out.println("1zhixig");
			if( toolDao.isBandS(bt.getBtsname())==false)
			{
				System.out.println("2zhixig");
				boolean is =toolDao.isBandS(bt.getBtsname());		
				System.out.println(is);
				System.out.println(bt.getBtsname());
				toolDao.addBandS(bt.getBtsname());
			}
		}
		
		
		
			
		//查出该学生借出数量 并加入到BandSre表中
		for(BorrowT bbT : bList)
		{
			System.out.println("3执行");
			if(toolDao.isBandS(bbT.getBtsname())==true)
			{
				System.out.println("4执行");
				int i = 0;
				i = toolDao.BorrowCount(bbT.getBtsname());
//				allcount+=i;
//				System.out.println(allcount+" "+i);
				toolDao.addBandScount(bbT.getBtsname(), i+"");
			}
		}
		
//	
		List<BandSre> brel = toolDao.findAllBandSre();
		for(BorrowT sre :bList)
		{
			System.out.println(allcount);
			allcount += 1;
		}
		System.out.println(allcount);
		//存到表中
		//把表发送到前台
		request.setAttribute("brl", brel);
		request.setAttribute("alc", allcount);
		return "success";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
