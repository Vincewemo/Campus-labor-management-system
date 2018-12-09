package jiemian.Dao;

import java.util.List;

import jiemian.entities.Tuser;

public interface RegisterDao {
	
	
	
	
	public void AddT(String tname,String tpassword);
	public boolean chaT(String tname);
	
	
	public void AddS(String sname,String spassword);
	public boolean chaS(String sname);
	
	public void AddA(String aname,String apassword);
	public boolean chaA(String aname);
	public boolean writeMY(String some);
	

}
