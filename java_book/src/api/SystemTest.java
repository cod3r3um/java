package api;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Field;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class SystemTest {
	public static void main(String[] args) throws URISyntaxException, FileNotFoundException {
		
		System.out.println(System.currentTimeMillis());
		// 파일명 rename, 실행시간
		
		// 0이 아닌 값은 정상 실행
		// System.exit(1);
		
		Map<String, String> map = System.getenv();
		System.out.println(map.get("JAVA_HOME"));
		Iterator<String> iter = map.keySet().iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			System.out.println(key + ":" + map.get(key));
		}
		
		// 가비지 컬렉터: 자바에서 제공하는 메모리 제거 기능 
		// System.gc 

		Field [] fields = Book.class.getDeclaredFields();
		for (Field f : fields) {
			System.out.println(f.getName() + ":" + f.getType());
		}
		
		URI uri  = Book.class.getResource("/resources/menu.txt").toURI();
		System.out.println(uri);
//		Scanner scanner = new Scanner("C:\\Users\\admin\\git\\test2\\java_book\\resources\\menu.txt");
		Scanner scanner = new Scanner(new File(uri));
		System.out.println(scanner.next());
		
	}

}
