package day_0919;


public class Test02 {

	public static void main(String[] args) {
		Employee emp = new Employee();
        emp.print();
        
        Employee emp1 = new Employee("홍길동","개발부",33);
        emp1.print();
        
        Employee emp2 = new Employee("고길동","인사부",23);
        emp2.print();
        
        Employee emp3 = new Employee("박길동",43);
        emp3.print();
        
	}

}
