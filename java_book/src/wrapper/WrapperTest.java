package wrapper;
/*
 1. 기본 데이터형을 객체화
 2. 타입 변환
 */

import java.util.ArrayList;

public class WrapperTest {
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(new Integer(10));
		list.add(new Integer("10"));	// 박싱
		list.add(100);					// Integer 객체로 오토 박싱
		
		Integer a = 100;
		int b = a.intValue();			// 언박싱
		b = a;							// 오토 언박싱
		
		String s = Integer.toString(a);
		
	}

}
