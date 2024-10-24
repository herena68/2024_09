package day_1024;

public class Test03 {

	public static void main(String[] args) {
		Animal a = new Animal();
		a.breath();

		Animal b = new Animal("강아지");
		b.breath();
		
		Dog d = new Dog("진돗개","캐리");
		d.breath();
		d.print();
		
		Fish f = new Fish("쿠피");
		f.print();
		f.breath();
	}

}
