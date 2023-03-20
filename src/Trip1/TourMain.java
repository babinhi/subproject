package Trip1;

import java.util.Scanner;

public class TourMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		TourService Tservice = new TourService();
//		boolean loginOk = false;
		
//		while (true) {
//			System.out.println("────────────────────────────── MENU ──────────────────────────────");
//			if(loginOk) {
//				System.out.println("  1.회원정보수정 2.여행지검색 및 교통편구매 3.숙박시설검색 및 숙박시설예약 4.여행예약확인 5.예약취소 6.회원탈퇴 0.종료");
//			}else {
//				System.out.println("  1.회원가입 2.로그인 2.여행지등록 3.여행지삭제 4.예약확인 5.예약취소 6.회원리스트 0.로그아웃");	
//			}
//			
//			System.out.print("선택> ");
//			int menu = sc.nextInt();
//
//			if (menu == 1) {
//				if(loginOk) {
//					service.update();
//				}
//				else {
//					service.save();
//				}
//			} else if (menu == 2) {
//				if(loginOk) {
//					service.findTour();
//				}
//				else {
//					service.loginCheck();
//				}
//			} else if (menu == 3) {
//				if(loginOk) {
//					service.hotelList();
//				}
//				else {
//					setvice.tourDelete();
//				}	
//			} else if (menu == 4) {
//				if(loginOk) {
//					service.tourCheck();
//				}
//				else {
//					service.tourCheck1();
//				}
//			} else if (menu == 5) {
//				if(loginOk) {
//					service.tourCancel();
//				}
//				else {
//					service.tourCancel1();
//				}
//			} else if (menu == 6) {
//				if(loginOk) {
//					service.joinDelete();
//				}
//				else {
//					service.joinList();
//				}
//			} else if (menu == 0) {
//				break;
//			} else {
//				System.out.println("다시입력");
//			}
//			System.out.println();
//		}
//		System.out.println("프로그램 종료");
//
	}

}
