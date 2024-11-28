package day_1128;

import java.util.ArrayList;
import java.util.List;

public class BookServiceImpl implements BookService{

	private List<Book> bookList = null;
	
	public BookServiceImpl() {
		super();
		bookList = new ArrayList<Book>();
	}

	public BookServiceImpl(List<Book> bookList) {
		super();
		this.bookList = bookList;
	}

	public List<Book> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}

	@Override
	public void addBook(Book book) {
		//중복 체크 코드 필요....
		bookList.add(book);
	}

	@Override
	public List<Book> listAllBooks() {
		return bookList;
	}

}
