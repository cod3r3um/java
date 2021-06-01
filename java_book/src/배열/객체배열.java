package 배열;

import java.awt.Point;

/*
객체배열: 배열의 요소 타입이 객체인 경우
 */
public class 객체배열 {

	public static void main(String[] args) {

		// 변수 선언
		Score[] a;
		a = new Score[10];
		a[0] = new Score("홍길동", 100, 90, 80);
		a[1] = new Score("사샤", 100, 80, 100);
		a[2] = new Score("피비", 100, 90, 90);

		// Score 객체 안의 이름만 출력
		for (int i = 0; i < a.length; i++) {
			if (a[i] != null) {
				System.out.println(a[i].name); // 객체 생성 되지 않았을 때는 nullpointer error 발생
			}
		}

		// 선언과 동시에 초기화
		Score[] b = { new Score("홍길동", 100, 90, 80), new Score("사샤", 100, 80, 100), new Score("피비", 100, 90, 90) };

		// 이름과 총점 출력
		// 일반 for문
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i].name + ": " + b[i].total);
		}

		// 확장 for문
		// for(Score score:b) { // : = in(python)
		// System.out.println(score.name + ": " + score.total);
		// }

		//객체배열
		Point[] c = { new Point(10, 10),
					  new Point(30, 10),
					  new Point(30, 30),
					  new Point(10, 30) };
		
		// 확장 for문을 이용하여 x, y좌표를 출력
		for(Point point:c) {
			System.out.println(point.x + " " + point.y); 	//int + int = int 방지 위해 중간에 String 넣어주기
		}
		
		

	}

}