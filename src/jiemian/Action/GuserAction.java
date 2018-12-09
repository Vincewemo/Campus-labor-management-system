package jiemian.Action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.opensymphony.xwork2.ActionContext;

import jiemian.Dao.SmarkDao;
import jiemian.Service.SmarkService;
import jiemian.entities.CQrecord;
import jiemian.entities.chuqin;

@Repository("guseraction")
@Scope("prototype")
public class GuserAction {
	
	@Autowired
	SmarkService smarkService;
	
	
	@Autowired
	SmarkDao smarkDao;
	
	
	public String AllMark()
	{
		
		HttpServletRequest request = ServletActionContext.getRequest();
		
		List<CQrecord> ccqq = smarkService.findAllinfo();
		
		if(ccqq.isEmpty())
		{
			return "eor";
		}
		
		
	
		
		
		request.setAttribute("cq", ccqq);
		
		
		
		
		return "success";
	}
	
	
	
	
	public String markCHUQIN()
	{
		ActionContext actionContext = ActionContext.getContext();
		Map Session = actionContext.getSession();
		
		HttpServletRequest request = ServletActionContext.getRequest();
		List<CQrecord> ccqq = smarkService.findAllinfo();
		List<chuqin> hq = smarkDao.findAllCQ();
		request.setAttribute("qdxs", hq);
	     
	    if(hq.isEmpty()){
			for(CQrecord cQrecord : ccqq)
			{
			    
			    int ccount = 0;
			    smarkDao.addchuqin(cQrecord.getSxingming());
			    if(cQrecord.getMonday().equals("签到"))
			    	ccount++;
			    if(cQrecord.getTuesday().equals("签到"))
			    	ccount++;
			    if(cQrecord.getWednesday().equals("签到"))
			    	ccount++;
			    if(cQrecord.getThursday().equals("签到"))
			    	ccount++;
			    if(cQrecord.getFriday().equals("签到"))
			    	ccount++;
			    String count = ccount+"";
			    System.out.println(count);
			    smarkDao.addCcount(count, cQrecord.getSxingming());
			   
		    }
			request.setAttribute("qdxs", hq);
	    }else{
	    	
	    	for(CQrecord cQrecord : ccqq)
			{
			    
			    int ccount = 0;
			    boolean isyou = false;
			    
			    if(smarkDao.findchuqin(cQrecord.getSxingming())==false){
			    	 smarkDao.addchuqin(cQrecord.getSxingming());
			    
			    
			    if(cQrecord.getMonday().equals("签到"))
			    	ccount++;
			    if(cQrecord.getTuesday().equals("签到"))
			    	ccount++;
			    if(cQrecord.getWednesday().equals("签到"))
			    	ccount++;
			    if(cQrecord.getThursday().equals("签到"))
			    	ccount++;
			    if(cQrecord.getFriday().equals("签到"))
			    	ccount++;
			    String count = ccount+"";
			    System.out.println(count);
			    smarkDao.addCcount(count, cQrecord.getSxingming());
			    }
		    }
//	    	request.setAttribute("qdxs", hq);
	    }
	    
	    	
		for(CQrecord cQrecord : ccqq)
		{
		    
		    int ccount = 0;
		    boolean isyou = false;
		    
		    
		    if(cQrecord.getMonday().equals("签到"))
		    	ccount++;
		    if(cQrecord.getTuesday().equals("签到"))
		    	ccount++;
		    if(cQrecord.getWednesday().equals("签到"))
		    	ccount++;
		    if(cQrecord.getThursday().equals("签到"))
		    	ccount++;
		    if(cQrecord.getFriday().equals("签到"))
		    	ccount++;
		    String count = ccount+"";
		    System.out.println(count);
		    smarkDao.addCcount(count, cQrecord.getSxingming());
		    }
	    
		request.setAttribute("qdxs", hq);
	
//		
//		System.out.println(hq.size());
		
//		for(CQrecord cqccc : ccqq)
//		{
//			int count = 0;
//			if(cqccc.getMonday().equals("签到"))
//			{
//				count++;
//			}
//			if(cqccc.getTuesday().equals("签到"))
//			{
//				count++;
//			}
//			if(cqccc.getWednesday().equals("签到"))
//			{
//				count++;
//			}
//			if(cqccc.getThursday().equals("签到"))
//			{
//				count++;
//			}
//			if(cqccc.getFriday().equals("签到"))
//			{
//				count++;
//			}
//			System.out.println(count);
//			smarkDao.addCcount(count, cqccc.getSxingming());
//			
//		}
		
		
		
		
		
		return "success";
	}
//	public String charuXhao()
//	{
//		List<chuqin> hq = smarkDao.findAllCQ();
//		
//		for(chuqin hhq : hq)
//		{
//			
//			 smarkDao.chaXH(hhq.getChuqinID(), hhq.getBanjihao());
//		
//			
//			
//		}
		
//		
//		return "success";
//	}
//	
	
	public String jifen()
	{
		
		HttpServletRequest request = ServletActionContext.getRequest();
		List<chuqin> cclla = smarkDao.findAllCQ();
		
		
		for(chuqin cq : cclla)
		{
			String name = cq.getName();
			String cqcishu = cq.getChuqinCount();
			if(cqcishu.equals("0"))
			{
			  smarkDao.addGrade("0", name);
			}
			if(cqcishu.equals("1"))
			{
			  smarkDao.addGrade("10", name);
			}
			if(cqcishu.equals("2"))
			{
			  smarkDao.addGrade("20", name);
			}
			if(cqcishu.equals("3"))
			{
			  smarkDao.addGrade("30", name);
			}
			if(cqcishu.equals("4"))
			{
			  smarkDao.addGrade("40", name);
			}
			if(cqcishu.equals("5"))
			{
			  smarkDao.addGrade("50", name);
			}
		}
		
		request.setAttribute("xinqc", cclla);
		
		
		return "success";
	}
	

}
