package 열거타입;

import java.util.Scanner;

public class EnumWeekExample {
	public static void main(String[] args) {
		
		// 1. 요일명
		// String week = "SUA";		// 직접 변수를 줄 때는 오타 발생 가능성
		
		// 2. 배열
//		String [] week = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
//		String today = week [6];
		
		// 3. enum
//		Week yesterday = Week.SUN;
//		Week today = Week.MON;
		
//		Scanner scanner = new Scanner(System.in);
//		int menu = 0;
//		do {
//			System.out.println("1. 등록 2. 수정 3. 삭제 0. 종료");
//			menu = scanner.nextInt();
//			switch (menu) {
//			case 1: System.out.println("등록");
//				break;
//			case 2: System.out.println("수정");
//				break;
//			case 3: System.out.println("삭제");
//				break;
//			}
//		} while(menu != 0);
//			System.out.println("종료");
			
			
		Scanner scanner = new Scanner(System.in);
		MENU menu = null;
		
		do {
			MENU.print();
			int menuno = scanner.nextInt();
			menu = MENU.getMenu(menuno);
			switch (menu) {
			case 등록: System.out.println("등록");
				break;
			case 수정: System.out.println("수정");
				break;
			case 삭제: System.out.println("삭제");
				break;
			case 조회: System.out.println("조회");
				break;
			}
		} while (menu != MENU.종료);
		System.out.println("end");

	}

}
