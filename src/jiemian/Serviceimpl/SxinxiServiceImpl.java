package jiemian.Serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jiemian.Dao.SxinxiDao;
import jiemian.Service.SxinxiService;
import jiemian.entities.Sinfo;


@Service
public class SxinxiServiceImpl implements SxinxiService {

	
	@Autowired
	SxinxiDao sxinidao;
	
	
	
	@Override
	public List<Integer> getsid(String Sname) {
		List<Integer> sli = sxinidao.findStudentID(Sname);
		return sli;
	}

	@Override
	public List<Sinfo> getSinfo(int Sid) {
		List<Sinfo> sList = sxinidao.Sxinxi(Sid);
		return sList;
	}

	@Override
	public void UpdateSinfo(String newSxueyuan, String newSzhuanye, String newSphone, String newSxuehao, int Sid) {
		sxinidao.updatesInfo(newSxueyuan, newSzhuanye, newSphone, newSxuehao, Sid);

	}

	@Override
	public void addXinSID(int xinSid) {
		sxinidao.addXinsID(xinSid);

	}

}
