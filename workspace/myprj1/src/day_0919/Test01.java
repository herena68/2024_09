package day_0919;


public class Test01 {

	public static void main(String[] args) {
		Employee emp = new Employee();
        emp.print();
        
        Employee emp1 = new Employee();
        emp1.setName("홍길동"); 
        emp1.setDept("개발부"); 
        emp1.setAge(33); 
        emp1.print();
        
        Employee emp2 = new Employee();
        emp2.setName("고길동"); 
        emp2.setDept("인사부"); 
        emp2.setAge(23); 
        emp2.print();
        
	}

}
