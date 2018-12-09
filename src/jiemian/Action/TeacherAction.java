package jiemian.Action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import jiemian.Dao.SmarkDao;
import jiemian.Dao.zhuyuanDao;
import jiemian.entities.CQrecord;
import jiemian.entities.ChooseZY;
import jiemian.entities.ZYtongjifen;
import jiemian.entities.chuqin;

@Repository("teacheraction")
@Scope("prototype")
public class TeacherAction {
	
	
	@Autowired
	SmarkDao smarkDao;
	
	
	@Autowired
	zhuyuanDao zhuyuanDao;
	
	public String chachuqin()
	{
		HttpServletRequest request = ServletActionContext.getRequest();
		List<CQrecord> cqlll = smarkDao.findAllchuqin();
		
		if(cqlll.size()!=0)
		{
			request.setAttribute("cql", cqlll);
			return "success";
		}
		return "no";
		
	}
	
	
	public String chagrade()
	{
		
		HttpServletRequest request = ServletActionContext.getRequest();
		
		List<chuqin> qlc = smarkDao.findAllCQ();
		
		if(qlc.size()!=0)
		{
			List<String> ssname = new ArrayList<String>();
			
			
			for(int i = 0;i<qlc.size();i++)
		    {
				String string = qlc.get(i).getName();
				System.out.println(string);
			}
			System.out.println();
			for(String sss : ssname)
			{
				System.out.println(sss);
			}
			
			
			request.setAttribute("qlcname", ssname);
			request.setAttribute("qqllcc", qlc);
			return "success";
		}
		return "no";
		
	}
	
	
	
	 public String Xzyfen()
	 {
		 
		 HttpServletRequest request = ServletActionContext.getRequest();
		 
		 List<ChooseZY> tclz = zhuyuanDao.findAllxueshengzy();
		 List<ZYtongjifen> zytf = zhuyuanDao.findAllzyjifen();
		 int i = 0;
		 //有没有学生参加志愿劳动
		 if(tclz.isEmpty())
		 return "nozys";
		 
		 //将参加志愿劳动的学生分数全部初始化为0
		 for(ChooseZY cZy : tclz)
		 {
			System.out.println("这个执行了吗");
			 if(zhuyuanDao.jifenyou(cZy.getName())==false)
				 zhuyuanDao.jiZYfen(cZy.getName(), "0");
			 
			 
		 }
		 
		 
		 //判断参加志愿劳动的学生 的核实信息是否为 '核实'
		 //如果为'核实' 查出参加的志愿记录并积分
		 //参加志愿大于4条以上都为20分
		 for(ZYtongjifen zyongji : zytf)
		 {
			 System.out.println("我执行了吗");
			 if(zhuyuanDao.shifouheshi(zyongji.getName()) == true)
			 {
				  i=zhuyuanDao.canjiaInfo(zyongji.getName()).size();
				  
				   if(i==0)
				   {
					   zhuyuanDao.GjiZYfen(zyongji.getName(), i*5+"");
				   }else if(i==1)
				   {
					   zhuyuanDao.GjiZYfen(zyongji.getName(), i*5+"");
				   }else if(i==2)
				   {
					   zhuyuanDao.GjiZYfen(zyongji.getName(), i*5+"");
				   }else if(i==3)
				   {
					   zhuyuanDao.GjiZYfen(zyongji.getName(), i*5+"");
				   }else if(i==4)
				   {
					   zhuyuanDao.GjiZYfen(zyongji.getName(), i*5+"");
				   }
				   else if(i>=5)
				   {
					   zhuyuanDao.GjiZYfen(zyongji.getName(), i*5+"");
				   }
			       }
			   else{
				      zhuyuanDao.GjiZYfen(zyongji.getName(), "0");
			        }
			 }
		 
		 
		 request.setAttribute("zyt", zytf);
		 
		 return "success";
		 
		 }
		 
	 
		 


}
