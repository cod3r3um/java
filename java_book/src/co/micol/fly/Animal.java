package co.micol.fly;

public abstract class Animal {
	
	public Animal() {
		System.out.println("생성자");
	}
	
	public void run() {
		System.out.println("달리다");
	}
	
	public void eat() {
		System.out.println("먹다");
	}
	
	public void sleep() {
		System.out.println("잠자다");
	}

}
