package pkg;

public class AppMain {
	
	static void print() {
		System.out.println("=====");
	}
	
	public static void main(String[] args) {
		
		// ProjectInfo.java
		ProjectInfo info = new ProjectInfo();
//		info.name = "야담";		// name에 final이 붙었기 때문에 결과값 fix 수정불가
		System.out.println(ProjectInfo.name);		// static이 붙었기 때문에 info.를 새로 생성할 필요가 없음

		ProjectInfo.uploadpath = "/upload";
		System.out.println(ProjectInfo.uploadpath);
		
		ProjectInfo info1 = new ProjectInfo();
		System.out.println(info1.version); 		 	// 인스턴스 필드는 객체 생성해야 접근 가능함
		
		// DateUtil.java
		// DateUtil dateUtil = new DateUtil();
		System.out.println(DateUtil.curDate());		// 객체 생성 필요 없이 클래스 이름으로 접근 가능함
		
		// Count
		Count count1 = new Count();
		Count.cnt1++;
		count1.cnt2++;
		
		Count count2 = new Count();
		Count.cnt1++;
		count2.cnt2++;
		
		Count count3 = new Count();
		Count.cnt1++;
		count3.cnt2++;
		
		System.out.println(count1.cnt1 + " : " + count1.cnt2);
		System.out.println(count2.cnt1 + " : " + count2.cnt2);
		System.out.println(count3.cnt1 + " : " + count3.cnt2);
		}
}
