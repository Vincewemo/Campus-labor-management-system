package jiemian.Serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jiemian.Dao.markDao;
import jiemian.Service.markService;



@Service
//@Transactional
public class markServiceImpl implements markService {

	
	
	@Autowired
	markDao markdao;
	
	@Override
	public boolean findX(String sname) {
		
		return markdao.findXS(sname);
	}

	@Override
	public void addXinfo(int id,String sname) {

		markdao.addXsinfo(id, sname);
	}

	@Override
	public int findXid(String name) {
		return markdao.findXid(name);
		
	}

	@Override
	public void _1qd(int id, String qd) {
		markdao.cun1(id, qd);
		
	}

	@Override
	public void _2qd(int id, String qd) {
		markdao.cun2(id, qd);
		
	}

	@Override
	public void _3qd(int id, String qd) {
		markdao.cun3(id, qd);
		
	}

	@Override
	public void _4qd(int id, String qd) {
		markdao.cun4(id, qd);
		
	}

	@Override
	public void _5qd(int id, String qd) {
		markdao.cun5(id, qd);
		
	}

}
