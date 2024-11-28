package day_1128;

import java.util.List;
import java.util.Scanner;

public class BookApp {

	public static void main(String[] args) {
		BookService service = new BookServiceImpl();
		
		Scanner scanner = new Scanner(System.in);
		String cmd = null;
		
		while(true) {
			//메뉴구성
			
			System.out.println("################  메 뉴  ########################");
			System.out.println("1. 도서 등록 \n");
			System.out.println("5. 도서 목록 \n");
			System.out.println("9. 종    료 \n");
			System.out.println("################################################");
			System.out.print("메뉴 번호 선택 : ");
			cmd = scanner.nextLine().trim();
			System.out.println();
			
			switch (cmd) {
			case "1":
				System.out.println("도서 정보를 입력해주세요");
				System.out.print("도서 제목: ");
				String title = scanner.nextLine().trim();
				Book book = new Book(title, 32000);
				service.addBook(book);
				System.out.println();
				break;
			case "5":
				List<Book> list = service.listAllBooks();
				System.out.println("  도서 목록  ");
				list.forEach(a->{System.out.println(a);});
				System.out.println("---------------------------------");
				break;
			case "9":
				System.out.print("종료를 원하면 q를 입력하세요 : ");
				if(scanner.nextLine().trim().equalsIgnoreCase("q")) {
					System.out.println("종료합니다.....");
					scanner.close();
					scanner = null;
					return;
				}
				break;

			default:
				//System.out.println("");
				break;
			}
			
		}

	}
}
