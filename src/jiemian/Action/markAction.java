package jiemian.Action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.opensymphony.xwork2.ActionContext;

import jiemian.Service.markService;

@Repository("markaction")
@Scope("prototype")
public class markAction {
	
	
	int xid = 0;
  public 	static int count = 0;
	@Autowired
	markService markService;
	
	
	public String chushiqiandao()
	{
		ActionContext actionContext = ActionContext.getContext();
	    Map session = actionContext.getSession();
	
	    String sname = (String) session.get("sn");
	
	     boolean isS = markService.findX(sname);
	
	     if(isS==false)
	     {
		     xid = markService.findXid(sname);
		     markService.addXinfo(xid, sname);
		     System.out.println("执行了吗");
	     }
		
		
		return "success";
	}
	
	public String qiandao1()
	{
		ActionContext actionContext = ActionContext.getContext();
	    Map session = actionContext.getSession();
	
	    String sname = (String) session.get("sn");
	    xid = markService.findXid(sname);
		
		HttpServletRequest request = ServletActionContext.getRequest();
		
		 String q = request.getParameter("qd1");
	    
		if(q.equals("签到"))
		{
		
			markService._1qd(xid, q);
			return "success";
		}
			return "eor";
		
		
	    
	}
	
	
	public String qiandao2()
	{
		ActionContext actionContext = ActionContext.getContext();
	    Map session = actionContext.getSession();
	
	    String sname = (String) session.get("sn");
	    xid = markService.findXid(sname);
		
		
		HttpServletRequest request = ServletActionContext.getRequest();
	   
	 
		
	   String q = request.getParameter("qd2");
		if(q.equals("签到"))
		{
			System.out.println("2执行了");
			System.out.println(xid+" "+q);
			markService._2qd(xid, q);
			
			return "success";
		}
		
	    return "eor";
	}
	
	
	
	
	public String qiandao3()
	{
		ActionContext actionContext = ActionContext.getContext();
	    Map session = actionContext.getSession();
	
	    String sname = (String) session.get("sn");
	    xid = markService.findXid(sname);
	
		HttpServletRequest request = ServletActionContext.getRequest();
		 String q = request.getParameter("qd3");
	 
		if(q.equals("签到"))
		{
			System.out.println(q);
			markService._3qd(xid, q);
			
			return "success";
		}
		
	    return "eor";
	}
	
	
	
	
	public String qiandao4()
	{
		ActionContext actionContext = ActionContext.getContext();
	    Map session = actionContext.getSession();
	
	    String sname = (String) session.get("sn");
	    xid = markService.findXid(sname);
		
	
		HttpServletRequest request = ServletActionContext.getRequest();
		 String q = request.getParameter("qd4");
	    
		 if(q.equals("签到"))
		{
			markService._4qd(xid, q);
		
			return "success";
		}
		
	    return "eor";
	}
	
	
	
	public String qiandao5()
	{
		ActionContext actionContext = ActionContext.getContext();
	    Map session = actionContext.getSession();
	
	    String sname = (String) session.get("sn");
	    xid = markService.findXid(sname);
		
		HttpServletRequest request = ServletActionContext.getRequest();
		 String q = request.getParameter("qd5");
	    
		
		if(q.equals("签到"))
		{
			markService._5qd(xid, q);
			
			System.out.println(count);
			return "success";
		}
		
	    return "eor";
	}

}
