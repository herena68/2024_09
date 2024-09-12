package day_0912;

public class Test01 {

	public static void main(String[] args) {

		System.out.println("java test....");
		
		int num=100;
		System.out.println(num);
		
//		String msg1 = new String("abcdefg~");
		String msg1 = "abcdefg~";
		System.out.printf("%s => %s %n",msg1,msg1.toUpperCase());
		
		Employee emp1 = new Employee();
		emp1.print();
			
		
		Employee emp2 = new Employee();
		emp2.name = "홍길동";
		emp2.dept = "기획부";
		emp2.age = 33;
		emp2.print();
		
		Employee emp3 = new Employee();
		emp3.name = "고길동";
		emp3.dept = "개발부";
		emp3.age = 25;
		emp3.print();
		
		System.out.println("################");
		emp1 = emp3;
		emp2 = emp3;
		
		emp1.print();
		emp2.print();
		emp3.print();
	}

}
