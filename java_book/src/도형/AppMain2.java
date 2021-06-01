package 도형;

public class AppMain2 {
	public static void main(String[] args) {
		Shape s = new Rect(4,5);	//부모타입 자식객체 참조가능
		execute(s);
		
		s = new Circle(4);
		execute(s);
	}
	
	public static void excute(Shape s) {
		if(s instanceof Drawable) {
			((Drawable)s).draw();
		}
		if(s instanceof Movable) {
			((Movable)s).move();
		}
	}
	
	public static void execute(Shape s) {
				s.area();					// 다형성: 참조대상의 메소드 호출
	}

}
