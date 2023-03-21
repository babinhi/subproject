package Trip1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class CustomerService {
	CustomerRepository customer = new CustomerRepository();
	Scanner sc = new Scanner(System.in);
	String loginId = null;
	String loginPassword = null;
	
	
	public void save() {
		CustomerDTO customerDTO = new CustomerDTO();
//		System.out.println("BoardDTO 객체 생성 후 " + boardDTO);
		System.out.print("이름> ");
		customerDTO.setName(sc.nextLine());
		System.out.print("ID > ");
		customerDTO.setId(sc.next());
		System.out.print("Password> ");
		customerDTO.setPassword(sc.next());
		System.out.print("나이> ");
		customerDTO.setAge(sc.nextInt());
		System.out.print("전화번호 > ");
		customerDTO.setPhonenumber(sc.next());
		boolean success = customer.save(customerDTO.getNum(), customerDTO);
		if (success) {
			System.out.println( "회원가입을 축하합니다");
		} else {
			System.out.println("다시 입력해주세요");
		}
	}
	public void findById() {
	
		CustomerDTO customerDTO = customer.findById(loginId, loginPassword);
		if(customerDTO == null) {
			System.out.println("오류입니다");
		}else {
			System.out.println("회원번호 \t 이름 \t 아이디\t 비밀번호 \t 나이 \t 전화번호\t\t 객실번호 \t 가입날짜");
			System.out.println("────────────────────────────────────────────────────────────────────────────────────────────");
			System.out.println (customerDTO.toString());
			
		}
	}
	
	public void update() {
		System.out.print("수정할 ID > ");
		String id = sc.next();
		sc.nextLine();
		CustomerDTO c = customer.findById(loginId, loginPassword);
		if (c == null) {
			System.out.println("조회할 수 없는 아이디 입니다");
		} else {
			CustomerDTO customerDTO = new CustomerDTO();
			System.out.print("수정할 이름> ");
			customerDTO.setName(sc.next());
			System.out.print("수정할 비밀번호> ");
			customerDTO.setPassword(sc.next());
			System.out.print("수정할 나이> ");
			customerDTO.setAge(sc.nextInt());
			sc.nextLine();
			if (customer.update(customerDTO, id)) {
				System.out.println("업데이트 성공");
			} else {
				System.out.println("업데이트 실패");
			}
		}
	}
	public void findHotel() {
		Map<String, CustomerDTO> list = customer.findHotel();
		System.out.println("\t방등급\t침대\t동반가능인원\t와이파이\t반려동물동반여부\t조식\t가격");
		System.out.println("────────────────────────────────────────────────────────────");
		
		
	}
	
	public boolean loginCheck() {
		System.out.print("ID >");
		String id = sc.next();
		System.out.print("PassWord >");
		String password = sc.next();
		if (customer.loginCheck(id, password)) {
			loginId = id;
			loginPassword = password;
			System.out.println( "로그인이 되었습니다 ");
			return true;
		}else {
			System.out.println("다시한번 확인해주세요");
			return false;
		}
		
	}
	
	public void deposit() {
		String num = customer.getnum(loginId, loginPassword);
		if(num == null) {
			System.out.println("로그인 오류");
		}else {
			System.out.print("충전하실 금액 입력> ");
			long money = sc.nextLong();
			if(customer.deposit(num, money)) {
				System.out.println("충전성공");
			}else {
				System.out.println("충전실패");
			}
		}
		
		
	}
	public void withdraw() {
		String num = customer.getnum(loginId, loginPassword);
		if (num == null) {
			System.out.println("로그인 오류");
		} else {
			System.out.print("계산 금액> ");
			long money = sc.nextLong();
			if (customer.withdraw(num, money)) {
				System.out.println("결제가 완료되었습니다");
			} else {
				System.out.println("잔액부족합니다 확인해주세요");
			}
		}
	}




}
