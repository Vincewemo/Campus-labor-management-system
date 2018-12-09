package jiemian.Dao;

import java.util.List;

import jiemian.entities.BandSre;
import jiemian.entities.BorrowT;
import jiemian.entities.Sdback;
import jiemian.entities.Tool;

public interface ToolDao {
	
	
	
	
	public List<Tool> findAllTools();
	
	public List<BorrowT> findAllBorrowT();
	
	public List<BandSre> findAllBandSre();
	
	public boolean isBorrow(String name,String gongjuname);
	
	public boolean isSendBack(String name,String gongjuname);
	
	public boolean isyouTool(String bname);
	
    public boolean naijiu(String gjname);
	
	public void BorrowTools(String name,String gongjuname);
	
	public void SendBackTools(String name,String gongjuname);
	
	public void SendBackToolsBorrow(String name,String gongjuname);
	
	public void AddSendBackTools(String name,String gongjuname);
	
	public List<BorrowT> findBorrowinfo(String name);
	
	public List<Sdback> findSendBackInfo(String name);
	
	public void AddTools(String toolname);
	
	public void ChangeWear(String toolname,String wString);
	
	public boolean isBandS(String name);
	
	public void addBandS(String name);
	
	
	public int BorrowCount(String name);
	
	public void addBandScount(String name,String count);
	
	
	
	
	
	

}
