package 클래스;

public class Member {

	String id;
	String name;
	String password;
	int age;

	public Member() {}

	public Member(String id, String name, String password, int age) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", id=" + id + ", password=" + password + ", age=" + age + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Member m = ((Member)obj);
		return this.id.equals(m.id) && this.name.equals(m.name);
	}
	
	

}
