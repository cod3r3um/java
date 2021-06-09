package co.friend.view;

import java.util.List;

import co.friend.access.FriendAccess;
import co.friend.access.FriendDAO;
import co.friend.model.Friend;
import co.friend.util.ScannerUtil;

public class FriendCliApp {
	
//	FriendList friendList = new FriendList();
	FriendAccess friendList = new FriendDAO();
	
	// 프로그램 시작
	public void start() {
		int menunum;
		do {
			menuTitle();	// 메뉴 출력
			menunum = ScannerUtil.readInt("입력");	// 메뉴 선택
			switch (menunum) {	// 실행
			case 1: insert();		break;
			case 2:	update();		break;
			case 3:	delete();		break;
			case 4:	selectAll();	break;
			case 5:	findName();		break;
			case 6:	findTel();		break;
			
			}
			
		} while (menunum != 0);
	}

	// 메뉴 출력
	public void menuTitle() {
		System.out.println(" === 친구 관리 === ");
		System.out.println(" 1. 친구 추가 ");
		System.out.println(" 2. 친구 수정 ");
		System.out.println(" 3. 친구 삭제 ");
		System.out.println(" 4. 전체 조회 ");
		System.out.println(" 5. 이름으로 조회 ");
		System.out.println(" 6. 번호로 조회 ");
		System.out.println(" 0. 종료 ");
	}
	
	// 등록
	public void insert() {
		Friend friend = ScannerUtil.readFriend();
		friendList.insert(friend);
	}
	
	// 이름으로 검색해서 전화번호 수정
	public void update() {
		Friend friend = new Friend();
		friend.setName(ScannerUtil.readStr("수정할 이름을 입력하세요. > "));
		friend.setTel(ScannerUtil.readStr("수정할 번호를 입력하세요. > "));
		friendList.update(friend);
	}
	
	// 이름으로 검색해서 삭제
	public void delete() {
		String name = ScannerUtil.readStr("삭제할 이름을 입력하세요. > ");
		friendList.delete(name);
	}
	
	// 전체 조회
	public void selectAll() {
		List <Friend> list = friendList.selectAll();
		for(Friend friend : list) {
			System.out.println(friend);
		}
	}

	// 이름 검색
	public void findName() {
		String name = ScannerUtil.readStr();
		Friend friend = friendList.selectOne(name);
		System.out.println(friend);
	}
	
	// 번호 검색
	private void findTel() {
		String tel = ScannerUtil.readStr();
		Friend friend = friendList.findTel(tel);
		System.out.println(friend);		
	}
	
}
