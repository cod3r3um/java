package 도형;

public class AppMain {

	public static void main(String[] args) {

//		Shape s = new Rect(4,5); 
//		s.area();
//		s.print();
//		
//		s = new Tri(4,5);
//		s.area();
//		s.print();

//		Shape[] s = new Shape[3];
//		s[0] = new Rect(4, 5);
//		s[1] = new Circle(5);
//		s[2] = new Tri(4, 5);
//
//		for (Shape temp : s) {
//			temp.area();
//			temp.print();
//		}

		Drawable[] s = new Drawable[3];
		s[0] = new Rect(4, 5); // 자식타입 부모타입으로 자동 형변환
		s[1] = new Circle(5);
		s[2] = new Tri(4, 5);
		short a = 5;

		for (Drawable drw : s) {
			drw.draw();
//			if (drw instanceof Rect) {
//				((Rect) drw).area(); // 부모타입을 자식타입으로 강제 형변환
//			} else if (drw instanceof Circle) {
//				((Circle) drw).area();
//			} else if (drw instanceof Tri) {
//				((Tri) drw).area();
//			}

			if (drw instanceof Shape) {
				((Shape) drw).area();
			}
			if (drw instanceof Movable) {
				((Movable) drw).move();
			}

		}
	}
}
