package pkg.friend;

import pkg.Friend;

public class CompanyFriend extends Friend {

	String duty;
	
	public CompanyFriend() {}

	public CompanyFriend(String sort, String name, String tel) {
		super(sort, name, tel);
	}

	public CompanyFriend(String sort, String name, String tel, String duty) {
		super(sort, name, tel);
		this.duty = duty;
	}

	@Override
	public void print() {
//		super.print();
//		System.out.println("duty: " + duty);
		System.out.printf("회사친구: %20s %20s %20s %20s\n", sort, name, tel, duty);
	}

	
}
