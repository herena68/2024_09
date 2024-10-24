package day_1024;

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// is a 관계 : 모든 객체의 데이터 타입은 부모가 될수 있다.
		Dog d = new Dog("시츄","캐리");
		Fish f =  new Fish("aaa");

		Animal a = f;
		a.breath();
	}

}
