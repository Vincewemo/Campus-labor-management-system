package jiemian.Daoimpl;

import java.util.List;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jiemian.Dao.RenWuDao;
import jiemian.entities.RenWu;
import jiemian.entities.specificRw;






@Repository
public class RenWuDaoImpl implements RenWuDao {

	
	
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getSession()
	{
		return sessionFactory.getCurrentSession();
	}
	
	
	
	
	
	@Override
	public List<RenWu> findallRenwu() {
		
		String hql = "FROM RenWu renwu";
	   List<RenWu> renwub = getSession().createQuery(hql).list();
		
		
		return renwub;
	}





	@Override
	public List<RenWu> findXYRW(String xueyuanmingcheng) {
		String hql = "FROM RenWu WHERE xueyuan = ?  ";
		Query query = getSession().createQuery(hql);
		query.setString(0,xueyuanmingcheng);
//		System.out.println(query.list());
		List<RenWu> rwww = query.list();
	
		return rwww;
		
		
	}





	@Override
	public List<RenWu> xiugairenwu(String xueyuanmingcheng,String renwumingcheng) {
		String hql = "From RenWu where xueyuan =?";
		
	    Query query = getSession().createQuery(hql);
	    query.setString(0, xueyuanmingcheng);
	    List<RenWu> renwumc = query.list();
	    
	   
	    for(RenWu rw:renwumc){
	    	rw.setRenwu(renwumingcheng);
	    }
		
	
		
		
		
		return renwumc;
	}





	@Override
	public List chaAllrenwu() {
		String hql = "FROM specificRw";
		List<specificRw> sl = getSession().createQuery(hql).list();
		return sl;
	}





	@Override
	public void addnewRwinfo(String xueyuan,String zhuanye,String banji,String renwu) {
		String hql = "insert into RenWu(xueyuan,zhuanye,banji,renwu) values(?,?,?,?)";
		getSession().createSQLQuery(hql).setString(0, xueyuan).setString(1, zhuanye).setString(2, banji).setString(3, renwu).executeUpdate();
		
	}

}
