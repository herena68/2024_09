package day_1212;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class BookServiceImpl implements BookService{

	private List<Book> bookList;
	
	public BookServiceImpl() {
		super();
		
		try {
			bookList = (List<Book>) BookDAO_File.load("books.data");
		} catch (FileNotFoundException e) {
			System.out.println("books.dat 파일이 없어서  비어있는 bookList 생성 ");
			bookList = new ArrayList<Book>();
		}
		
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
