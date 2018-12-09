package jiemian.Daoimpl;

import java.util.List;


import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jiemian.Dao.RegisterDao;
import jiemian.entities.Suser;
import jiemian.entities.Tuser;




@Repository
public class RegisterDaoimpl implements RegisterDao {

	
	private int Tcount = 9;
	
	
	
	@Autowired
	private SessionFactory sessionfactory;
	
	
	private Session getSession()
	{
		return sessionfactory.getCurrentSession();
	}
	
	
	
	
	
	@Override
	public void AddT(String tname, String tpassword) {
	
		
		String hql = "insert into Tuser(Tusername, Tuserpassword) values(?,?)";
		
		try {
			Query query = getSession().createSQLQuery(hql);

			query.setString(0, tname);
			query.setString(1, tpassword);
			query.executeUpdate();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}





	public boolean chaT(String tn) {
		
	
		String hql = "FROM Tuser WHERE Tusername = ?";
		Query query = getSession().createQuery(hql).setString(0, tn);
		
		if(query.list().size()!=0)
		{
			return true;
		}
		
		
		return false;
	}





	@Override
	public void AddS(String sname, String spassword) {
		String sql = "insert into Suser(Susername,Suserpassword) values(?,?)";
		
		try {
			getSession().createSQLQuery(sql).setString(0, sname).setString(1, spassword).executeUpdate();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}





	@Override
	public boolean chaS(String sname) {
	
		String hql = "FROM Suser WHERE Susername = ?";
		Query query = getSession().createQuery(hql).setString(0, sname);
		
		if(query.list().size()!=0)
		{
			return true;
		}
		
		
		
		
		
		return false;
	}





	@Override
	public void AddA(String aname, String apassword) {
	
		String sql = "INSERT INTO Guser(Gusername,Gpassword) values(?,?)";
		
		try {
			
			getSession().createSQLQuery(sql).setString(0, aname).setString(1, apassword).executeUpdate();
			
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}





	@Override
	public boolean chaA(String aname) {
		
		
		String hql = "FROM Guser WHERE Gusername = ?";
		
		Query query = getSession().createQuery(hql).setString(0, aname);
		
		if(query.list().size()!=0)
		{
			return true;
		}
		
		
		return false;
	}





	@Override
	public boolean writeMY(String some) {
		String hql = "from testmiyao where miyao = ?";
		Query query = getSession().createQuery(hql).setString(0, some);
		
		if(query.list().size()!=0)
		return true;
		return false;
	}

}
