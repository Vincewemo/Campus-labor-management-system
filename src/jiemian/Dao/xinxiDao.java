package jiemian.Dao;

import java.util.List;

import jiemian.entities.Tinfo;
import jiemian.entities.Tuser;

public interface xinxiDao {
	

	public List<Integer> findTeacherID(String Tname);
	public List<Tinfo> Txinxi(int id);
	public void updateInfo(String newxueyuan,String newzhuanye,String newphone,String newzhicheng,int id);
	public void addXinID(int xinid);

}
