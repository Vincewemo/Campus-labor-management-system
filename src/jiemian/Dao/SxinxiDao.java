package jiemian.Dao;

import java.util.List;

import jiemian.entities.Sinfo;



public interface SxinxiDao {
	public List<Integer> findStudentID(String Sname);
	public List<Sinfo> Sxinxi(int sid);
	public void updatesInfo(String newSxueyuan,String newSzhuanye,String newSphone,String newSxuehao,int sid);
	public void addXinsID(int xinsid);
}
