package jiemian.Daoimpl;



import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jiemian.Dao.markDao;
import jiemian.entities.CQrecord;

@Repository
public class markDaoimpl implements markDao {

	
	@Autowired
	private SessionFactory sessionfactory;
	
	
	
	
	private Session getSession()
	{
		return sessionfactory.getCurrentSession();
	}

	@Override
	public boolean findXS(String sname) {
		
		String hql = "From CQrecord where Sxingming = ?";
		Query query = getSession().createQuery(hql).setString(0, sname);
		
		
		
		
		List<CQrecord> lcq = query.list();
		if(lcq.size()==0)
			return false;
		else
			return true;
		
	}
	private String Monday;
	private String Tuesday;
	private String Wednesday;
	private String Thursday;
	private String Friday;
	@Override
	public void addXsinfo(int id ,String sname) {
		String sql = "insert into CQrecord(RecordID,Monday,Tuesday,Wednesday,Thursday,Friday,Sxingming) values(?,'Î´Ç©µ½','Î´Ç©µ½','Î´Ç©µ½','Î´Ç©µ½','Î´Ç©µ½',?)";
		getSession().createSQLQuery(sql).setInteger(0, id).setString(1, sname).executeUpdate();
		
	}

	@Override
	public int findXid(String name) {
		String sql = "select SID from Suser where Susername = ?";
		Query query = getSession().createSQLQuery(sql).setString(0, name);
		List<Integer> lid = query.list();
		if(lid.size()!=0)
			return lid.get(0);
		else
			return 0;
	}

	@Override
	public void cun1(int id, String qd) {
		String hql="update CQrecord cq set cq.Monday = ? where cq.RecordID = ?";
		getSession().createQuery(hql).setString(0, qd).setInteger(1, id).executeUpdate();
		
	}

	@Override
	public void cun2(int id, String qd) {
		String hql="update CQrecord cq set cq.Tuesday = ? where cq.RecordID = ?";
		getSession().createQuery(hql).setString(0, qd).setInteger(1, id).executeUpdate();
	}

	@Override
	public void cun3(int id, String qd) {
		String hql="update CQrecord cq set cq.Wednesday = ? where cq.RecordID = ?";
		getSession().createQuery(hql).setString(0, qd).setInteger(1, id).executeUpdate();
	}

	@Override
	public void cun4(int id, String qd) {
		String hql="update CQrecord cq set cq.Thursday = ? where cq.RecordID = ?";
		getSession().createQuery(hql).setString(0, qd).setInteger(1, id).executeUpdate();
		
	}

	@Override
	public void cun5(int id, String qd) {
		String hql="update CQrecord cq set cq.Friday = ? where cq.RecordID = ?";
		getSession().createQuery(hql).setString(0, qd).setInteger(1, id).executeUpdate();
	}
	
	
	
	


}
