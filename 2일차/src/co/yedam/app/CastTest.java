package co.yedam.app;

import java.util.Scanner;

/*
 * 형변환 test
 * 형변환: 캐스트 연산자 (타입)
 * 정수형: byte < short <  int  < long
 * 실수형: 			    float < double
 * 
 * 스트링   ---->   byte    		Byte.parseByte(변수)
 * 				  short	  		Short.parseShort
 * 				  int	  		Integer.parseInt
 * 				  long    		Long.parseLong
 * 				  float	  		Float.parseFloat
 * 				  double  		Double.parseDouble
 * 				  char	  		Char.parseChar
 * 				  boolean 		Boolean.parseBoolean
 * 
 * 		  <----		String.valueof()
 */

public class CastTest {

	public static void main(String[] args) {
		//자동형변환
		int a = 10;
		long b = a;
		
		//강제형변환 (큰 값을 작은 값에 담을 때)
		a = (int)b;
		
		//char(문자) <-> int (문자에 해당하는 코드값)
		char c = 'Z';
		System.out.println((int)c);
		int d = 97;
		System.out.println((char)d);
		
		//실수(default = double) -> 정수(default = int)
		double e = 10.5;
		long f = (long)e;    //좌변과 우변의 타입을 맞춰주거나, 좌변의 타입이 더 커야함
		System.out.println(f);
		
		//수식내에서 자동으로 형변환 (더 큰 타입으로 자동전환되어 연산됨)
		double g = 5 + 10.5;
		String h = "hi" + 5;
		System.out.println(h);
		System.out.println("hi" + 5 + 10);		
		System.out.println("hi" + (5 + 10));		
		System.out.println(5 + 10 + "hi");
		
		//정수끼리의 연산 결과는 정수
		System.out.println(5 / 2);
		System.out.println(5 / (double)2);
		double i = 5 / (double)2;
		System.out.println(i);
		
		//스트링 -> int
		String s1 = "123";
		int j = Integer.parseInt(s1);
		
		//int -> 스트링
		String s2 = String.valueOf(10.5);
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("입력: ");
		String greet = scanner.next();
		
		System.out.println(greet);
		
	}
}
