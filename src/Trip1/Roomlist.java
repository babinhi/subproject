package Trip1;

import java.util.ArrayList;
import java.util.List;

public class RoomList {
	private List<RoomList> roomList = new ArrayList<>();

	public RoomList(String string, String string2, int i) {
//		this.roomList.add(new RoomList("404", "NOT_FOUND", 0));
		this.roomList.add(new RoomList("101", "스탠다드", 120_000));
		this.roomList.add(new RoomList("102", "더블룸(싱글배드)", 220_000));
		this.roomList.add(new RoomList("103", "더블룸(더블배드)", 220_000));
		this.roomList.add(new RoomList("104", "패밀리룸", 320_000));
		this.roomList.add(new RoomList("105", "스위트", 420_000));
		this.roomList.add(new RoomList("102", "스탠다드", 120_000));
		this.roomList.add(new RoomList("103", "스탠다드", 120_000));
		this.roomList.add(new RoomList("104", "스탠다드", 120_000));
		this.roomList.add(new RoomList("105", "스탠다드", 120_000));
		this.roomList.add(new RoomList("201", "더블룸(싱글배드)", 220_000));
		this.roomList.add(new RoomList("202", "더블룸(싱글배드)", 220_000));
		this.roomList.add(new RoomList("203", "더블룸(더블배드)", 220_000));
		this.roomList.add(new RoomList("204", "더블룸(더블배드)", 220_000));
		this.roomList.add(new RoomList("205", "더블룸(더블배드)", 220_000));
		this.roomList.add(new RoomList("301", "패밀리룸", 320_000));
		this.roomList.add(new RoomList("302", "패밀리룸", 320_000));
		this.roomList.add(new RoomList("303", "패밀리룸", 320_000));
		this.roomList.add(new RoomList("304", "패밀리룸", 320_000));
		this.roomList.add(new RoomList("305", "패밀리룸", 320_000));
		this.roomList.add(new RoomList("401", "스위트", 420_000));
		this.roomList.add(new RoomList("402", "스위트", 420_000));
		this.roomList.add(new RoomList("403", "스위트", 420_000));
		this.roomList.add(new RoomList("404", "스위트", 420_000));
		this.roomList.add(new RoomList("405", "프레지던트", 620_000));
		
	}
}