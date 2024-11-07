package day_1107;

public class Test01 {

	public static void main(String[] args) {

		Animal temp;
		
		Animal a = new Animal();
		
		
		Dog d = new Dog();
		d.print();
		System.out.println(d.kind);
	    temp = d;
	    System.out.println(temp.kind);
	    System.out.println(((Animal)d).kind);
		((Animal)d).breath();
		d.print();
		System.out.println("##########################");
	    
		Fish f = new Fish();
		f.print();
		f.breath();
		((Animal)f).breath();
		
		Animal t1 = f;
		Dog t2 = d;
		Fish t3 = f;
		
		// {a,d,f}
//		Dog[] dogs = {a,d,f}; error
//		Fish[] fishs = {a,d,f}; error
		System.out.println("##########################");

		Animal[] animals = {a,d,f,new Dog("시츄","츄츄"),new Fish("쿠피")};
		
		for(Animal data :animals) {
//			System.out.println(data.kind);
//			data.breath();
			
//			if(data instanceof Dog) ((Dog)data).print();
//			if(data instanceof Fish) ((Fish)data).print();
		
			data.print();
			
		}
		
		
	}

}




