package Swing_study.panel;

public class Title {

	private static int tNo;
	private static String tName;

	public Title() {
		// TODO Auto-generated constructor stub
	}

	public Title(int tNo) {
		this.tNo = tNo;
		
	}

	public Title(String tName) {
		this.tName = tName;
	}

	public Title(int tNo, String tName) {
		this.tNo = tNo;
		this.tName = tName;
	}

	public static int gettNo() {
		return tNo;
	}

	public void settNo(int tNo) {
		this.tNo = tNo;
	}

	public static String gettName() {
		return tName;
	}

	public void settName(String tName) {
		this.tName = tName;
	}

	@Override
	public String toString() {
		return String.format("Title [tNo=%s, tName=%s]", tNo, tName);
	}

	
	
	

}
