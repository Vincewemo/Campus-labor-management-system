package jiemian.Serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jiemian.Dao.RenWuDao;
import jiemian.Service.RenwuZSGC;
import jiemian.entities.RenWu;
import jiemian.entities.specificRw;



@Service
public class RenwuZSGCImpl implements RenwuZSGC {

	
	@Autowired
	RenWuDao renWuDao;
	
	
	public List<RenWu> findAllrenwu() {
		
		
		return renWuDao.findallRenwu();
	}


	@Override
	public List<RenWu> findrenwu(String xueyuan) {

		return renWuDao.findXYRW(xueyuan);

	
	}


	@Override
	public List<RenWu> xiugrw(String xymc, String rwmc) {
		
		
		return renWuDao.xiugairenwu(xymc, rwmc);
	}


	@Override
	public List<specificRw> pureRw() {
		
		return renWuDao.chaAllrenwu();
	}


	@Override
	public void addRwinfo(String xueyuan, String zhuanye, String banji, String renwu) {
		renWuDao.addnewRwinfo(xueyuan, zhuanye, banji, renwu);
		
	}

}
