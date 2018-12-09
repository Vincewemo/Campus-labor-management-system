package jiemian.Serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jiemian.Dao.LoginDao;
import jiemian.Service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	
	@Autowired
	LoginDao logindao;
	
	
	@Override
	public boolean jiaoshidenglu(String jiaoshim, String jiaoship) {
	
		boolean denglu = logindao.findjiaoshi(jiaoshim, jiaoship);
		
		
		return denglu;
	}


	@Override
	public boolean guanliyuandenglu(String glyn, String glyp) {
		boolean Gdenglu = logindao.findgly(glyn, glyp);
		return Gdenglu;
	}


	@Override
	public boolean xueshengdenglu(String xueshengn, String xueshengp) {
		boolean Sdenglu = logindao.findxs(xueshengn, xueshengp);
		return Sdenglu;
	}

}
