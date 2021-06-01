package co.micol.fly;

//다중상속 불가 extends + only 1
public class Superman extends Human implements Flyer {

	public Superman() {
		System.out.println("생성자");
	}
	
	@Override
	public void takeoff() {
		System.out.println("하늘로 날아오르다");
	}
	
	@Override
	public void fly() {
		System.out.println("새처럼 날아가다");
	}
	
	@Override
	public void land() {
		System.out.println("땅에 착륙하다");
	}
}
