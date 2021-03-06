package pkg.friend;

import java.util.List;

import pkg.Friend;

/**
 * 
 * 인터페이스: 상수필드 + 추상메소드
 * 상수필드는 기본적으로 public static final
 * 메소드는 기본적으로 public abstract
 *
 * {} 중괄호 없는 ; 콜론: 추상
 * 
 */

// 친구관리 개발시 개발 표준을 정해줌

public interface FriendAccess {

	//등록
	public void insert(Friend friend);
	
	//수정
	public void update(Friend friend);
	
	//삭제
	public void delete(String name);
	
	//전체조회
	public void selectAll();
	
	//단건조회
	public Friend selectOne(String name);
	
}
