package co.yedam.app.score;

import java.util.Scanner;

/* 
 * 성적처리 프로그램
 * 국어, 영어, 수학 입력
 * 총점, 평균, 등급 계산
 */
public class ScoreApp {
	int kor;
	int eng;
	int mat;
	int sum;
	float avg;
	char grade;
	
	Scanner scanner = new Scanner(System.in);
	
	//성적입력
	void input() {
		System.out.print("국어 성적을 입력하세요. > ");
		kor = scanner.nextInt();
		System.out.print("영어 성적을 입력하세요. > ");
		eng = scanner.nextInt();
		System.out.print("수학 성적을 입력하세요. > ");
		mat = scanner.nextInt();
		return;	   //return 뒤에 값이 없으면 void
	}
	
	//합계 계산
	int getSum() {
		sum = kor + eng + mat;
		return sum;
	}
	
	//평균 계산하고 리턴
	 float getAvg() {
		 avg = sum / 3;
		 return avg;
	 }
		 
	 boolean isPass() {
		 if (avg > 60) {
			 return true;
		 }
		 else {
			 return false;
		 }
		 
	 }
		 
	 
	 char getGrade() {
		switch((int)avg/10) {
		case 10 :
		case 9 :
		case 8 : 	grade = '상'; break;
		case 7 :
		case 6 : 	grade = '중'; break;
		default :	grade = '하'; break;
			}
		 return grade;
	 }
}