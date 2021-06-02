package pkg.friend;

import java.util.List;

import pkg.Friend;

public class FriendManager implements FriendAccess {
	
	Friend[] friends = new Friend[10];
	
	public FriendManager() {
		friends[0] = new CompanyFriend("예담", "피비", "010-2222-4444");
		friends[1] = new SchoolFriend("신명", "모니카", "010-1111-3333");
		friends[2] = new CompanyFriend("예담", "레이첼", "010-4444-8888");
		friends[3] = new SchoolFriend("신명", "조이", "010-3333-5555");
		friends[4] = new CompanyFriend("예담", "챈들러", "010-1111-9999");			
	}

	@Override
	public void insert(Friend friend) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Friend friend) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Friend friend) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List selectAll() {
		System.out.println("FriendManager");
		return null;
	}

	@Override
	public Friend selectOne(Object key) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
