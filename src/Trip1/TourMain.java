package Trip1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TourMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		CustomerService Cservice = new CustomerService();
		ManagerService Mservice = new ManagerService();
		Map<String, CustomerDTO> c = new HashMap<>();

		boolean loginOk = false;
		boolean manager = false;

		while (true) {
			System.out.println("────────────────────────────── MENU ──────────────────────────────");
//			System.out.println("1.관리자 2.고객 0.종료");
////			System.out.print("번호 >");
//			int menu = sc.nextInt();
			if (loginOk) {
				System.out.println("[ "+"금액 :" + " ] " );
				System.out.println("  1.회원정보확인 2.금액충전 3.정보수정 4.방리스트 5.방예약 6.예약확인 7.예약취소 8.회원탈퇴 0.종료");
			} else {
				System.out.println("  1.회원가입 2.로그인 3.방 4.방삭제 5.예약확인 6.예약취소 7.회원리스트 0.로그아웃");
			}

			System.out.print("선택> ");
			int menu = sc.nextInt();

			if (menu == 1) {
				if (loginOk) {
					Cservice.findById();
				} else {
					Cservice.save();
				}
			} else if (menu == 2) {
				if (loginOk) {
//					Cservice.point;
				} else {
					loginOk= Cservice.loginCheck();
				}
			}
				else if (menu == 3) {
				if(loginOk) {
					Cservice.update();
				}
				else {
//					Cservice.tourDelete();
				}	
			} else if (menu == 4) {
				if(loginOk) {
					Cservice.findHotel();
				}
				else {
//					Cservice.tourCheck1();
				}
			} else if (menu == 5) {
				if(loginOk) {
//					Cservice.tourCancel();
				}
				else {
//					Cservice.tourCancel1();
				}
			} else if (menu == 6) {
				if(loginOk) {
//					Cservice.joinDelete();
				}
				else {
//					Cservice.findById();
				}
			}
			else if (menu == 0) {
				break;
			} else {
				System.out.println("다시입력");
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");

	}

}
