package jiemian.Action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.opensymphony.xwork2.ActionContext;
import com.sun.xml.internal.ws.policy.EffectiveAlternativeSelector;

import jiemian.Service.xinxiService;
import jiemian.entities.Tinfo;
import sun.net.www.http.HttpCaptureOutputStream;

@Repository("xinxiaction")
@Scope("prototype")
public class XinxiAction {

	
	@Autowired
	xinxiService xinxiService;
	
	ActionContext actionContext = ActionContext.getContext();
	Map session = actionContext.getSession();
	
	public String getTinfo()
	{
		
	    List<Integer> ttd =  (List<Integer>) session.get("td");
	    
	    
	    
	    
	    
		System.out.println();
		System.out.println(ttd.get(0));
		System.out.println();
		
		
		
		
		List<Tinfo> tinfos = xinxiService.getTinfo(ttd.get(0));
		HttpServletRequest request = ServletActionContext.getRequest();
		if(tinfos.size()==0)
		{
			
			xinxiService.addXinID(ttd.get(0));
			List<Tinfo> tinfos1 = xinxiService.getTinfo(ttd.get(0));
			request.setAttribute("tx", tinfos1.get(0).getTxueyuan());
			request.setAttribute("tp", tinfos1.get(0).getTphone());
			request.setAttribute("tz", tinfos1.get(0).getTzhuanye());
			request.setAttribute("tzh", tinfos1.get(0).getTzhicheng());
			request.setAttribute("tna",session.get("tn"));
			request.setAttribute("tpa", session.get("tp"));
			
			
			
		}else{
			request.setAttribute("tx", tinfos.get(0).getTxueyuan());
			request.setAttribute("tp", tinfos.get(0).getTphone());
			request.setAttribute("tz", tinfos.get(0).getTzhuanye());
			request.setAttribute("tzh", tinfos.get(0).getTzhicheng());
			request.setAttribute("tna",session.get("tn"));
			request.setAttribute("tpa", session.get("tp"));
		}
		

		
		
		
		System.out.println(tinfos);
		
		
	
		return "success";
	}
	
	public String changeInfo()
	{
		HttpServletRequest request = ServletActionContext.getRequest();
		
		
		List<Integer> Tid = (List<Integer>) session.get("td");
		
		xinxiService.UpdateTinfo(request.getParameter("newxy"), request.getParameter("newzy"), request.getParameter("newph"), request.getParameter("newzc"),Tid.get(0));
		
		
		return "success";
	}
	
	
	
	
}
