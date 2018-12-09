package jiemian.Action;

import static org.hamcrest.CoreMatchers.nullValue;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import jiemian.Service.LoginService;
import jiemian.Service.RegisterService;

@Repository("registeraction")
@Scope("prototype")
public class registerAction {

	
	
	@Autowired
	RegisterService registerService;
	@Autowired
	LoginService loginService;
	
	
	public String Tzhuce()
	{
		boolean Tymy = false;
		boolean Tismiyao = false;
		HttpServletRequest request = ServletActionContext.getRequest();
		
		String Ntn = (String)request.getParameter("Tn");
		String Ntp = (String)request.getParameter("Tp");
		String Nmiyao = (String)request.getParameter("Tm");
		Tismiyao = registerService.guanliyuanmiyao(Nmiyao);
		
		Tymy = registerService.zhaolaoshi(Ntn);
		
		System.out.println(Ntn);
		System.out.println(Ntp);
		if(Ntn!=null&&Ntp!=null&&Tymy==false&&Tismiyao==true){
			
			registerService.jiaoshizhuce(Ntn, Ntp);
			return "tchenggong";
		}
		
		
		
		
		return "tshibai";
	}
	
	

	public String Szhuce()
	{
		boolean Symy = false;
		HttpServletRequest request = ServletActionContext.getRequest();
		
		String Ntn = (String)request.getParameter("Sn");
		String Ntp = (String)request.getParameter("Sp");
		
		Symy = registerService.zhaoxuesheng(Ntn);
		
		System.out.println(Ntn);
		System.out.println(Ntp);
		if(Ntn!=null&&Ntp!=null&&Symy==false){
			
			registerService.xueshengzhuce(Ntn, Ntp);
			return "schenggong";
		}
		
		
		
		
		return "sshibai";
	}
	
	
	
	

	public String Azhuce()
	{
		boolean Aymy = false;
		boolean ismiyao = false;
		HttpServletRequest request = ServletActionContext.getRequest();
		
		String Ntn = (String)request.getParameter("An");
		String Ntp = (String)request.getParameter("Ap");
		String Nmy = (String)request.getParameter("Am");
		
		Aymy = registerService.zhaoguanli(Ntn);
		ismiyao = registerService.guanliyuanmiyao(Nmy);
		
		System.out.println(Ntn);
		System.out.println(Ntp);
		if(Ntn!=null&&Ntp!=null&&Aymy==false&&ismiyao==true&&Nmy.equals("LhntjIRegRkOTK6Y")){
			
			registerService.guanliyuanzhuce(Ntn, Ntp);
			return "achenggong";
		}
		
		
		
		
		return "ashibai";
	}
	
	
}
