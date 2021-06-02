package pkg.inheritence;

public class MainApp {
	public static void main(String[] args) {
	
		A a = new D();			// 자동 형변환
		int temp = ((D)a).sd;	// 강제 형변환 (부모 자식간에만 가능함)
		
		A o = new A();
		temp = ((D)o).sd;		// 런타임 (실행 시) 오류
		
		// 상속 관계에 있는 클래스들은 true 출력됨
		System.out.println(a instanceof A);
		System.out.println(a instanceof B);
		System.out.println(a instanceof D);
		System.out.println(a instanceof X);
		
		
		B b = new B();
		b = new D();
		// b = new C();
	}
	
}
