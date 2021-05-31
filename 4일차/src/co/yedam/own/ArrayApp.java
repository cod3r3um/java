package co.yedam.own;

import java.util.Scanner;

public class ArrayApp {

	int[] arr; // 성적
	int studentNum; // 학생수
	Scanner scanner = new Scanner(System.in);

	void init() {
		System.out.println("인원수 > ");
		studentNum = scanner.nextInt();
		arr = new int[studentNum];
	}

	// 배열에 초기값 지정
	void input() {
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d번째 학생> ", i+1);
			arr[i] = scanner.nextInt();
		}
	}

	void print() {
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("scores[%d]> %d\n", i, arr[i]);
		}
		System.out.println();
	}

	void total() {
		int total_num = 0;
		for (int i = 0; i < arr.length; i++) {
			total_num += arr[i];
		}
		System.out.println("합계=" + total_num);
		System.out.println();
	}

	void max() {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("최고 점수:" + max);
	}
	
	void avg() {
		int result = 0;
		double avg_num = 0;
		for (int i=0; i<arr.length; i++) {
			result += arr[i];
			avg_num =  result / arr.length;
		}
		System.out.println("평균 점수:" + avg_num);
	}

	public static void main(String[] args) {
		ArrayApp app = new ArrayApp();
		Scanner scanner = new Scanner(System.in);
		
		boolean run = true;
		int selectNo = 0;
		while (run) {
			System.out.println("1.학생수 2.정수입력 3.점수리스트 4. 분석 5. 종료");
			System.out.print("선택> ");
			selectNo = scanner.nextInt();
			if (selectNo == 1) {
				app.init();
			} else if(selectNo == 2) {
				app.input();
			} else if(selectNo == 3) {
				app.print();
			} else if(selectNo == 4) {
				app.max();
				app.avg();
			} else if(selectNo == 5) {
				run = false;
			}
		}
		
		System.out.println("프로그램 종료");

	}

}
