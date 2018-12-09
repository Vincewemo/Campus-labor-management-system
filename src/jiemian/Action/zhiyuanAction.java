package jiemian.Action;

import static org.hamcrest.CoreMatchers.nullValue;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.flash;

import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.opensymphony.xwork2.ActionContext;

import jiemian.Dao.zhuyuanDao;
import jiemian.entities.ChooseZY;
import jiemian.entities.zhiyuan;

@Repository("zhiyuanaction")
@Scope("prototype")
public class zhiyuanAction {
	
	
	
	@Autowired
	zhuyuanDao zhuyuanDao;
	
	
	public static boolean isNumber(String str)
	{
		Pattern pattern = Pattern.compile("[0-9]*");
		Matcher isNum = pattern.matcher(str);
		return isNum.matches();
	}
	
	
	
	
	
	public String Allzhiyuan()
	{
		HttpServletRequest request = ServletActionContext.getRequest();
		
		
		List<zhiyuan> xxzy = zhuyuanDao.findallzhiyuan();
		
		if(xxzy.size()!=0)
		{
			System.out.println(xxzy.get(0).getID());
			request.setAttribute("xzy", xxzy);
			return "success";
		}
		
		return "novalue";
		
		
		
	}
	public String Xzhiyuan()
	{
		boolean isyou = false;
		ActionContext actionContext = ActionContext.getContext();
		Map session = actionContext.getSession();
		
		String name = (String)session.get("sn");
		
		HttpServletRequest request = ServletActionContext.getRequest();
		String zhiyuanmc = "";
		
		String zhiyuanhao = request.getParameter("zyh");
		
		
		if(isNumber(zhiyuanhao)==false)
		{
			return "no";
		}
		
		
		
		
		
		
		
		
		
		int xinid = Integer.parseInt(zhiyuanhao);
		List<zhiyuan> lzy = zhuyuanDao.findallzhiyuan();
		
		System.out.println(lzy);
		System.out.println(xinid);
		//查询是否有该id号
		for(zhiyuan zy :lzy)
		{
//			System.out.println(zy.getID());
			if(zy.getID()==xinid)
			{
				System.out.println("执行了吗");
                zhiyuanmc = zy.getZymc();		
                System.out.println(zhiyuanmc);
                isyou = true;
				break;
			}
		
//			System.out.println(1);
//				return "no";
		}
		
		
		if(isyou==false)
		{
			return "no";
		}
		
		
		
		
		
		//查看是否重复
		List<ChooseZY> Cxzy = zhuyuanDao.canjiaInfo(name);
		System.out.println(Cxzy);
		if(Cxzy.isEmpty())
		{
			zhuyuanDao.xuanzezhiyuan(zhiyuanmc, name);
		}
		else{
		
		
			for(ChooseZY czy :Cxzy)
			{
				if(czy.getZyname().equals(zhiyuanmc))
				{
					System.out.println("第二个no");
					return "no";
				}
			}
		
			
			System.out.println("执行了吗");
			System.out.println();
			zhuyuanDao.xuanzezhiyuan(zhiyuanmc, name);
		
		}
			return "success";
		
	}
	
	
	public String yxz()
	{
		
		HttpServletRequest request = ServletActionContext.getRequest();
		
		ActionContext actionContext = ActionContext.getContext();
		Map session = actionContext.getSession();
		
		String nname = (String)session.get("sn");
		
		
		List<ChooseZY> cjz = zhuyuanDao.canjiaInfo(nname);
		
		if(cjz.isEmpty())
		{
			return "meizhi";
		}
		request.setAttribute("ccjz", cjz);
		
		
		
		
		return "success" ;
	}
	
	
	
	public String Dzhiyuan()
	{
		
		Boolean isyou = false;
		HttpServletRequest request = ServletActionContext.getRequest();
		ActionContext actionContext = ActionContext.getContext();
		Map session = actionContext.getSession();
		String zyname = request.getParameter("qxzym");
		String name = (String)session.get("sn");
		List<ChooseZY> xzy = zhuyuanDao.canjiaInfo(name);
		
		if(xzy.isEmpty())
		{
			System.out.println("执行了吗1");
			return "noo";
		}
		
		for(ChooseZY yzc : xzy)
		{
			if(yzc.getZyname().equals(zyname))
			{
				System.out.println("执行了吗2");
				isyou = true;
				break;
			}
		}
		
		if(isyou)
		{
			System.out.println("执行了吗3");
			zhuyuanDao.dropinfo(name, zyname);
			return "success";
		}
		
		
		return "noo";
	}
	
	
	
	public String GfindAllzy()
	{
		HttpServletRequest request = ServletActionContext.getRequest();
		
		List<zhiyuan> gzy = zhuyuanDao.findallzhiyuan();
		
		request.setAttribute("gzz", gzy);
		
		return "success";
		
		
	}
	
	public String addXinzhiyuan()
	{
		
		HttpServletRequest request = ServletActionContext.getRequest();
		
		String xinzy = request.getParameter("gxzym");
		String xinbh = request.getParameter("gxzyh");
		
		
		if(isNumber(xinbh)==false)
		{
			System.out.println("执行1");
			return "no";
		}
		
		if(xinzy==null)
		{
			System.out.println("执行2");
			return "no";
		}
		
		
		List<zhiyuan> zzlly = zhuyuanDao.findallzhiyuan();
		
		
		for(zhiyuan zy:zzlly)
		{
			if(zy.getZymc().equals(xinzy))
			{
				System.out.println("执行3");
				return "no";
			}
			if(zy.getBianhao().equals(xinbh))
			{
				System.out.println("执行4");
				return "no";
			}
		}
		
		zhuyuanDao.addXinzhiyuan(xinzy,xinbh);
		
		
		return "success";
	}
	
	
	
	
	
     public String Allchoose()
     {
    	 HttpServletRequest request = ServletActionContext.getRequest();
    	 
    	 
    	 List<ChooseZY> cczzj = zhuyuanDao.findAllxueshengzy();
    	 
    	 
    	 request.setAttribute("Txzh", cczzj);
    	 return "success";
     }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
