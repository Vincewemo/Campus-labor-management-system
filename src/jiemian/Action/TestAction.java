package jiemian.Action;

import java.util.Date;
import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.util.ValueStack;

@Repository(value="testaction")
@Scope("prototype")
public class TestAction {
	
	
	
	
	Date d = new Date();
	
	public String execute(){
		
		
		
		
		
		
//		
//		ActionContext ac = ActionContext.getContext();
//		
//		Map<String, Object> acMap = ac.getApplication();
//		acMap.put("applicationKey", d.getTime());
//		acMap.put("some", "string");
		
		System.out.println("hellooooo");
		
		
	
		return "success";
	}


}
