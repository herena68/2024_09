package day_0912;

public class Test03 {

	public static void main(String[] args) {

		
		Employee emp1 = new Employee();
			
		Employee emp2 = new Employee();
		emp2.name = "홍길동";
		emp2.dept = "기획부";
		emp2.age = 33;
		
		Employee emp3 = new Employee();
		emp3.name = "고길동";
		emp3.dept = "개발부";
		emp3.age = 25;
		
//		emp1.print();
//		emp2.print();
//		emp3.print();
		
		Employee[] employees = new Employee[] {emp1,emp2,emp3,new Employee()};
		
		for(Employee data  :employees) {
			data.print();
		}
		
		
	}

}
