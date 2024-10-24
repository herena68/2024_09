package day_1024;

public class Dog extends Animal{
    String name;
    String kind;
    
    public Dog() {
    	super("강아지");
		//super.kind = "강아지";
    }
    
	public Dog(String kind,String name) {
		super("강아지");
		//super.kind = "강아지";
		this.kind = kind;
		this.name = name;
	}

    
	public void print() {
		System.out.printf(" 동물의종류(%s) ,혈통(%s), 이름(%s) %n ", super.kind,this.kind,this.name);
	}
}
