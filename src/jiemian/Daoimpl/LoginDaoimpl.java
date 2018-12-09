package jiemian.Daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jiemian.Dao.LoginDao;
import jiemian.entities.Guser;
import jiemian.entities.Suser;
import jiemian.entities.Tuser;



@Repository
public class LoginDaoimpl implements LoginDao {

	
	@Autowired
	private SessionFactory sessionfactory;
	
	private Session getSession(){
		return sessionfactory.getCurrentSession();
	}
	
	
	@Override
	public boolean findjiaoshi(String jsuser, String jspassword) {
		
		boolean istp = false;
		String hql1 = "FROM Tuser WHERE Tusername = ?";
		
		Query query = getSession().createQuery(hql1).setString(0, jsuser);
		List<Tuser> tuser = query.list();
		
		if(tuser.size()!=0){
		    for(Tuser tea:tuser)
		    {
			 
		     istp = tea.getTuserpassword().equals(jspassword);	
		     if(istp==true)
		    	 break;
		     
		    }
		}
		
		if(istp==true&&tuser!=null)
		{
			return true;
		}
		
		return false;
	}


	@Override
	public boolean findgly(String jsuser, String jspassword) {
		boolean isGp = false;
		
		String hql = "FROM Guser WHERE Gusername = ?";
		
		Query query = getSession().createQuery(hql).setString(0, jsuser);
		
		List<Guser> lg = query.list();
		
		for(Guser g:lg)
		{
			isGp = g.getGpassword().equals(jspassword);
			System.out.println(g.getGusername()+"   "+g.getGpassword());
		}
		if(isGp==true&&lg!=null)
		{
			return true;
		}
		
		return false;
	}


	@Override
	public boolean findxs(String Ssuser, String Spassword) {
	     boolean isSp = false;
		
		String hql = "FROM Suser WHERE Susername = ?";
		
		Query query = getSession().createQuery(hql).setString(0, Ssuser);
		
		List<Suser> ls = query.list();
		
		for(Suser s:ls)
		{
			isSp = s.getSuserpassword().equals(Spassword);
		}
		if(isSp==true&&ls!=null)
			return true;
		
		
		return false;
		
	}


	

}
