package pkg.friend;

import pkg.Friend;

public class AppMain {
	public static void main(String[] args) {
		
		Friend f = new CompanyFriend("예담", "피비", "1111", "과장");
		f.print();
		
		Friend f1 = new SchoolFriend("신명", "모니카", "2222", "941116");
		f1.print();
		
		// 다형성 (전제 조건: 상속 받고 오버로딩)
		// 1. 부모타입의 참조변수가 자식객체를 참조 가능
		// 2. 메소드 실행하면 참조대상의 메소드가 호출되므로 결과 다름
		FriendManager manager = new FriendManager();
		for(Friend fr : manager.friends) {
			if (fr instanceof SchoolFriend)
			fr.print();
		}
	}
}
