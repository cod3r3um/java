package 스레드;

public class 동기화 {
	public static void main(String[] args) {
		
		// 공유 객체
		Calculator calculator = new Calculator();
		
		User1 user1 = new User1();
		user1.setCalculator(calculator);	// 100 2초 대기
		
		User2 user2 = new User2();
		user2.setCalculator(calculator);	// 50 2초 대기
		
		user1.start();
		user2.start();
		
	}

}
