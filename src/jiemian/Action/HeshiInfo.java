package jiemian.Action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.opensymphony.xwork2.ActionContext;

import jiemian.Dao.SmarkDao;
import jiemian.Dao.zhuyuanDao;
import jiemian.entities.ChooseZY;
import jiemian.entities.chuqin;

@Repository("heshiInfo")
@Scope("prototype")
public class HeshiInfo {

	
	@Autowired
	SmarkDao smarkDao;
	
	@Autowired
	zhuyuanDao zhuyuanDao;
	
	public String HeshiXinxi()
	{
		HttpServletRequest request = ServletActionContext.getRequest();
		
		String name = request.getParameter("xm");
		String heshi = request.getParameter("hs");
		
		
		if(name==null||heshi==null)
		{
			return "notok";
		}
		
		
		if(heshi.equals("核实")){
	       smarkDao.charuHeshi(name, heshi);
		
	       return "success";
		}
		
		return "notok";
	}
	
	
	
	public  String AllSzyInfo()
	{
		HttpServletRequest request = ServletActionContext.getRequest();
		
		List<ChooseZY> ccclh = zhuyuanDao.findAllxueshengzy();
		
		
		request.setAttribute("clh", ccclh);
		
		
		
		
		return "success";
	}
	
	
	
	
	
	public String HZYXinxi()
	{
		
		HttpServletRequest request = ServletActionContext.getRequest();
        String zsname = request.getParameter("zxm");
        String zsheshi = request.getParameter("zhs");
        
        
        //查有没有这个学生
        if(zhuyuanDao.youwuXZinfo(zsname)==false)
        {
        	return "nos";
        }
        
        
        
        
        //插入'核实'字符
        if(zsheshi.equals("核实"))
        {
        	//更新学生出勤次数
        	//更新学生分数
        	zhuyuanDao.Cheshi(zsname);
            return "success";        	
        }
        else
        	return "nos";
        
        
		
		
	}
	
	
	
	
	
	
	
	
}
