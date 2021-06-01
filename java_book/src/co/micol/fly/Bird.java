package co.micol.fly;

public class Bird extends Animal {

	public Bird() {
		System.out.println("생성자");
	}
	
	public void run() {
		System.out.println("달리다");
	}
	
	public void eat() {
		System.out.println("먹이를 먹다");
	}
	
	public void takeOff() {
		System.out.println("날아오르다");
	}
	
	public void fly() {
		System.out.println("날다");
	}
	
	public void land() {
		System.out.println("착륙하다");
	}
	
	public void layEggs() {
		System.out.println("알을 낳다");
	}
}
