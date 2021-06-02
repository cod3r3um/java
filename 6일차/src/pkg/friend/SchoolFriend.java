package pkg.friend;

import pkg.Friend;

public class SchoolFriend extends Friend {
	
	String bday;

	public SchoolFriend() {}
	
	public SchoolFriend(String sort, String name, String tel) {
		super(sort, name, tel);
	}

	public SchoolFriend(String sort, String name, String tel, String bday) {
		super(sort, name, tel);
		this.bday = bday;
	}

	@Override
	public void print() {
//		super.print();
//		System.out.println("birthday: " + bday);
		System.out.printf("학교친구: %20s %20s %20s %20s\n", sort, name, tel, bday);
	}
	
	

	
}
