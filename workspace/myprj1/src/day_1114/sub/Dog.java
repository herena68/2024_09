package day_1114.sub;

import day_1114.Animal;

//public abstract class Dog extends Animal{
public class Dog extends Animal{
	
	@Override
	public void print() {
		//super.print();
		System.out.println(kind);
		System.out.println(super.kind);
	}

	@Override
	public void breath() {

		System.out.println("폐...");
	}

	public static void main(String[] args) {
//		Animal a = new Animal();
		Animal a = new Dog();
		a.breath();
		a.print();
		System.out.println(a);
		System.out.println(a.toString());
		
	}
	
}
