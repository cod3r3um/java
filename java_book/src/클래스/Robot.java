package 클래스;

// 1. 클래스 선언

public class Robot {

	// 필드
	private String name;
	private int arm;	// private: 접근제어자 (클래스 내부에서만 접근 가능)
	private int leg;
	
	// 생성자 (필드 값을 "초기화" 시키기 위해서 생성)
	
	// 기본 생성자 (컴파일러가 기본으로 만들어주는 생성자) (단, 생성자 선언 후에는 직접 기본 생성자 만들어야 함)
	public Robot() {}
	// 생성자 오버 로딩
	public Robot(String name, int arm, int leg) {	// <= 매개변수
		this.arm = arm;					// this는 객체를 참조하는 참조변수
		this.leg = leg;
	}

	// setter: 필드값 변경 (return 필요 없음)
	public void setName(String name) {
		this.name = name;
	}
	public void setArm(int arm) {
		this.arm = arm;
	}
	public void setLeg(int leg) {
		this.leg = leg;
	}
	
	// getter: 필드값 조회
	public String getName() {
		return this.name;
	}
	public int getArm() {
		return this.arm;
	}
	public int getLeg() {
		return this.leg;
	}
	
	// 일반 메서드
	// 접근 제어자 없는 default 상태 (void print({})에서는 같은 패키지 안에 있을 때에만 접근 가능
	public void print() {
		System.out.printf("name: %d arm: %d leg: %d", name, arm, leg);
	}	

}
