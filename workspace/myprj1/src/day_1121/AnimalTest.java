package day_1121;

public class AnimalTest {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        Lion l = new Lion();
        Dog d = new Dog();
        Cat c = new Cat();
        Animal[] animals = {t, l, d, c};
        
        for(Animal data  : animals) {
//        	if(data instanceof Tiger) ((Tiger)data).cry(); 
        	data.cry();
        }
    }
}
abstract class Animal {
    String name;
    abstract void cry() ;
}
class Tiger extends Animal {
	public void cry() {
        System.out.println("어흥!");
    }
}
class Lion extends Animal {
    void cry() {
        System.out.println("크아앙!");
    }
}
class Dog extends Animal {
    void cry() {
        System.out.println("멍멍!");
    }
}
class Cat extends Animal {
    void cry() {
        System.out.println("야옹~");
    }
}