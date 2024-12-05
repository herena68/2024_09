package day_1205;

public class ExceptionEx1 {
    public static void main(String[] args) {
        String[] names = {"Kim", "Lee", "일", "Choi","99"};
        
        try {
        	System.out.println(names[1]); 
        	System.out.println(names[0].length()/names[4].length()); // 배열 인덱스를 벗어난 접근
        	System.out.println(names[2]); 
        	System.out.println(Integer.parseInt(names[2])); 
        	//자원반납 코드 기술  X
	    } catch (ArrayIndexOutOfBoundsException e) {
	    	System.err.println(e.getMessage());
		}catch (ArithmeticException e) {
			System.err.println("0으로 나누면 X");
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("자원반납 코드 기술 ....\n");
		}
        
        for(String data  : names) {
        	System.out.print(data+" , ");
        	try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
        }
        
        System.out.println("\n\n프로그램 수행 완료!");// 정상 종료시 출력
    }
}
