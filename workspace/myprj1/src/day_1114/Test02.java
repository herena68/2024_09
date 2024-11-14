package day_1114;

public class Test02 {

	public static void main(String[] args) {
		Animal[] animals = {  new Dog(), new Fish(), new Dog("시츄", "츄츄"), new Fish("쿠피") };
		
		for(Animal data : animals) {
			callF1(data);
		}
		
		
	    Animal[] a = new Animal[10];
		// abstract  =/  final

	}
//	
//	public static void callF1(Dog d) {
//		d.breath();
//	}
//	public static void callF1(Fish f) {
//		f.breath();
//	}
	public static void callF1(Animal d) {
		d.breath();
	}
}
