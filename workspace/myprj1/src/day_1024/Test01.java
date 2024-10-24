package day_1024;

import java.util.HashMap;
import java.util.Set;

public class Test01 {

	public static void main(String[] args) {

		HashMap<String, String> map = new HashMap<String, String>();
		map.put("java01", "1234");
		map.put("java02", "1111");
		map.put("java09", "2222");
		map.put("java11", "3333");
		map.put("java22", "1234");
		map.put("java01", "5678");
		
//		System.out.println(map);
//		System.out.println(map.get("java01"));

		String id = "java099";
		String pw = "2222";
		
		if(map.get(id) != null) {
			if(map.get(id).equals(pw)) {
				System.out.println("로그인 성공");
			}else {
				System.err.println("로그인 실패");
			}
		}else {
			System.out.println("ID 확인 필요 ");
		}
		
//		Set<String> keys = map.keySet();
//		System.out.println(keys);
		
//		for(String keyName :keys) {
//			System.out.printf("ID(%s) = PW(%s) %n",keyName,map.get(keyName));
//		}
		
		System.out.println("#####################");
		map.forEach((k,v) ->{ System.out.printf("%s = %s  %n",k,v); });
		
	}

}
