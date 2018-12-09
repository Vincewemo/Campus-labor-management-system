package jiemian.Dao;

import java.util.List;

import jiemian.entities.ChooseZY;
import jiemian.entities.ZYtongjifen;
import jiemian.entities.zhiyuan;

public interface zhuyuanDao {

	
	public List<zhiyuan> findallzhiyuan();
	
	public List<ChooseZY> findAllxueshengzy();
	
	public List<ZYtongjifen> findAllzyjifen();
	
	public boolean jifenyou(String name);
	
	public boolean shifouheshi(String name);
	
	public void xuanzezhiyuan(String zname,String name);
	
	public List<ChooseZY> canjiaInfo(String name);
	
	public void dropinfo(String name,String zname);
	
	public void addXinzhiyuan(String zzname,String bh);
	
	
	public boolean youwuXZinfo(String name);
	
	public void Cheshi(String name);
	
	public void jiZYfen(String name,String fen);
	public void GjiZYfen(String name, String fen);
	
}
