package day_1107;

public class Test03 {

	public static void main(String[] args) {
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		System.out.println(s1.toString());
		System.out.println(s2);
		System.out.println(s1.equals(s2));

		Animal a1 = new Animal("강아지");
		Animal a2 = new Animal("강아지");
		System.out.println(a1.toString());
		System.out.println(a2);
		System.out.println(a1.equals(a2));
		
	}

}
