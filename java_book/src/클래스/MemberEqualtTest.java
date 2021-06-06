package 클래스;

public class MemberEqualtTest {

	public static void main(String[] args) {
		Member m1 = new Member("Jin", "Sasha", "1111", 26);
		Member m2 = new Member(new String("Baek"), "Phoebe", "2222", 26);
		System.out.println(m1 == m2);
		System.out.println(m1.equals(m2));
		
		// Member의 equals 메소드 오버라이딩: id와 name을 비교
		
		
	}
}
