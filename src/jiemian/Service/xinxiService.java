package jiemian.Service;

import java.util.List;

import jiemian.entities.Tinfo;

public interface xinxiService {

	
	
	public List<Integer> getTid(String tname);
	public List<Tinfo> getTinfo(int Tid);
	public void UpdateTinfo(String newxueyuan, String newzhuanye, String newphone, String newzhicheng,int id);
	public void addXinID(int xinid);
}
