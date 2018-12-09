package jiemian.Dao;

import java.util.List;

import jiemian.entities.Suser;

public interface LoginDao {
	
	
	
	
	public boolean findjiaoshi(String jsuser,String jspassword);
	public boolean findgly(String jsuser,String jspassword);
	public boolean findxs(String Ssuser,String Sspassword);
  
}
