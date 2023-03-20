package Trip1;

import java.util.Scanner;


public class TourService {
	TourRepository tour = new TourRepository();
	Scanner sc = new Scanner(System.in);
	
	
	public void save() {
		TourDTO tourDTO = new TourDTO();
//		System.out.println("BoardDTO 객체 생성 후 " + boardDTO);
		System.out.print("이름> ");
		tourDTO.setName(sc.nextLine());
		System.out.print("ID > ");
		tourDTO.setId(sc.next());
		System.out.print("Password> ");
		tourDTO.setPassword(sc.next());
		System.out.print("나이> ");
		tourDTO.setAvg(sc.nextInt());
		sc.nextLine();
		boolean success = tour.save(tourDTO.getNum(), tourDTO);
		if (success) {
			System.out.println( "회원가입을 축하합니다");
		} else {
			System.out.println("다시 입력해주세요");
		}
	}
	
	public void update() {
		System.out.print("수정할 ID번호 ");
		String num = sc.next();
		sc.nextLine();
		TourDTO T = tour.findById(num);
		if (T == null) {
			System.out.println("조회할 수 없는 글번호 입니다");
		} else {
			TourDTO tourDTO = new TourDTO();
			System.out.print("수정할 이름> ");
			tourDTO.setName(sc.next());
			System.out.print("수정할 비밀번호> ");
			tourDTO.setPassword(sc.next());
			System.out.print("수정할 나이> ");
			tourDTO.setAvg(sc.nextInt());
			sc.nextLine();
			if (tour.update(tourDTO, num)) {
				System.out.println("업데이트 성공");
			} else {
				System.out.println("업데이트 실패");
			}
		}
	}

}
