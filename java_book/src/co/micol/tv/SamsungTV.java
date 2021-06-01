package co.micol.tv;

public class SamsungTV implements RemoteControl{

	public SamsungTV() {
		System.out.println("Samsung TV 객체 생성");
	}
	
	@Override
	public void powerOn() {
		System.out.println("Samsung TV -- 전원 ON");
		
	}

	@Override
	public void powerOff() {
		System.out.println("Samsung TV -- 전원 OFF");
		
	}

	@Override
	public void volumeUp() {
		System.out.println("Samsung TV -- 볼륨 UP");
		
	}

	@Override
	public void volumeDown() {
		System.out.println("Samsung TV -- 볼륨 DOWN");
		
	}
	
	
}
