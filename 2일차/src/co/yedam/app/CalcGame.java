package co.yedam.app;

import java.util.Scanner;

/*
 * 계산기 게임
 * 사칙연산, 진수변환, 문자값 검사
 * 
 */
public class CalcGame {
	double a;
	double b;
	
	void input() {
		//입력
		Scanner scanner = new Scanner(System.in);
		System.out.print("입력: ");
		String s1 = scanner.next();
		System.out.print("입력: ");
		String s2 = scanner.next();
		//string -> double
		a = Double.parseDouble(s1);
		b = Double.parseDouble(s2);
		scanner.close();	// 안 닫았을 때는 scanner에 밑줄이 생김
	}
	
	//정수값 두 수의 합을 계산하는 메서드(함수)
	double add() {
		return a + b;
	}
//	def add(a, b):
//		return a+b
	
	//두 수의 몫을 계산 (5 / 2 = 2)
	int share() {
		return (int)a / (int)b;
	}
	
	//두 수의 나눈셈 (5 / 2 = 2.5)
	double div() {
		return a / b;
	}
	
	//두 수의 나머지 연산 (5 % 2 = 1)
	int rest() {
		return (int)a % (int)b;
	}
	
	
}