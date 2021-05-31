package co.yedam.member;

import java.util.Scanner;

import co.yedam.own.ArrayApp;

public class MemberServiceExample {

	public static void main(String[] args) {
		MemberService memberService = new MemberService();
//		boolean result = memberService.login("hing", "12345");
//		if(result) {
//			System.out.println("로그인 되었습니다.");
//			memberService.logout("hong");
//		} else {
//			System.out.println("id 또는 password가 올바르지 않습니다.");
//		}

		memberService.insert("hong", "12345", "홍길동", 0);
		memberService.insert("kim", "1111", "김유신", 0);
		memberService.insert("choi", "2222", "최기자", 0);
		
		memberService.printList();
		memberService.printMember(1);

		System.out.println(memberService.login("kim", "1111"));
		System.out.println(memberService.login("kim", "1234"));
	
		
		
		
		
		MemberService app = new MemberService();
		Scanner scanner = new Scanner(System.in);
		
		boolean run = true;
		int selectNo = 0;
		while (run) {
			System.out.println("1.등록 2.전체조회 3.번호로 조회 4.로그인 5.id로 조회 6. 종료");
			System.out.print("선택> ");
			selectNo = scanner.nextInt();
			if (selectNo == 1) {
				app.insert();
			} else if(selectNo == 2) {
				app.printList();
			} else if(selectNo == 3) {
				app.printMember();
			} else if(selectNo == 4) {
				app.login();
			} else if(selectNo == 5) {
				app.searchId();
			}else if(selectNo == 6) {
				break;
			}
		}
		
		System.out.println("종료");
	}

}
