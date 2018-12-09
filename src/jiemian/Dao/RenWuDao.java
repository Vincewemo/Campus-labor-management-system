package jiemian.Dao;

import java.util.List;

import jiemian.entities.RenWu;

public interface RenWuDao {
	
	public List<RenWu> findallRenwu();
	public List findXYRW(String xueyuanmingcheng);
	public List xiugairenwu(String xueyuanmingcheng,String renwumingcheng);
	public List chaAllrenwu();

	public void addnewRwinfo(String xueyuan,String zhuanye,String banji,String renwu);
	
}
