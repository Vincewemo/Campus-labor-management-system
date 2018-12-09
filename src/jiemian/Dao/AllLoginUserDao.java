package jiemian.Dao;

import java.util.List;

import jiemian.entities.Guser;
import jiemian.entities.Suser;
import jiemian.entities.Tuser;

public interface AllLoginUserDao {

	
	
	public List<Guser> findAllGuser();
	
	public List<Suser> findAllSuser();
	
	public List<Tuser> findAllTuser();
}
