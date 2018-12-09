package jiemian.Action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.opensymphony.xwork2.ActionContext;

import jiemian.Dao.xinxiDao;
import jiemian.Service.LoginService;
import jiemian.Service.SxinxiService;
import jiemian.Service.xinxiService;

@Repository("loginaction")
@Scope("prototype")
public class LoginAction {

	boolean dl = false;
	
	
	@Autowired
	LoginService loginService;
	@Autowired
	xinxiService xinxiService;
	@Autowired
	SxinxiService sxinxiService;
	
	public String Tlogin() throws IOException{
		
		HttpServletRequest request  = ServletActionContext.getRequest();
//		HttpServletResponse response = ServletActionContext.getResponse();
		ActionContext actionContext = ActionContext.getContext();
//		PrintWriter out = response.getWriter();
		Map session = actionContext.getSession();
		
		String user = request.getParameter("jssname");
		String password = request.getParameter("jsspassword");
		
		 dl = loginService.jiaoshidenglu(user, password);
		 List<Integer> Tid = xinxiService.getTid(user);
		
		if(dl==true)
		{
			session.put("td", Tid);
			session.put("tn", user);
			session.put("tp", password);
			
			
			return "chenggong";
		}
		
		
		return "shibai";
	}
	
	public String Glogin(){
		
		HttpServletRequest request  = ServletActionContext.getRequest();
		
		ActionContext actionContext = ActionContext.getContext();
		Map session = actionContext.getSession();
		
		String user = request.getParameter("gname");
		String password = request.getParameter("gpassword");
		
		 dl = loginService.guanliyuandenglu(user, password);
		
		if(dl==true)
		{
			session.put("gn", user);
			return "chenggong";
		}
		
		
		return "shibai";
	}
	
public String Slogin(){
		
		HttpServletRequest request  = ServletActionContext.getRequest();
		
		ActionContext actionContext = ActionContext.getContext();
		
		Map session = actionContext.getSession();
		
		
		String user = request.getParameter("sname");
		String password = request.getParameter("spassword");
		
		 dl = loginService.xueshengdenglu(user, password);
		 List<Integer> Sid = sxinxiService.getsid(user);
		if(dl==true)
		{
			session.put("sd", Sid);
			session.put("sn", user);
			session.put("sp", password);
			return "chenggong";
			
		}
		
		
		return "shibai";
	}
	
}
