package co.friend.access;



import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

import co.friend.model.Friend;

public class FriendList implements FriendAccess {
	
	ArrayList<Friend> friends;
	
	String path = "d:/temp/friend.txt";
	
	// 오픈
	public void open() {
		try {
			Scanner scanner = new Scanner(new File(path));
			while (true) {
				if (! scanner.hasNext()) break;
				String str = scanner.next();
				String[] arr = str.split(",");
				friends.add(new Friend(arr[0], arr[1], arr[2]));
			}
			scanner.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public FriendList() {
		friends = new ArrayList<Friend>();
		open();
	}
	
	// 저장
	public void save() {
		try {
			BufferedWriter fw = new BufferedWriter(new FileWriter(path));
			for (Friend f : friends) {
				fw.write(String.format("%s, %s, %s\n", f.getSort(), f.getName(), f.getTel()));
			}
			fw.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	// 등록
	@Override
	public void insert(Friend friend) {
		friends.add(friend);
		save();
	}

	// 수정
	@Override
	public void update(Friend friend) {
		for (Friend f:friends) {
			if (f.getName().equals(friend.getName())) {
				f.setTel(friend.getTel());
				save();
			}
		}
	}

	// 삭제
	@Override
	public void delete(String name) {
		for (Friend f:friends) {
			if (f.getName().equals(name)) {		// contains
				friends.remove(f);
				save();
				break;
			}
		}
	}

	// 전체 조회
	@Override
	public ArrayList<Friend> selectAll() {
		return friends;
	}

	// 검색
	@Override
	public Friend selectOne(String name) {
		for(Friend f : friends) {
			if (f.getName().equals(name)) {		// contains
				return f;
			}
		}
		return null;
	}
	
	
	public Friend findTel(String tel) {
		for(Friend f : friends) {
			if (f.getTel().contains(tel)) {
				return f;
			}
		}
		return null;
	}
	
}
