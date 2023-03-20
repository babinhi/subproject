package Trip1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TourDTO {
	private static int number = 0;
	private final static DateTimeFormatter DTF = DateTimeFormatter.ofPattern("yy/MM/dd hh:mm:ss");
	
	private String num;
	private String name;
	private int avg;
	private String hotelname;
	private String id;
	private String password;
	private String postDate;
	
	
	public TourDTO() {
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
	public int getAvg() {
		return avg;
	}
	public void setAvg(int avg) {
		this.avg = avg;
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
	@Override
	public String toString() {
		return num + "\t " +name + "\t " + avg + "\t " + hotelname + "\t "
				+ postDate;
	}
	
	
	
	
}
