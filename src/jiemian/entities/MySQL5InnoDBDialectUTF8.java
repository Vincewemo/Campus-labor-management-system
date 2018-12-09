package jiemian.entities;

import org.hibernate.dialect.MySQL5InnoDBDialect;

public class MySQL5InnoDBDialectUTF8  extends MySQL5InnoDBDialect{

	
	
	@Override
	public String getTableTypeString() {
		// TODO Auto-generated method stub
		return "ENGINE=InnoDB DEFAULT CHARSET=utf8";
	}
	
	
	
}
