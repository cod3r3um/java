package pkg.other;

import pkg.DateUtil;
import pkg.ProjectInfo;
import pkg.Count;
import pkg.Car;

public class AppMain {
	public static void main(String[] args) {
		
		System.out.println(DateUtil.curDate());
		
		System.out.println(ProjectInfo.name);
		
		Count count1 = new Count();
		Count.cnt1++;
		count1.setCnt(count1.getCnt2() + 1);
		
		Car car = new Car();
		car.setModel("현대");
		car.setSpeed(100);
		
		Car car2 = new Car("삼성", 50);
		Car car3 = new Car("삼성");
		

	
	}

}
