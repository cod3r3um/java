package 배열;
/*
배열: 크기 고정
순차적으로 데이터를 저장하고 읽는 용도
추가와 삭제가 번거로움
 */

public class 배열초기화 {

	public static void main(String[] args) {
		
		//1차원 배열
		//배열 선언
		int[] a;	//배열 또한 객체이다. -> new로 힙 영역에 메모리 할당해야함
		a = new int[10];		//미리 갯수를 정해야 한다. 정해진 갯수는 바꿀 수 없다.
		
		//초기화		
		a[0] = 10;		//0~9
		a[1] = 20;		//초기값은 0으로 설정되어 있다.
		a[2] = 100;
		a[3] = 50;
		
		//삭제 (인덱스 다음 항목이 앞으로 이동하는 개념)
		for(int i=2; i<a.length; i++) {
			a[i-1] = a[1];
		}
		
		//배열 출력
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
		//배열 선언과 초기화를 한꺼번에 하기
		int[] b = {100, 200, 300};		// = new int[3] {100, 200, 300};
		System.out.println("크기: " + b.length);
		
	}
}
