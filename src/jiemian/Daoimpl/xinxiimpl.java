package jiemian.Daoimpl;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jiemian.Dao.xinxiDao;
import jiemian.entities.Tinfo;
import jiemian.entities.Tuser;



@Repository
public class xinxiimpl implements xinxiDao {

	
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getSession(){
		
		return sessionFactory.getCurrentSession();
	}
	
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Tinfo> Txinxi(int id) {
		
		String sql = "From Tinfo tinfo where TIID = ?";
		
		List<Tinfo> inno = getSession().createQuery(sql).setInteger(0, id).list();
		
		return inno;
	
      
	}



	@Override
	public List<Integer> findTeacherID(String tname) {
		
		String Sql = "SELECT TID FROM Tuser where Tusername = ? ";
		
		List<Integer> tu = getSession().createSQLQuery(Sql).setString(0, tname).list();
		
		
		return tu;
	}



	@Override
	public void updateInfo(String newxueyuan, String newzhuanye, String newphone, String newzhicheng,int id) {
		String hql="update Tinfo i set i.Txueyuan=?,i.Tzhuanye=?,i.Tphone=?,i.Tzhicheng=? where i.TIID = ?";
		
		getSession().createQuery(hql).setString(0, newxueyuan).setString(1, newzhuanye).setString(2, newphone).setString(3, newzhicheng).setInteger(4, id).executeUpdate();
		
		
	}



	@Override
	public void addXinID(int xinid) {
		String sql = "insert into  Tinfo  set TIID = ?, Txueyuan = '新学院' ,Tzhuanye='新专业',Tphone='新电话',Tzhicheng='新职称' ";
		getSession().createSQLQuery(sql).setInteger(0, xinid).executeUpdate();
		
	}

}
