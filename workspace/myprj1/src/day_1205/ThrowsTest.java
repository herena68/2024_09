package day_1205;

public class ThrowsTest {
    public static void main(String[] args) {
        try {
            aaa();
        } catch (FailException ex) {
        	System.err.println("main  : "+ex.getMessage());
        }
        
        System.out.println("===================");
        
        aaa2();
    }

    private static void aaa() throws FailException {
        add();
    }
    
    private static void aaa2() {
        try {
			add();
		} catch (FailException e) {
			System.err.println("aaa2 : "+e.getMessage());
		}
    }
    
    private static void add() throws FailException {
        //System.out.println("bbb() 메소드가 호출되었습니다.");
        throw new FailException("등록 실패 ... ");
    }
}

class FailException extends Exception {
    public FailException(String message) {
        super(message);
    }
}

