package Trip1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class CustomerRepository {
	Map<String, CustomerDTO> c = new HashMap<>();
//	private List<CustomerDTO> list = new ArrayList<>();
	
	
	
	public boolean save(String num, CustomerDTO customerDTO) {
		c.put(num, customerDTO);
		return true;
	}
	public boolean update(CustomerDTO customerDTO, String num) {
		for(String customer : c.keySet() ) {
			if(c.get(num).getNum().equals(num)) {
				c.get(num).setId(customerDTO.getId());
				c.get(num).setPassword(customerDTO.getPassword());
				c.get(num).setAge(customerDTO.getAge());
				c.get(num).setPhonenumber(customerDTO.getPhonenumber());
				return true;
			}
		}
		return false;
	}
	public CustomerDTO findById(String id, String Password) {
		for (String customer : c.keySet()) {
			if (c.get(customer).getId().equals(id)&&c.get(customer).getPassword().equals(Password)) {
				return c.get(customer);
			}
		}
		return null;
	}
	public Map<String, CustomerDTO> findHotel(){
		return c;
	}
	
	public boolean loginCheck(String id, String password) {
		for(String customer : c.keySet()) {
			if(c.get(customer).getId().equals(id)&& c.get(customer).getPassword().equals(password)) {
				return true;
			}			
		}
		return false;
	}
	
	
	
}
