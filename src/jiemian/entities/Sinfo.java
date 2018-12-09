package jiemian.entities;

public class Sinfo {
	
	public int getSinfoID() {
		return SinfoID;
	}
	public void setSinfoID(int sinfoID) {
		SinfoID = sinfoID;
	}
	public String getSxueyuan() {
		return Sxueyuan;
	}
	public void setSxueyuan(String sxueyuan) {
		Sxueyuan = sxueyuan;
	}
	public String getSzhuanye() {
		return Szhuanye;
	}
	public void setSzhuanye(String szhuanye) {
		Szhuanye = szhuanye;
	}
	public String getSphone() {
		return Sphone;
	}
	public void setSphone(String sphone) {
		Sphone = sphone;
	}
	private int SinfoID;
	private String Sxueyuan;
	private String Szhuanye;
	private String Sphone;
	private String Sxuehao;
	public String getSxuehao() {
		return Sxuehao;
	}
	public void setSxuehao(String sxuehao) {
		Sxuehao = sxuehao;
	}

}
