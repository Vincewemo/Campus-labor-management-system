package jiemian.Serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jiemian.Dao.SmarkDao;
import jiemian.Service.SmarkService;
import jiemian.entities.CQrecord;




@Service
public class SmarkServiceimpl implements SmarkService {

	
	
	@Autowired
	SmarkDao smarkdao;
	
	
	
	@Override
	public List<CQrecord> findQDinfo(String ssname) {
		List<CQrecord> ccll = smarkdao.findRecord(ssname);
		return ccll;
	}



	@Override
	public List<CQrecord> findAllinfo() {
		
		List<CQrecord> cql = smarkdao.findAllchuqin();
		if(cql.isEmpty())
		{
			return null;
		}
		return cql;
	}



	@Override
	public void AddXchuqin(String snname) {
		smarkdao.addchuqin(snname);
		
	}



	@Override
	public boolean findchuqin(String name) {
		return smarkdao.findchuqin(name);
	}

}
