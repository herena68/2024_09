package day_1205;

public class CheckedExceptionTest {
    public static void main(String[] args) throws InterruptedException  {
        for (int i = 0; i < 5; i++) {
            System.out.printf("%d ", i);
            
			Thread.sleep(1000);

			
            try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // 1.000초간 실행을 멈춤
        }
    }
}