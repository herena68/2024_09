package day_0926;

public class Test04 {

	public static void main(String[] args) {
		Singleton s1 =  Singleton.getInstance();
		Singleton s2 =  Singleton.getInstance();
		Singleton s3 =  Singleton.getInstance();
		Singleton s4 =  Singleton.getInstance();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);

	}
}


class Singleton{
	static Singleton s1 = new Singleton();
	
	private Singleton(){}
	
	public static Singleton getInstance() {
		return s1;
	}
}