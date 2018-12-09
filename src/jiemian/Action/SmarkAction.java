package jiemian.Action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.opensymphony.xwork2.ActionContext;

import jiemian.Service.SmarkService;
import jiemian.entities.CQrecord;

@Repository("smarkaction")
@Scope("prototype")
public class SmarkAction {
	
	
	@Autowired
	SmarkService smarkService;
	
	
	
	
	public String findQDinfo()
	{
		
		ActionContext actionContext = ActionContext.getContext();
		Map session = actionContext.getSession();
		
		String sn = (String) session.get("sn");
		List<CQrecord> lc = smarkService.findQDinfo(sn);
		
		HttpServletRequest request = ServletActionContext.getRequest();
		
		request.setAttribute("llc", lc);
		
		
		
		
		
		
		return "ok";
	}

}
