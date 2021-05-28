package co.yedam.star;

public class StarApp {

	//삼각형 출력
	void draw(int cnt) {
		for(int i=1; i<cnt; i++) {
			System.out.println(pad('#', i));
		}
	}		
	
	//역삼각형
	void drawInvert(int cnt) {
		for (int i=1; i<=cnt; i++) {
			System.out.println(pad('*', cnt+1-i));
		}
//		for (int i=8; i>0; i--) {
//		System.out.println(pad('*', i));
//	}
	}
	
	//이등변 삼각형
	void drawEq(int cnt) {
		for (int i=1; i<=cnt; i++) {
			System.out.print(pad(' ', cnt-i));	//공백 출력
			System.out.println(pad('*', (i*2)-1));
		}
	}
	
	//이등변 역삼각형
	void drawEqInvert(int cnt) {
	for (int i=1; i<=cnt; i++) {
		System.out.print(pad(' ', i));	//공백 출력
		System.out.println(pad('*', (cnt-i)*2+1));
	}
		}
	
	
	
	
	
	
	
	
	
//	(*, 10) ---> "**********"
	String pad(char s, int cnt) {
		String result = "";
		for (int i=0; i<cnt; i++) {
			result += s;
		}
		return result;
	}
}
