package pkg.collect;

import java.util.ArrayList;
import java.util.LinkedList;

import javax.imageio.plugins.tiff.FaxTIFFTagSet;

import pkg.Friend;
import pkg.friend.CompanyFriend;
import pkg.friend.SchoolFriend;

public class ListTest {
	public static void main(String[] args) {
		
//		ArrayList<Object> list = new ArrayList<Object>();
//		list.add("사과");
//		list.add(0, "바나나");
//		list.add("키위");
//		System.out.println(list);
		
		LinkedList<Friend> list = new LinkedList<Friend>();
		list.add(new Friend("야담", "피비", "1111"));
		list.add(0, new CompanyFriend("야담", "챈들러", "5555"));
		list.add(new SchoolFriend("야담", "모니카", "2222"));
		System.out.println(list);
		
		for(Friend f : list) {
			System.out.println(f.getName());
		}
		
		System.out.println("======");
		
		// 삭제
		list.remove(0);
		for(Friend f : list) {
			System.out.println(f.getName());
		}
		Friend fr = list.get(0);
		System.out.println("첫 번째 이름: " + fr.getName());
		
		// 마지막 이름: size()
		System.out.println("마지막 이름: " + list.get(list.size()-1).getName());
		
		// 수정
		list.set(1, new Friend("센트럴펄크", "조이", "3333"));
		for(Friend f : list) {
			System.out.println(f.getName());
		}

		
	}


}
