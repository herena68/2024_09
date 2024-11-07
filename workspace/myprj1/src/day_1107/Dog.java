package day_1107;

public class Dog extends Animal {
	String name;
	String kind; // 혈통 

	
	public Dog() {
		super("강아지");
	}

	public Dog(String kind, String name) {
		super("강아지");
//		super.kind = "강아지";
		this.kind = kind;
		this.name = name;
	}

	@Override
	public void print() {
		System.out.printf("Dog[동물의 종류(%s),혈통(%s),이름(%s)] %n", super.kind,this.kind, this.name);

	}

}
