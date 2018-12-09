package jiemian.Daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jiemian.Dao.AllLoginUserDao;
import jiemian.entities.Guser;
import jiemian.entities.Suser;
import jiemian.entities.Tuser;

@Repository
public class AllLoginUserDaoimpl implements AllLoginUserDao {

	
	@Autowired
	private SessionFactory sessionfactory;
	
	private Session getSession()
	{
		return sessionfactory.getCurrentSession();
	}
	
	@Override
	public List<Guser> findAllGuser() {
		
		String hql = "from Guser";
		Query query = getSession().createQuery(hql);
		List<Guser> lg = query.list();
		
		return lg;
	}

	@Override
	public List<Suser> findAllSuser() {
		String hql = "from Suser";
		Query query = getSession().createQuery(hql);
		List<Suser> ls = query.list();
		
		return ls;
	}

	@Override
	public List<Tuser> findAllTuser() {
		String hql = "from Tuser";
		Query query = getSession().createQuery(hql);
		List<Tuser> lt = query.list();
		
		return lt;
	}

}
