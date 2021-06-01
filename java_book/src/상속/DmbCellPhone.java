package 상속;

public class DmbCellPhone extends CellPhone{
	
	int channel;
	
	public DmbCellPhone() {
		super();	//부모 생성자 소환 (생략 가능)
		System.out.println("DmbCellPhone 생성자");
	}
	
	public DmbCellPhone(String model, String color, int channel) {
		super(model, color);	//부모 생성자는 항상 가장 상단에 위치
		this.model = model;
		this.color = color;
		this.channel = channel;
		System.out.println("DmbCellPhone 생성자");
	}
	
	void turnOnDmb() {
		System.out.println("채널" + channel + "번 DMB 방송 수신 시작");
	}
	
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
	
	void changeChannel() {
		this.channel = channel;
		System.out.println("채널 변경");
	}

	@Override	// 재정의: 상속 받은 메서드를 수정		// != 오버 로딩(중복 정의)
	void powerOn() {
		// super.powerOn();
		System.out.println("Dmb 전원 ON");
	}
	
	
	
}
