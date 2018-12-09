package jiemian.Dao;

import java.util.List;

import jiemian.entities.CQrecord;
import jiemian.entities.chuqin;

public interface SmarkDao {

	
	
	
	
	public List<CQrecord> findRecord(String name);
	
	public List<CQrecord> findAllchuqin();
	
	public boolean findchuqin(String name);
	public void addchuqin(String name);
	
	
	public void addCcount(String count,String name);
	public void addGrade(String fen,String name);
	
	public List<chuqin> findAllCQ();
	
	public void chaXH(int id,String Xhao);
	
	public void charuHeshi(String name,String heshi);
	
}
