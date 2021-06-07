package 연산자;

public class 관계연산 {
	public static void main(String[] args) {
		
		int x = 10;
		int y = 10;
		
		// 첫 번째 관계식 결과가 false라면 두 번째 관계식은 계산 안 함
//		if(y++ > 10 && x++ >10) {
//			System.out.println("A");
//		} else {
//			System.out.println("B");
//		}
//		
//		System.out.println(x);
//		System.out.println(y);
		
		if(y++ > 10 | x++ >10) {
			System.out.println("A");
		} else {
			System.out.println("B");
		}
		
		System.out.println(x);
		System.out.println(y);
	}

}
