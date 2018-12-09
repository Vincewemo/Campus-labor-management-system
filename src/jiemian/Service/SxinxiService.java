package jiemian.Service;

import java.util.List;

import jiemian.entities.Sinfo;



public interface SxinxiService {

	
	public List<Integer> getsid(String Sname);
	public List<Sinfo> getSinfo(int Sid);
	public void UpdateSinfo(String newSxueyuan, String newSzhuanye, String newSphone, String newSxuehao,int Sid);
	public void addXinSID(int xinSid);
}
