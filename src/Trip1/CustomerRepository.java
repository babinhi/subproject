package Trip1;

import java.util.*;



public class CustomerRepository {
	Map<String, CustomerDTO> c = new HashMap<>();
//	private List<CustomerDTO> list = new ArrayList<>();
	Map<String, BreakdownDTO> b = new HashMap<>();
	
	
	
	public boolean save(String num, CustomerDTO customerDTO) {
		c.put(num, customerDTO);
		return true;
	}
	public boolean update( String password, String phonenumber) {
		for(String customer : c.keySet() ) {
			if(c.get(c).getPassword().equals(password) &&
					c.get(c).getPhonenumber().equals(phonenumber)) {
				
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
	public String getnum(String id, String password) {
		for(String customer : c.keySet()) {
			if(c.get(customer).getId().equals(id)&&c.get(customer).getPassword().equals(password)) {
				return c.get(customer).getNum();
			}
			
		}
		return null;
	}
	public boolean deposit(String num, long money) {
		for(String customer : c.keySet()) {
			if(c.get(customer).getNum().equals(num)) {
				c.get(customer).setBalance(c.get(customer).getBalance() + money);
				BreakdownDTO breakdownDTO = new BreakdownDTO();
				breakdownDTO.setAccount(num);
				breakdownDTO.setDivision("입금");
				breakdownDTO.setDealMoney(money);
				breakdownDTO.setTotalMoney(c.get(customer).getBalance());
				b.put(breakdownDTO.getM(), breakdownDTO);
//				bList.add(breakdownDTO);
				return true;	
			}
				
		}
		return false;
	}
	public boolean withdraw(String account, long money) {
		for(String customer : c.keySet()) {
			if (c.get(customer).getNum().equals(account)) {
				if (c.get(customer).getBalance() >= money) {
					c.get(customer).setBalance(c.get(customer).getBalance() - money);
					BreakdownDTO breakdownDTO = new BreakdownDTO();
					breakdownDTO.setAccount(account);
					breakdownDTO.setDivision("결제");
					breakdownDTO.setDealMoney(money);
					breakdownDTO.setTotalMoney(c.get(customer).getBalance());
					b.put(breakdownDTO.getM(), breakdownDTO);
					return true;
				} else {
					return false;
				}
			}
		}
		return false;
	}
	
	
	
	
}
