package jiemian.entities;

public class Suser {
	
	
	private int SID;
	public int getSID() {
		return SID;
	}
	public void setSID(int sID) {
		SID = sID;
	}
	private String Susername;
	private String Suserpassword;
	public String getSusername() {
		return Susername;
	}
	public void setSusername(String susername) {
		Susername = susername;
	}
	public String getSuserpassword() {
		return Suserpassword;
	}
	public void setSuserpassword(String suserpassword) {
		Suserpassword = suserpassword;
	}

}
