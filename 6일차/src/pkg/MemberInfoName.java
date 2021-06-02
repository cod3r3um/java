package pkg;

public class MemberInfoName {
	public static void main(String[] args) {
		
		MemberInfo member1 = MemberInfo.getInstance();
		member1.names[0] = "사샤";
		
		MemberInfo member2 = MemberInfo.getInstance();
		member1.names[1] = "모니카";
		
		MemberInfo member3 = MemberInfo.getInstance();
		member1.names[2] = "레이첼";
		
		member1.print();
		member2.print();
		member3.print();
	}
}
