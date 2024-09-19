package day_0919;


public class Test03 {

	public static void main(String[] args) {
//		day_0919.Employee emp = null;
//		day_0912.Employee emp = null;
		day_0912.Employee emp = new day_0912.Employee();
		System.out.println(emp.name);
		
		System.out.println(Calc.PI); // 권장 클래스 변수 

		Calc c = new Calc();
		System.out.println(c.PI);
		System.out.println(c.add(1, 122222));
	}

}
