package day_1010;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
       System.out.println(Math.random()*100+1);
       System.out.println(Math.floor(3.6));
       System.out.println((int)3.6);
       System.out.println(Math.PI);
       
       Scanner sc = new Scanner(System.in);
       System.out.println("이름 입력해주세요..");
       String name = sc.next();
       System.out.println("근무부서를 입력해 주세요");
       String dept = sc.next();
       System.out.println("나이를 입력해주세요");
//       int age = sc.nextInt();
       int age = Integer.parseInt(sc.next());
       
       System.out.printf("[%s  %s  %s ]%n",name,dept,age);
       
       Employee emp1 = new Employee(name,dept,age);
       emp1.print();
       
       sc.close();
       sc = null;
	}

}
