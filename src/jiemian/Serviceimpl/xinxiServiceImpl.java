package jiemian.Serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jiemian.Dao.xinxiDao;
import jiemian.Service.xinxiService;
import jiemian.entities.Tinfo;

@Service
public class xinxiServiceImpl implements xinxiService {

	
	@Autowired
	xinxiDao xinxidao;
	
	
	@Override
	public List<Tinfo> getTinfo(int Tid) {
		List<Tinfo> tfl = xinxidao.Txinxi(Tid);
		return tfl;
	}


	@Override
	public List<Integer> getTid(String tname) {
		List<Integer> tid = xinxidao.findTeacherID(tname);
		return tid;
	}


	@Override
	public void UpdateTinfo(String newxueyuan, String newzhuanye, String newphone, String newzhicheng,int id) {
		xinxidao.updateInfo(newxueyuan, newzhuanye, newphone, newzhicheng,id);
		
	}


	@Override
	public void addXinID(int xinid) {
		xinxidao.addXinID(xinid);
		
	}
	

}
