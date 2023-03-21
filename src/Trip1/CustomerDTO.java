package Trip1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CustomerDTO {
	private static int number = 0;
	private final static DateTimeFormatter DTF = DateTimeFormatter.ofPattern("yy/MM/dd hh:mm:ss");
	
	private String num;
	private String name;
	private int age;
	private String hotelname;
	private String id;
	private String password;
	private String phonenumber;
	private long balance;
	private String postDate;
	
	
	public CustomerDTO() {
		this.num = "No"+ number++;
		this.postDate = DTF.format(LocalDateTime.now());
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getHotelname() {
		return hotelname;
	}
	public void setHotelname(String hotelname) {
		this.hotelname = hotelname;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return num + "\t " +name + "\t " + age + "\t " + phonenumber + " \t " + hotelname + " \t "
				+ postDate;
	}
	
	
	
	
}
