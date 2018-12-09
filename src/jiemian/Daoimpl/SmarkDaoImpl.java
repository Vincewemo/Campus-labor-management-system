package jiemian.Daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jiemian.Dao.SmarkDao;
import jiemian.Dao.markDao;
import jiemian.entities.CQrecord;
import jiemian.entities.chuqin;


@Repository
public class SmarkDaoImpl implements SmarkDao {
	
	
	
	
	@Autowired
	private SessionFactory sessionfactory;
	
	@Autowired
	markDao markDao;
	
	
	private Session getSession()
	{
		return sessionfactory.getCurrentSession();
	}

	@Override
	public List<CQrecord> findRecord(String name) {
		
		
		String hql = "From CQrecord where Sxingming = ?";
		Query query = getSession().createQuery(hql).setString(0, name);
		List<CQrecord> cql = query.list();
		return cql;
	}

	@Override
	public List<CQrecord> findAllchuqin() {
		String hql = "From CQrecord";
		List<CQrecord> call = getSession().createQuery(hql).list();
		return call;
	}

	@Override
	public void addchuqin(String name) {
		int num = markDao.findXid(name);
		
		
		String sql = "insert into chuqin(chuqinID, name) values(?,?)";
		getSession().createSQLQuery(sql).setInteger(0, num).setString(1, name).executeUpdate();
		
	}

	@Override
	public boolean findchuqin(String name) {
		
		String hql = "From chuqin where name = ?";
		boolean isyou = false;
		List<chuqin> cqqq = getSession().createQuery(hql).setString(0, name).list();
		
		if(cqqq.isEmpty())
			return false;
		else
			return true;
		
		
	}

	@Override
	public void addCcount(String count,String name) {
		String sql = "update chuqin set chuqinCount = ? where name = ?";
		getSession().createSQLQuery(sql).setString(0, count).setString(1, name).executeUpdate();
		
	}

	@Override
	public List<chuqin> findAllCQ() {
		String hql = "from chuqin";
		List<chuqin> cccq = getSession().createQuery(hql).list();
		
	
		
			return cccq;
	}
	
	
	
	public void tongjichuqin()
	{
		
	}

	@Override
	public void chaXH(int id, String Xhao) {
		String sql = "update chuqin set banjihao = ? where chuqinID = ?";
		
		getSession().createSQLQuery(sql).setString(0, Xhao).setInteger(1, id).executeUpdate();
		
	}

	@Override
	public void addGrade(String fen, String name) {
		String sql = "update chuqin set  grade= ? where name = ?";
		getSession().createSQLQuery(sql).setString(0, fen).setString(1, name).executeUpdate();
		
	}

	@Override
	public void charuHeshi(String name, String heshi) {
          String sql = "update chuqin set isHeshi = ? where name = ?";
          getSession().createSQLQuery(sql).setString(0, heshi).setString(1, name).executeUpdate();
	}
	
	
	
	
	
	
	
	
	
	
	

}
