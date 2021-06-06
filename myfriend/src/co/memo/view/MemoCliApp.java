package co.memo.view;

import java.util.Scanner;

import co.friend.util.ScannerUtil;
import co.memo.access.MemoList;
import co.memo.model.Memo;

public class MemoCliApp {
	static Scanner scanner = new Scanner(System.in);
	
	MemoList memoList = new MemoList();
	
	public void start() {
		int menunum;
		do {
			menuTitle();
			menunum = ScannerUtil.readInt("입력");
			switch (menunum) {
			case 1: insert();		break;
			case 2: update();		break;
			case 3: delete();		break;
			case 4: selectAll();	break;
			case 5: findDate();		break;
			case 6: findContent();	break;
			}
		} while (menunum != 0);
	}
	
	public void menuTitle() {
		System.out.println("=== 메모 관리 ===");
		System.out.println("| 1. 메모 추가 |");
		System.out.println("| 2. 메모 수정 |");
		System.out.println("| 3. 메모 삭제 |");
		System.out.println("| 4. 전체 조회 |");
		System.out.println("| 5. 날짜로 조회 |");
		System.out.println("| 6. 내용으로 조회 |");
	}

	private void findContent() {
		// TODO Auto-generated method stub
		
	}

	private void findDate() {
		// TODO Auto-generated method stub
		
	}

	private void selectAll() {
		// TODO Auto-generated method stub
		
	}

	private void delete() {
		// TODO Auto-generated method stub
		
	}

	private void update() {
		Memo memo = new Memo();
		memo.setDate(readStr("수정할 날짜를 입력하세요. > "));
		memo.setContent(readStr("수정할 내용을 입력하세요. > "));
		
	}

	private void insert() {
		Memo memo = readMemo();
		memoList.insert(memo);
	}

	
	public static int readInt() {
		int result = 0;
		while (true) {
			try {
				String temp = scanner.next();
				result = Integer.parseInt(temp);
				break;
			} catch (Exception e) {
				System.out.println("숫자 형식이 아닙니다.");
			}
		}
		return result;
	}

	public static Memo readMemo() {
		System.out.println("날짜, 내용 > ");
		String result = scanner.next();
		String[] arr = result.split(",");
		Memo memo = new Memo(arr[0], arr[1]);
		return memo;
	}
	
	public static String reatStr() {
		String result = "";
		try {
			result = scanner.next();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	
	
}
