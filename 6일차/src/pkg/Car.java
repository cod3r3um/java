package pkg;

public class Car {
	
	private String model;
	private int speed;
	private boolean stop;
	
	public Car() {}
	
	public Car(String model, int Speed) {
		this.model = model;
		if (speed < 50) {
			speed = 50;
		}
		this.speed = speed;
	}
	
	public Car(String model) {		// 생성자 오버로딩
		this(model, 0);
	}
	
	private String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean isStop() {
		return stop;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
	}

}
