package Trip1;

import java.time.format.DateTimeFormatter;

public class TourDTO {
	private static int number = 10;
	private final static DateTimeFormatter DTF = DateTimeFormatter.ofPattern("yy/MM/dd hh:mm:ss");
	
	private String num;
	private String name;
	private String listname;
	private String hotelname;
	private String postDate;
	
}
