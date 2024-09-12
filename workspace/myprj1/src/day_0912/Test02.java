package day_0912;

public class Test02 {

	public static void main(String[] args) {
		String msg = null;
		if(msg != null)
		System.out.println(msg.toUpperCase());

		String name = "홍길동";
		System.out.println(name.charAt(0)+"**");
		
		Employee emp = new Employee();
		emp.name = "이순신";
		emp.print();
		if(emp.name != null)
		System.out.println(emp.name.charAt(0)+"**");

	}

}
