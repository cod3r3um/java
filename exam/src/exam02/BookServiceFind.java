package exam02;

import java.util.List;
import java.util.Scanner;

public class BookServiceFind implements BookService {

	
	

	public void execute(BookList list) {
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		List<Book> list1 = list.findName(name);
		System.out.println(list1);

		
	}

	
	

}
