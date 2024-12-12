package day_1212;

import java.util.List;
import java.util.Scanner;

public class BookApp {

	public static void main(String[] args) {
		BookService service = new BookServiceImpl();
		
		Scanner scanner = new Scanner(System.in);
		String cmd = null;
		
		while(true) {
			//메뉴구성
			System.out.println("원하는 메뉴 번호를 입력하세요. \n");
			System.out.println("1. 도 서    입   력 \n");
			System.out.println("5. 도 서    목록보기 \n");
			System.out.println("9. 프로그램  종   료 \n");
			
			cmd = scanner.nextLine().trim();
			
			switch(cmd) {
			   case "1":
				   System.out.println("도서정보를 입력해주세요..");
				   System.out.print("도서 제목 : ");
				   String title = scanner.nextLine().trim();
				   Book book = new Book(title, 23000);
				   service.addBook(book);
				   System.out.println();
				   break;
			   case "5":
				   List<Book> books =  service.listAllBooks();
				   System.out.println("====== 도서목록===================");
				   books.forEach(a->{System.out.println(a);});
				   System.out.println("================================");
				   break;
               case "9":
				   System.out.println("종료수행");
				   System.out.println("종료를 원하면 q를 입력하세요..");
				   if(scanner.nextLine().equalsIgnoreCase("q")) {
					   System.out.println("종료수행......");
					   scanner.close();
					   scanner = null;
					   //save
					   BookDAO_File.save("books.data", service.listAllBooks());
					   System.out.println("데이타 저장 완료...");
					   return;
				   }
				   break;
			  default:
				  System.out.println("메뉴선택을 다시해 주세요...");
			}
		}
	}

}
