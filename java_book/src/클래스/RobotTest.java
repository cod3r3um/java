package 클래스;

public class RobotTest {
	
	public static void change(int a) {			// 기본타입 변수
		a += 10;
	}
	
	public static void change(Robot robot) {	// 참조변수
		robot.setArm(5);
	}
	
	public static void main(String[] args) {
		
		// 2. 객체 생성
		
		// 생성 후 값 변경하기
		Robot r = new Robot("Sasha", 2, 4);
		change(r);
		System.out.println(r.getArm());
		
//		System.out.println(r.getArm());
//		System.out.println(r.getLeg());
//		
//		// 객체 생성
//		Robot r2 = new Robot("Sasha", 2, 2);
//		
//		
//		// 3. 객체 사용 (= 메서드 호출)
//		r2.print();
		
	}

}
