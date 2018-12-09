package jiemian.entities;

public class chuqin {

	
	
	
	
	public int getChuqinID() {
		return chuqinID;
	}
	public void setChuqinID(int chuqinID) {
		this.chuqinID = chuqinID;
	}
	public String getIsHeshi() {
		return isHeshi;
	}
	public void setIsHeshi(String isHeshi) {
		this.isHeshi = isHeshi;
	}

	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	private int chuqinID;
	private String isHeshi;
    private String chuqinCount;
	public String getChuqinCount() {
		return chuqinCount;
	}
	public void setChuqinCount(String chuqinCount) {
		this.chuqinCount = chuqinCount;
	}
	private String grade;
	private String banjihao;
	public String getBanjihao() {
		return banjihao;
	}
	public void setBanjihao(String banjihao) {
		this.banjihao = banjihao;
	}
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
