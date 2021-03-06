package exam02;

import java.util.ArrayList;
import java.util.List;

public class BookList extends BookAccess {
	
	ArrayList<Book> books;

	
	public BookList() {
		books = new ArrayList<Book>();
	}
	
	public void insert(Book book) {
		books.add(book);
	}
	
	public List<Book> findName(String name){
		List<Book> book = new ArrayList<Book>();
		for(Book b : books) {
			if(b.getName().contains(name)) {
			book.add(b);
			}
		}
		return book;
	}


}
