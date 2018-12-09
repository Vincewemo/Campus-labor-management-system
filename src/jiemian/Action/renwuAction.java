package jiemian.Action;

import java.util.ArrayList;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import jiemian.Service.RenwuZSGC;
import jiemian.entities.RenWu;
import jiemian.entities.specificRw;
//import jiemian.entities.xueyuanName;
import jiemian.entities.xueyuanname;


@Repository("renwuaction")
@Scope("prototype")
public class renwuAction {

	
    @Autowired
	RenwuZSGC renwuZSGC;
	
    String[] rwpp = {"公寓清洁","图书馆清洁","街道清洁","早操区域清洁"
    		,"商服楼清洁"
    };
	
    
    
    public String execute()
    {
    	
    	
    List xianshirenwu =	renwuZSGC.findAllrenwu();
    	
    	HttpServletRequest request = ServletActionContext.getRequest();
    	
    	request.setAttribute("rnw", xianshirenwu);
    	
    	
    	return "success";
    }
	
    
    public String cha(){
    	
    	HttpServletRequest req = ServletActionContext.getRequest();
        String rwName =(String)req.getParameter("title");
        
        System.out.println(rwName);
        List<RenWu> brwName  = renwuZSGC.findrenwu(rwName);
    	
        if(brwName.size()!=0)
        {
        	req.setAttribute("brw", brwName);
        	System.out.println(brwName);
        	return "ok";
        }else{
        	return "notok";
        	
        }
    	
    	
    }
 public String chaBanJi(){
    	
    	HttpServletRequest req = ServletActionContext.getRequest();
         String bj = req.getParameter("banji");
         List<RenWu> lrw = renwuZSGC.findAllrenwu();
         
         for(RenWu rw :lrw)
         {
        	 if(bj.equals(rw.getBanji()))
        	 {
        		 
        		 req.setAttribute("llrw", rw.getRenwu());
        		 return "zdBanji";
        	 } 
         }
    	return "mzdBanji";
    	
    }
    
    
    public String xiu(){
    	
    	HttpServletRequest req = ServletActionContext.getRequest();
    	
    	String xy = req.getParameter("XUEYUAN");
    	String rw = req.getParameter("RENWU");
    	
    	List<RenWu> renwu = renwuZSGC.xiugrw(xy, rw);
    	
    	if(renwu.size()!=0)
    	{
    		req.setAttribute("zhihou", renwu);
    		return "nice";
    	}
    	
    	return "nonice";
    	
    }
    
    
    public String PureRw(){
    	
    	List<specificRw> sll = renwuZSGC.pureRw();
    	
    	if(sll==null)
    	{
    		return "myou";
    	}
    	HttpServletRequest request = ServletActionContext.getRequest();
    	
    	request.setAttribute("slll", sll);
    	return "you";
    	
    }
    
    public String renyuan()
    {
    	int i = 0;
    	List<RenWu> LRenwus = renwuZSGC.findAllrenwu();
    	
    	HttpServletRequest request = ServletActionContext.getRequest();
    	
    	Set<xueyuanname> sname = new HashSet<xueyuanname>();
    	Set<String> sname1 = new HashSet<String>();
    	
    	
//    	
    	List<RenWu> llRenWus = new ArrayList<RenWu>();
    	
//    	List<Integer> li = new ArrayList<Integer>();
    	
    	for(Iterator iterator = LRenwus.iterator();iterator.hasNext();)
    	{
    		RenWu rw = (RenWu)iterator.next();
    		
    		sname1.add(rw.getXueyuan());
    		
    		llRenWus.add(rw);
    		
    	}
    
    	i = llRenWus.size();
    	
    	
    	
    	
    	
    	for(String str:sname1)
    	{
    		xueyuanname xyn = new xueyuanname();
    		xyn.setXname(str);
    		int i1 = 0;
    		for(RenWu rrrrn : LRenwus)
    		{
    			if(str.equals(rrrrn.getXueyuan()))
    				xyn.setBanjishu(++i1);
    		}
    		sname.add(xyn);
    	}
    	
    	
    	for(xueyuanname xxss : sname)
    		System.out.println(xxss.getBanjishu());
    	
    	
    	
    	
//    	System.out.println(sname.size());
    	
    	request.setAttribute("sss", sname);
    	
    	
    	
    	
   
//    	for(String renWu : sname)
//    		System.out.println(renWu);
        System.out.println(i);
       
     
    	
    	return "success";
    }
    
	
    
    public String banjishu(){
    	
    	HttpServletRequest request = ServletActionContext.getRequest();
    	
    	renwuZSGC.addRwinfo(request.getParameter("xxy"),request.getParameter("xzy"), request.getParameter("xbj"), request.getParameter("xrw"));
    	
    	
    	
    	
    	
    
    	return "success";
    	
    }
    
    
    
    
    
    
    
    
    
    
	
	
}
