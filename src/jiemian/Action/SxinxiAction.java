package jiemian.Action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.opensymphony.xwork2.ActionContext;

import jiemian.Service.SxinxiService;
import jiemian.entities.Sinfo;
import jiemian.entities.Tinfo;

@Repository("sxinxiaction")
@Scope("prototype")
public class SxinxiAction {
	
	
	@Autowired
	SxinxiService sxinxiService;
	
	
	ActionContext actionContext = ActionContext.getContext();
	Map session = actionContext.getSession();
	
	public String getSinfo()
	{
		
	    List<Integer> std =  (List<Integer>) session.get("sd");
	    
	    
	    
	    
	    
		System.out.println();
		System.out.println(std.get(0));
		System.out.println();
		
		
		
		
		List<Sinfo> sinfos = sxinxiService.getSinfo(std.get(0));
		HttpServletRequest request = ServletActionContext.getRequest();
		if(sinfos.size()==0)
		{
			
			sxinxiService.addXinSID(std.get(0));
			List<Sinfo> sinfos1 =sxinxiService.getSinfo(std.get(0));
			request.setAttribute("sx", sinfos1.get(0).getSxueyuan());
			request.setAttribute("sp", sinfos1.get(0).getSphone());
			request.setAttribute("sz",sinfos1.get(0).getSzhuanye());
			request.setAttribute("sxh",sinfos1.get(0).getSxuehao() );
			request.setAttribute("sna",session.get("sn"));
			request.setAttribute("spa", session.get("sp"));
			
			
			
		}else{
			request.setAttribute("sx", sinfos.get(0).getSxueyuan());
			request.setAttribute("sp", sinfos.get(0).getSphone());
			request.setAttribute("sz",sinfos.get(0).getSzhuanye());
			request.setAttribute("sxh",sinfos.get(0).getSxuehao() );
			request.setAttribute("sna",session.get("sn"));
			request.setAttribute("spa", session.get("sp"));
		}
		

		
		
		
		System.out.println(sinfos);
		
		
	
		return "success";
	}
	
	public String changeInfo()
	{
		HttpServletRequest request = ServletActionContext.getRequest();
		
		
		List<Integer> Sid = (List<Integer>) session.get("sd");
		
		sxinxiService.UpdateSinfo(request.getParameter("newxy"), request.getParameter("newzy"), request.getParameter("newph"), request.getParameter("newxh"),Sid.get(0));
		
		
		return "success";
	}
	

}
