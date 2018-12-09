package jiemian.Daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jiemian.Dao.LeaveDao;
import jiemian.entities.qJinfo;

@Repository
public class LeaveDaoImpl implements LeaveDao{
	
	
	@Autowired
	private SessionFactory sessionfactory;
	
	private Session getSession(){
		return sessionfactory.getCurrentSession();
	}

	@Override
	public boolean isQjingJia(String name) {
	    String hql = "From qJinfo where xsname = ?";
	    Query query = getSession().createQuery(hql).setString(0, name);
	    List<qJinfo> ql = query.list();
		System.out.println(ql);
	    if(ql.isEmpty())
	    {
	    	return false;
	    }
	    else
	    	return true;
	    
	    
	}

	@Override
	public void addXqjinfo(String name, String qjly) {
		String sql = "insert into qJinfo(xsname,liyou,qjheshi,xind) values(?,?,'未批准','打扫教室一周')";
		
		getSession().createSQLQuery(sql).setString(0, name).setString(1, qjly).executeUpdate();
		
	}

	@Override
	public List<qJinfo> findAllqjinfo() {
		String hql = "FROM qJinfo";
		Query query = getSession().createQuery(hql);
		List<qJinfo> qJinfos = query.list();
		return qJinfos;
	}

	@Override
	public List<qJinfo> findSqinfo(String name) {
		String hql="FROM qJinfo where xsname = ?";
		Query query = getSession().createQuery(hql).setString(0, name);
		List<qJinfo> qjl = query.list();
		return qjl;
	}

	@Override
	public void chexiaoqingjia(String name) {
		String sql = "delete from qJinfo where xsname = ?";
		
		getSession().createSQLQuery(sql).setString(0, name).executeUpdate();
		
	}

	@Override
	public boolean isPiZhun(String name) {
		String hql = "From qJinfo where  xsname = ? and qjheshi = '批准'";
		Query query = getSession().createQuery(hql).setString(0, name);
		List<qJinfo> qjl = query.list();
		if(qjl.isEmpty())
		return false;
		else
		return true;
	}

	@Override
	public void PiZhun(String name) {
		String sql = "update qJinfo set qjheshi = '批准' where xsname = ?";
		getSession().createSQLQuery(sql).setString(0, name).executeUpdate();
		
	}

}
