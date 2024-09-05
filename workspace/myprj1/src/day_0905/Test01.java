package day_0905;


public class Test01 {
    //  클래스의 구성요소
	//  데이터(변수) + 기능(method) 
	public static void main(String[] args){
		System.out.println("~~~~ java test...");
		Employee emp = new Employee();
		emp.print();
	}
}

class Employee{
    //  클래스의 구성요소
	//  데이터(변수) + 기능(method) 
	
	String name;
	int age;
	
	public void print(){
		System.out.printf("사원명:%s  나이:%d  %n",name,age);
	}
}



