package day01;

public class CharTest {
	public static void main(String[] args) {
		
		char c1 = 'A';		// �빮�� A = 65
		int c2 = c1 + 32;
		
		System.out.println(c2 + " " + (char)c2);	// �ҹ��� a = 97
		
		char c3 = '\uac00';
		char c4 = 0xac00;
		char c5 = '��';
		char c6 = 44032;
		
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		
		String s = "\"\thello\"\neveryone\\";
		
		System.out.println(s);
	}

}
