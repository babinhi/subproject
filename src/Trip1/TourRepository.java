package Trip1;

import java.util.HashMap;
import java.util.Map;

public class TourRepository {
	Map<String, TourDTO> T  = new HashMap<>();
	
	public boolean save(String num, TourDTO tourDTO) {
		T.put(num, tourDTO);
		return true;
	}
	public boolean update(TourDTO tourDTO, String num) {
		for(String tnum : T.keySet()) {
			if(T.get(tnum).getNum().equals(num)) {
				T.get(tnum).setName(tourDTO.getName());
				T.get(tnum).setPassword(tourDTO.getPassword());
				T.get(tnum).setAvg(tourDTO.getAvg());
				return true;
			}
		}
		return false;
	}
	public TourDTO findById(String num) {
		for(String tnum : T.keySet()) {
			if(T.get(tnum).getNum().equals(num)) {
				return T.get(num);
			}
		}
		return null;
	}
}
