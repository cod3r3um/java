package co.micol.tv;

public class LgTV implements RemoteControl {

	public LgTV() {
		System.out.println("Lg TV 객체 생성");
	}

	@Override
	public void powerOn() {
		System.out.println("Lg TV -- 전원 ON");
		
	}

	@Override
	public void powerOff() {
		System.out.println("Lg TV -- 전원 OFF");
		
	}

	@Override
	public void volumeUp() {
		System.out.println("Lg TV -- 볼륨 UP");
		
	}

	@Override
	public void volumeDown() {
		System.out.println("Lg TV -- 볼륨 DOWN");
		
	}
	
}
