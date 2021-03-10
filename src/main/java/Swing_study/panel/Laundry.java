package Swing_study.panel;

public class Laundry {
	private int No;
	private String Name;
	private String Laundry;
	private String LaundryCode;
	private String Grade;
	private int Price;
	public Laundry() {
		// TODO Auto-generated constructor stub
	}
	public Laundry(int no, String name, String laundry, String laundryCode, String grade, int price) {
		No = no;
		Name = name;
		Laundry = laundry;
		LaundryCode = laundryCode;
		Grade = grade;
		Price = price;
	}
	public int getNo() {
		return No;
	}
	public void setNo(int no) {
		No = no;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getLaundry() {
		return Laundry;
	}
	public void setLaundry(String laundry) {
		Laundry = laundry;
	}
	public String getLaundryCode() {
		return LaundryCode;
	}
	public void setLaundryCode(String laundryCode) {
		LaundryCode = laundryCode;
	}
	public String getGrade() {
		return Grade;
	}
	public void setGrade(String grade) {
		Grade = grade;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	@Override
	public String toString() {
		return String.format("Laundry [No=%s, Name=%s, Laundry=%s, LaundryCode=%s, Grade=%s, Price=%s]", No, Name,
				Laundry, LaundryCode, Grade, Price);
	}
	
	
	
	
}
