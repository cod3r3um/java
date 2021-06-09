package co.friend.common;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import co.friend.access.FriendDAO;
import co.friend.model.Friend;

public class CollectionEx4 {
	public static void main(String[] args) {
		
		// 이름, 연락처 출력하세요.
		FriendDAO dao = new FriendDAO();
		Map<String, String> map = dao.getNameTel();
		Set<String> keys = map.keySet();
		Iterator<String> iter = keys.iterator();
		while(iter.hasNext()) {
			String name = iter.next();
			String tel = map.get(name);
			System.out.println("name: " + name + " " + "tel: " + tel.toString());
		}
		
		
		
	}

}
