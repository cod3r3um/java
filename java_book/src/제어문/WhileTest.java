package 제어문;

public class WhileTest {
	public static void main(String[] args) {
		
		// 1~10 for문
		int sum = 0;
		for (int i = 1; i<= 10; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		int i = 1;
		int sum1 = 0;
		while (i<=10) {
			sum1 += i;
			i++;
		}
		System.out.println(sum1);
		
		int i1 = 1;
		sum = 0;
		do {	// do 먼저 실행 후 조건 비교
			sum += i1;
			i1++;
		} while(i1<=10);
		
		System.out.println(sum);
		
	}

}
