package jiemian.Service;

import java.util.List;

import jiemian.entities.CQrecord;

public interface SmarkService {

	
	
	public List<CQrecord> findQDinfo(String ssname);
	public List<CQrecord> findAllinfo();
	public void AddXchuqin(String snname);
	public boolean findchuqin(String name);
}
