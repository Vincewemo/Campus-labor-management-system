package jiemian.Dao;

import java.util.List;

import jiemian.entities.qJinfo;

public interface LeaveDao {

	
	
	
       public boolean isQjingJia(String name);
       
       public void addXqjinfo(String name,String qjly);
       
       public List<qJinfo> findAllqjinfo();
       
       public List<qJinfo> findSqinfo(String name);
       
       public void chexiaoqingjia(String name);
       
       public boolean isPiZhun(String name);
       
       public void PiZhun(String name);
}
