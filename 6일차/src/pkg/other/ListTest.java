package pkg.other;

import java.util.ArrayList;

/*
 ArrayList에 데이터를 저장하고 조회하는 기능을 구현
 */

// 한 건의 메모에는 어떤 정보를 입력
// 기능 = 메소드: 동작 - 전체 조회, 제목 검색, 내용 검색, 등록
class Memo {
	String title;		// 필드 = 데이터
	String content;
	public Memo(String title, String content) {
		super();
		this.title = title;
		this.content = content;
	}
	@Override
	public String toString() {
		return "Memo [title=" + title + ", content=" + content + "]";
	}
	
	

}

public class ListTest {
	ArrayList<Memo> list = new ArrayList<Memo>();
	
	// 전체 조회
	public void selectAll() {
		for(int i=0; i<list.size(); i++) {
			Memo memo = list.get(i);
			System.out.println(memo.title + "\n" + memo.content);
		}
	}
	
	// 제목 검색
	public void findTitle(String title) {
		for(int i=0; i<list.size(); i++) {
			Memo memo = list.get(i);
			if (memo.title.equals(title)) {				// 완전 일치
				System.out.println(memo.title + "\n" + memo.content);
			}
		}
	}
	
	// 내용 검색
	public void findContent(String content) {
		for(int i=0; i<list.size(); i++) {
			Memo memo = list.get(i);
			if (memo.content.contains(content)) {		// 부분 일치
				System.out.println(memo.title + "\n" + memo.content);				
			}
		}
	}
	
	// 등록
	public void insert() {
		// 키보드로 입력받고
		Scanner scanner;
		Memo memo = new Memo();
		memo.title = scanner.next();
		memo.content = 
		list.add(memo);
		
	}
	
	public static void main(String[] args) {
		ListTest listTest = new ListTest();
//		listTest.list.add(new Memo("java", "studying java"));
//		listTest.list.add(new Memo("javachip", "study hard"));
//		listTest.list.add(new Memo("Sasha", "web developer to be"));
		
		listTest.insert();
		listTest.insert();
		listTest.selectAll();
//		listTest.findTitle("java");
//		listTest.findContent("developer");
	}
	
}
