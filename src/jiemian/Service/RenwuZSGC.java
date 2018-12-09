package jiemian.Service;

import java.util.List;

import jiemian.entities.RenWu;
import jiemian.entities.specificRw;

public interface RenwuZSGC {
	
	
	
	public List findAllrenwu();
	public List<RenWu> findrenwu(String xueyuan);
	public List<RenWu> xiugrw(String xymc,String rwmc);
	public List<specificRw> pureRw();
	
	
	public void addRwinfo(String xueyuan,String zhuanye,String banji,String renwu);

}
