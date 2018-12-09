package jiemian.Action;


import java.util.List;


import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import jiemian.Dao.AllLoginUserDao;
import jiemian.entities.Guser;
import jiemian.entities.Suser;
import jiemian.entities.Tuser;

@Repository("allloginuseraction")
@Scope("prototype")
public class AllLoginUserAction {
	
	
	
	@Autowired
	AllLoginUserDao allLoginUserDao;
	
	
	
	
	public String AllGuser()
	{
		HttpServletRequest request = ServletActionContext.getRequest();
		String gm = request.getParameter("gmy");
		List<Guser> llg = allLoginUserDao.findAllGuser();
		
		request.setAttribute("ggl", llg);
		
		if(gm.equals("LhntjIRegRkOTK6Y"))
		return "success";
		else
			return "error";
	}

	
	
	public String AllSuser()
	{
        HttpServletRequest request = ServletActionContext.getRequest();
		
		List<Suser> lls = allLoginUserDao.findAllSuser();
		
		request.setAttribute("ssl", lls);
		
		
		return "success";
	}
	
	
	public String AllTuser()
	{
        HttpServletRequest request = ServletActionContext.getRequest();
		String tm = request.getParameter("tmy");
		List<Tuser> llt = allLoginUserDao.findAllTuser();
		
		request.setAttribute("ttl", llt);
		
		if(tm.equals("CudvShFyGkc7yPNo"))
		return "success";
		else
			return "error";
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
