package day_1024;

public class Fish extends Animal {
	String name;
	
	public Fish() {}
	
	public Fish(String name) {
		super("물고기");
		this.name = name;
	}

	public void print() {
		System.out.printf("Fish[%s : %s]%n",super.kind,this.name);
	}

	@Override
	public void breath() {
		System.out.println("아가미로 숨쉬기 ");
	}
	
}
