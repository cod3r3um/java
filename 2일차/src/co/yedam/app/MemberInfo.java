package co.yedam.app;

import java.util.Scanner;

public class MemberInfo {

	String name;	//이름
	String id;		//주민번호
	String tel;		//전화번호
	double height;	//몸무게
	double weight;	//키
	
	double result = 0;
	String s = "";
	
	Scanner scanner = new Scanner(System.in);
	
	void heightWeightInput() {
		System.out.print("몸무게(kg)를 입력하세요. > ");
		weight = scanner.nextDouble();
		System.out.print("키(m)를 입력하세요. > ");
		height = scanner.nextDouble();
		
	}
	
	String bmi() {
		result = weight / (height * height);
		// 코드 추가
		if (result < 18.5) {
			s = "저체중";
		}
		else if (result < 23) {
			s = "정상";
		}
		else if (result < 25) {
			s = "과체중";
		}
		else {
			s = "고도비만";
		}
		return s;
		
	}

	void input() {
		System.out.print("1. 이름: ");
		name = scanner.next();
		System.out.print("2. 주민번호 앞 6자리: ");
		id = scanner.next();
		System.out.print("3. 전화번호: ");
		tel = scanner.next();
	}
	
	void print() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(tel);
	
	}
}
