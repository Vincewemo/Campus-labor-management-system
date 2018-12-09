package jiemian.Action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.opensymphony.xwork2.ActionContext;
import com.sun.xml.internal.stream.buffer.sax.SAXBufferProcessor;

import jiemian.Dao.LeaveDao;
import jiemian.entities.qJinfo;

@Repository("leaveaction")
@Scope("prototype")
public class LeaveAction {
	
	
	
	
	@Autowired
	LeaveDao leavedao;
	
	public String addqingjiaxinxi()
	{
		
		HttpServletRequest request = ServletActionContext.getRequest();
		ActionContext actionContext = ActionContext.getContext();
		Map session = actionContext.getSession();
		
		String sname = (String)session.get("sn");
		String ly = request.getParameter("qjly");
		
		if(ly.length()>=225||ly.length()==0)
		{
			return "error";
		}
		
		
		//查该学生有没有请假
		
		if(leavedao.isQjingJia(sname)==true)
		{
			System.out.println(leavedao.isQjingJia(sname));			
			return "error";
		}
		
		//录入该学生和请假信息并将核实和劳动默认设置为'未核实''打扫教室'
		
		
		leavedao.addXqjinfo(sname, ly);
		System.out.println(ly);
		
		return "success";
	}
	
	
	
	
	public String showSQJinfo()
	{
		HttpServletRequest request = ServletActionContext.getRequest();
		ActionContext actionContext = ActionContext.getContext();
		Map session = actionContext.getSession();
		
		String sname = (String)session.get("sn");
		
		
		List<qJinfo> lqj = leavedao.findSqinfo(sname);
		
		
		request.setAttribute("sqj", lqj);
		
		
		
		
		
		return "success";
	}
	
	//撤销请假
	public String removeQj()
	{
		
		
		HttpServletRequest request = ServletActionContext.getRequest();
		ActionContext actionContext = ActionContext.getContext();
		Map session = actionContext.getSession();
		
		String sname = (String)session.get("sn");
		
		//检查有没有请假
		if( leavedao.isQjingJia(sname) == false)
		{
			return "mqingjia";
		}
		
		
		leavedao.chexiaoqingjia(sname);
		
		return "success";
		
		
	}
	
	public String TfindAllleaveinfo()
	{
		
		HttpServletRequest request = ServletActionContext.getRequest();
		
		List<qJinfo> qjll = leavedao.findAllqjinfo();
		
		
		request.setAttribute("tqjinfo", qjll);
		
		
		
		
		
		return "success";
	}
	
	
	public String Tpizhun()
	{
		HttpServletRequest request = ServletActionContext.getRequest();
		
		String sname = request.getParameter("qjxsm");
		
		String pizhun = request.getParameter("pz");
		
		System.out.println(sname);
		System.out.println(pizhun);
		if(pizhun.equals("批准"))
		{
			
			
			//查有没有这个学生
			if(leavedao.isQjingJia(sname)==false)
			{
				System.out.println("1执行");
				return "error";
			}
			
			//查是否已经批准
			
			
			if(leavedao.isPiZhun(sname)==true)
			{
				System.out.println("2执行");
				return "error";
			}
			//批准该学生
			leavedao.PiZhun(sname);
			return "success";
		}else{
		return "error";
	    }
	  
	}
	
	
}
