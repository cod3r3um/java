package pkg.friend;

import pkg.Friend;

public class FriendAppMain {
	public static void main(String[] args) {
		FriendList list = new FriendList();
		// 등록
		Friend f = new CompanyFriend("예담", "피비", "3333");	
		list.insert(f);
		f = new CompanyFriend("신명", "모니카", "9999");	
		list.insert(f);
		f = new CompanyFriend("예담", "조이", "5555");	
		list.insert(f);
		
		// 검색
		System.out.println(list.selectOne("피비"));
		
		// 수정
		f = new SchoolFriend("신명", "레이첼", "7777");
		list.update(f);
		
		// 삭제
		list.delete("피비");
		
		// 전체조회
		list.selectAll();
		
	}

}
