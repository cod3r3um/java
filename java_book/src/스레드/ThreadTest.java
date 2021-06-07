package 스레드;
/**
 Thread 상속
 * 
 *
 */

public class ThreadTest {
	public static void main(String[] args) {
		
		// 동시 실행 (순서 제어 불가)
		
		Print100 print100 = new Print100();
		print100.setPriority(Thread.MIN_PRIORITY);
		System.out.println(print100.getName());
		print100.start();
		
		Print1000 print1000 = new Print1000();
		Thread thread = new Thread(print1000);
		thread.start();

		Thread thread1 = new Thread(new Print10000());
		thread1.start();
		
		// 익명 개체 선언 방법 (클래스 선언과 객체 생성을 동시에)
		Thread thread2 = new Thread(new Runnable(){
			@Override
			public void run() {
				for (int i=2001; i<=2100; i++) {
					System.out.println(i);
					try {
						Thread.sleep(100);
					} catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
			}		
		});
		thread2.start();
		
		// 람다식: 익명객체 -> 구현클래스 구현메소드가 1개일 때
		Thread thread3 = new Thread(() -> {
			for (int i=3001; i<=3100; i++) {
				System.out.println(i);
				try {
					Thread.sleep(100);
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		thread3.start();
		
	}

}
