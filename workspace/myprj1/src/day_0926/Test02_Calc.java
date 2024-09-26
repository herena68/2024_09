package day_0926;

import day_0919.Employee;

public class Test02_Calc {

	public static void main(String[] args) {
		Employee emp1 = new Employee("홍길동", "개발부", 30);
		Employee emp2 = new Employee("고길동", "개발부", 30);
		
	    emp1.print();
	    emp2.print();
	    
//	    Calc c1 = new Calc();
//	    Calc c2 = new Calc();
	    
	    System.out.println(Calc.add());
	    System.out.println(Calc.add(3, 33));
	    System.out.println(Calc.add(3.9, 33.888));
	    System.out.println(Calc.add(4, 4,4,4));
	    System.out.println(Calc.add(1,2,3,4,5,6,7,8,9,10));

	}

}
