package jiemian.Serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jiemian.Dao.RegisterDao;
import jiemian.Service.RegisterService;



@Service
public class RegisterServiceImpl implements RegisterService {

	
	@Autowired
	RegisterDao registerdao;
	
	
	
	@Override
	public void jiaoshizhuce(String jsm, String jsp) {
		
		registerdao.AddT(jsm, jsp);

	}



	@Override
	public boolean zhaolaoshi(String tname) {
		
		return registerdao.chaT(tname);
	}



	@Override
	public void xueshengzhuce(String sn, String sp) {
		registerdao.AddS(sn, sp);
		
	}



	@Override
	public boolean zhaoxuesheng(String snn) {
		return registerdao.chaS(snn);
	}



	@Override
	public void guanliyuanzhuce(String an, String ap) {
		
		registerdao.AddA(an, ap);
		
	}



	@Override
	public boolean zhaoguanli(String ann) {
	
		return registerdao.chaA(ann);
	}



	@Override
	public boolean guanliyuanmiyao(String some) {
		
		return registerdao.writeMY(some);
	}

}
