package day_11_28;

import java.util.ArrayList;
import java.util.List;

public class BookServiceImpl implements BookService{

	private List<Book> bookList;
	
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
		//중복체크코드 필요해요
		bookList.add(book);
	}

	@Override
	public List<Book> listAllBooks() {
		return bookList;
	}

	
}
