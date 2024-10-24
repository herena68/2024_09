package day_1024;

import java.util.HashMap;

//p340
public class Test02 {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "하나,one,eins");
		hm.put(2, "둘,two,zwei");
		hm.put(3, "셋,three,drei");
		
		hm.forEach((key,value)->{
			String[] d = value.split(",");
			String msg = String.format("%s-%s(한국어),%s(영어),%s(독일어)",key,d[0],d[1],d[2]);
			System.err.println(msg);
//			System.out.printf("%s-%s(한국어),%s(영어),%s(독일어) %n",key,d[0],d[1],d[2]);
		});
		
		
	}

}
