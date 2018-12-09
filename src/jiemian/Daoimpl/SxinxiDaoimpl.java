package jiemian.Daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jiemian.Dao.SxinxiDao;
import jiemian.entities.Sinfo;
import jiemian.entities.Tinfo;




@Repository
public class SxinxiDaoimpl implements SxinxiDao {

	
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getSession(){
		
		return sessionFactory.getCurrentSession();
	}
	
	
	
	
	
	
	
	@Override
	public List<Integer> findStudentID(String Sname) {
        String Sql = "SELECT SID FROM Suser where Susername = ? ";
		
		List<Integer> tu = getSession().createSQLQuery(Sql).setString(0, Sname).list();
		return tu;
	}

	@Override
	public List<Sinfo> Sxinxi(int sid) {
         String sql = "From Sinfo sinfo where SinfoID = ?";
		
		List<Sinfo> inno = getSession().createQuery(sql).setInteger(0, sid).list();
		
		return inno;
	}

	
	
	
	
	@Override
	public void updatesInfo(String newSxueyuan, String newSzhuanye, String newSphone, String newSxuehao, int sid) {
	String hql="update Sinfo s set s.Sxueyuan=?,s.Szhuanye=?,s.Sphone=?,s.Sxuehao=? where s.SinfoID= ?";
	getSession().createQuery(hql).setString(0, newSxueyuan).setString(1, newSzhuanye).setString(2, newSphone).setString(3, newSxuehao).setInteger(4, sid).executeUpdate();
		

	}

	
	
	
	
	
	
	@Override
	public void addXinsID(int xinsid) {
		String sql = "insert into  Sinfo  set SinfoID = ?, Sxueyuan= '新学院' ,Szhuanye='新专业',Sphone='新电话',Sxuehao='新职称' ";
		getSession().createSQLQuery(sql).setInteger(0, xinsid).executeUpdate();

	}

}
