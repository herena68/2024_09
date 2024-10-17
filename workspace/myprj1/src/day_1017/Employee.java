package day_1017;

public class Employee {
    //  클래스의 구성요소
	//  데이터(변수) + 기능(method) 
	
	private String name;
	private String dept;
	private int age;
	
	public Employee(){
		this(null,"미배치",0);//1라인에만 허용 
//		System.out.println("Employee 기본 생성자 call ..");
//		this.setName(null); 
//	    this.setDept("미배치"); 
//	    this.setAge(0); 
	      
	}
	
	public Employee(String name,String dept,int age){
      this.setName(name); 
      this.setDept(dept); 
      this.setAge(age); 
	}
	
	public Employee(String name, int age) {
		this(name,null,age);
//		this.name = name;
//	    this.setAge(age); 
	}

	public void setAge(int age) {
		if(age >= 0) this.age = age;
		else System.err.println(age +"=>   AGE : 유효성 검증 실패...");
		return;
	}
	public int getAge() {
		return this.age;
	}
	//setName , getName 만들기
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name ;
	}
	
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
	
	/**
	 * 사원 정보 출력 
	 */
	public  void print(){
		
		if(this.name != null)
		    System.out.printf("사원[%s**, %s, %d ]%n",this.name.charAt(0),this.dept,this.age);
		else
		    System.out.printf("사원[%s, %s, %d ]%n",name,this.dept,this.age);
			
		return;
	}
	
}
