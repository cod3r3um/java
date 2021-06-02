package pkg.collect;

public class StringTest {
	public static void main(String[] args) {
		
		String str = "hello everybody!";
		char c = str.charAt(1);
		System.out.println("인덱스 위치의 글자: " + str.charAt(0));
		System.out.println("인덱스 위치의 글자: " + c);
		System.out.println("인덱스 글자 자르기: " + str.substring(6,11));
		System.out.println("포함된 글자 찾기: " + str.contains("body"));
		System.out.println("끝나는 글자 찾기: " + str.endsWith("!"));
		System.out.println("시작하는 글자 찾기:" + str.startsWith("hel"));
		
		String num = "210602-1234567";
		String[] arr = num.split("-");
		System.out.println(arr[0]);
		System.out.println(arr[1].charAt(0));
		
		String path = "c:/temp/image/a.jpg";
		int pos = path.indexOf("/");	// "/"의 위치를 인덱스 넘버로 찾기
		int pos2 = path.lastIndexOf("/");
		int pos3 = path.lastIndexOf("/", pos2+1);
		System.out.println(pos + ":" + pos2);
		
		// 확장자 잘라내기: (마지막 .의 위치 +1부터 끝까지) lastIndexOf, substring
//		System.out.println("확장자: " + path.substring(path.lastIndexOf(".")+1));
		System.out.println("확장자: " + StringUtil.getFilename(path));
		System.out.println("파일명: " + StringUtil.getExtention(path));
		System.out.println("경로: " + StringUtil.getPath(path));
		
		String b = "문자열 문자";
//		String d = new String(b.getBytes(),"euc-kr");		
		
		b = b.replace("문자", "숫자");
		System.out.println(b);
		
		
	}

}
