package jiemian.Daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jiemian.Dao.ToolDao;
import jiemian.Dao.markDao;
import jiemian.entities.BandSre;
import jiemian.entities.BorrowT;
import jiemian.entities.Sdback;
import jiemian.entities.Tool;


@Repository
public class ToolDaoimpl implements ToolDao {

	@Autowired
	private SessionFactory sessionfactory;
	
	
	
	private Session getSession()
	{
		return sessionfactory.getCurrentSession();
	}
	
	
	
	
	
	
	
	@Override
	public List<Tool> findAllTools() {
		String hql = "FROM Tool";
		Query query = getSession().createQuery(hql);
		List<Tool> lt = query.list();
		return lt;
	}














	@Override
	public boolean isBorrow(String name, String gongjuname) {
		String hql = "FROM Sdback where gjname = ? and xname = ?";
		Query query = getSession().createQuery(hql).setString(0, gongjuname).setString(1, name);
		List<Sdback> btl = query.list();
		
		if(btl.isEmpty())
		return true;
		else
		return false;
	}







	@Override
	public void BorrowTools(String name, String gongjuname) {
		String sql = "insert into BorrowT(btm,btsname) values(?,?)";
		
		getSession().createSQLQuery(sql).setString(0, gongjuname).setString(1, name).executeUpdate();
		
		
		
	}







	@Override
	public List<BorrowT> findBorrowinfo(String name) {
		String hql="from BorrowT where btsname = ?";
		Query query = getSession().createQuery(hql).setString(0, name);
		List<BorrowT> bbl = query.list();
		return  bbl;
	}







	@Override
	public boolean isyouTool(String bname) {
		String hql = "from Tool where toolname = ?";
		
		Query query = getSession().createQuery(hql).setString(0, bname);
		List<Tool> tl = query.list();
		
		if(tl.isEmpty())
			return true;
		
		else
		return false;
	}







	@Override
	public boolean naijiu(String gjname) {
		String sql = "From Tool where toolname = ? and wear='Á¼ºÃ'";
		Query query = getSession().createQuery(sql).setString(0, gjname);
		List<Tool> ttcl = query.list();
		
		if(ttcl.isEmpty())
		return false;
		else
		return true;
	}







	@Override
	public void AddSendBackTools(String name, String gongjuname) {
		String sql = "insert into Sdback(gjname,xname) values(?,?)";
		getSession().createSQLQuery(sql).setString(0, gongjuname).setString(1, name).executeUpdate();
		
	}







	@Override
	public boolean isSendBack(String name, String gongjuname) {
		String hql = "FROM Sdback where gjname = ? and xname = ?";
		Query query = getSession().createQuery(hql).setString(0, gongjuname).setString(1, name);
		
		
		List<Sdback> sl = query.list();
		
		if(sl.isEmpty())
			return false;
		else
		return true;
	}







	@Override
	public void SendBackTools(String name, String gongjuname) {
		String hql = "delete from Sdback where gjname = ? and xname = ?";
		
		getSession().createQuery(hql).setString(0, gongjuname).setString(1, name).executeUpdate();
		
	}

    @Override
	public void SendBackToolsBorrow(String name,String gongjuname){
        String hql = "delete from BorrowT where btm = ? and btsname = ?";
		
		getSession().createQuery(hql).setString(0, gongjuname).setString(1, name).executeUpdate();
	}




	@Override
	public List<Sdback> findSendBackInfo(String name) {
		String hql = "FROM Sdback where xname = ?";
		Query query = getSession().createQuery(hql).setString(0, name);
		
		List<Sdback> sld = query.list();
		return sld;
	}







	@Override
	public void AddTools(String toolname) {
		String sql = "insert into Tool(toolname,wear) values(?,'Á¼ºÃ')";
		
		getSession().createSQLQuery(sql).setString(0, toolname).executeUpdate();
		
	}







	@Override
	public void ChangeWear(String toolname, String wString) {
		String hql = "update Tool set wear = ? where toolname = ?";
		
		getSession().createQuery(hql).setString(0, wString).setString(1, toolname).executeUpdate();
		
	}







	@Override
	public boolean isBandS(String name) {
		String hql = "FROM BandSre where names = ?";
		Query query = getSession().createQuery(hql).setString(0, name);
		List<BandSre> bsl = query.list();
		
		if(bsl.isEmpty())
		return false;
		else
		return true;
	}







	@Override
	public List<BorrowT> findAllBorrowT() {
	     String hql = "From BorrowT";
	     Query query = getSession().createQuery(hql);
	     List<BorrowT> bbas = query.list();
		return bbas;
	}







	@Override
	public void addBandS(String name) {
		String sql = "insert into BandSre(names) values(?)";
		
		getSession().createSQLQuery(sql).setString(0, name).executeUpdate();
		
	}







	@Override
	public List<BandSre> findAllBandSre() {
		String hql = "From BandSre";
		Query query = getSession().createQuery(hql);
		List<BandSre> bsrel = query.list();
		return bsrel;
	}







	@Override
	public int BorrowCount(String name) {
		String hql = "FROM BorrowT where btsname = ?";
		Query query = getSession().createQuery(hql).setString(0, name);
		
		List<BorrowT> btla = query.list();
		
		return btla.size();
	}







	@Override
	public void addBandScount(String name, String count) {
		String sql = "update BandSre set  borrown = ? where names = ?";
		getSession().createSQLQuery(sql).setString(0, count).setString(1, name).executeUpdate();
		
	}

}
