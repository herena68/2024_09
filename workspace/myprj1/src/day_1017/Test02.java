package day_1017;

import java.util.TreeSet;

public class Test02 {

	public static void main(String[] args) {
		TreeSet<String> names = new TreeSet<String>();
		names.add("홍길동");
		names.add("홍길동");
		names.add("고길동");
		names.add("박길동");
		names.add("최길동");
		names.add("이길동");
		
		for(String data :names) {
			System.out.printf("%s , ",data);
		}
		System.out.println();
		
		if(!names.contains("홍길동")) names.add("홍길동");
		
		names.forEach(data ->System.out.printf("%s , ",data));
		System.out.println();

		if(names.remove("홍길동")) {
			System.out.println("홍길동 삭제 완료 ");
		}

		names.forEach(data ->System.out.printf("%s , ",data));
		System.out.println();

		TreeSet<Integer> i = new TreeSet<Integer>();

	}

}
