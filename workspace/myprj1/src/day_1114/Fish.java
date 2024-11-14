package day_1114;

public class Fish extends Animal {
	String name;
	
	public Fish() {
		super("물고기");
	}

	public Fish(String name) {
		super("물고기");
		this.name = name;
	}

	@Override
	public void print() {
		System.out.printf("Fish[동물의 종류(%s),이름(%s)] %n", super.kind, this.name);

	}
	
	@Override
	public void breath() {
		System.out.println("아가미로 숨쉬기");
	}
}
