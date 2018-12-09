package jiemian.Daoimpl;

import java.util.List;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jiemian.Dao.zhuyuanDao;
import jiemian.entities.ChooseZY;
import jiemian.entities.ZYtongjifen;
import jiemian.entities.zhiyuan;



@Repository
public class zhiyuanDaoImpl implements zhuyuanDao {
	
	
	
	@Autowired
	 SessionFactory sessionfactory;
	
	private Session getSession()
	{
		return sessionfactory.getCurrentSession();
	}
	
	

	@Override
	public List<zhiyuan> findallzhiyuan() {
		String hql = "From zhiyuan";
		List<zhiyuan> xzy = getSession().createQuery(hql).list();
		return xzy;
	}

	@Override
	public void xuanzezhiyuan(String zname,String name) {
		String sql = "insert into ChooseZY(zyname,name,zyheshi) values(?,?,'Œ¥∫À µ')";
		getSession().createSQLQuery(sql).setString(0, zname).setString(1, name).executeUpdate();

	}



	@Override
	public List<ChooseZY> canjiaInfo(String name) {
		String hql = "from ChooseZY  where name = ?";
		
		Query query = getSession().createQuery(hql).setString(0, name);
		List<ChooseZY> clzy = query.list();
 		return clzy;
	}



	@Override
	public void dropinfo(String name,String zname) {
		String sql = "delete from ChooseZY where name = ? AND zyname = ?";
		
		getSession().createSQLQuery(sql).setString(0, name).setString(1, zname).executeUpdate();
		
	}



	@Override
	public void addXinzhiyuan(String zzname,String bh) {
		String hql = "insert into zhiyuan(zymc,bianhao) values(?,?)";
		getSession().createSQLQuery(hql).setString(0, zzname).setString(1, bh).executeUpdate();
		
	}



	@Override
	public List<ChooseZY> findAllxueshengzy() {
	
		
		String hql = "FROM ChooseZY";
		Query query = getSession().createQuery(hql);
		List<ChooseZY> chl = query.list();
		return chl;
	}



	@Override
	public boolean youwuXZinfo(String name) {
		String hql = "from ChooseZY where name = ?";
		
		if(getSession().createQuery(hql).setString(0, name).list().isEmpty())
		return false;
		else
	    return true;
	}



	@Override
	public void Cheshi(String name) {
		String hql = "update ChooseZY set zyheshi = '∫À µ' where name= ?";
		
		getSession().createQuery(hql).setString(0, name).executeUpdate();
	}



	@Override
	public void jiZYfen(String name, String fen) {
		String sql = "insert into ZYtongjifen(name,fenshu) values(?,?)";
		
		getSession().createSQLQuery(sql).setString(0, name).setString(1, fen).executeUpdate();
		
	}
	
	public void GjiZYfen(String name, String fen) {
		String sql = "update  ZYtongjifen set fenshu = ? where name = ?";
		
		getSession().createSQLQuery(sql).setString(0, fen).setString(1, name).executeUpdate();
		
	}


	@Override
	public List<ZYtongjifen> findAllzyjifen() {
		
		String hql = "FROM ZYtongjifen";
		
		Query query = getSession().createQuery(hql);
		
		List<ZYtongjifen> zytjf = query.list();
		
		
		return zytjf;
	}



	@Override
	public boolean jifenyou(String name) {
		
		String hql = "from ZYtongjifen where name = ?";
		
		Query query = getSession().createQuery(hql).setString(0, name);
		List<ZYtongjifen> tongjiz = query.list();
		
		if(tongjiz.isEmpty())
		{
			return false;
		}
		else
		return true;
	}



	@Override
	public boolean shifouheshi(String name) {
		
        String hql = "from ChooseZY where name=? and zyheshi='∫À µ'";		
		Query query = getSession().createQuery(hql).setString(0, name);
		
		List<ChooseZY> ch = query.list();
		
		if(ch.isEmpty())
		{
			return false;
		}
		
		
		
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
