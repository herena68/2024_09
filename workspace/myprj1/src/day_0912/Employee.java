package day_0912;

public class Employee {
    //  클래스의 구성요소
	//  데이터(변수) + 기능(method) 
	
	String name;
	String dept;
	int age;
	
	/**
	 * 사원 정보 출력 
	 */

    public void print(){
		System.out.printf("사원[%s, %s, %d ]%n",name,dept,age);
		return;
	}
    public void printA(){
		System.out.printf("사원[%s, %s, %d ]%n",name,dept,age);
		return;
	}
	public void printB(){
		if(name != null)
		    System.out.printf("사원[%s**, %s, %d ]%n",name.charAt(0),dept,age);
		else
		    System.out.printf("사원[%s, %s, %d ]%n",name,dept,age);
			
		return;
	}
}
