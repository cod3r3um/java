package pkg;

/*
 정적 메소드 안에서는 정적 필드만 접근 가능함
 접근제어자: private > default > protected > public
 			클래스 내부/같은 패키지/(다른 패키지도 가능하지만) 상속
 */

public class DateUtil {
	
	public static String curDate() {			// 메소드
		return "20210610";
	}
	

}
