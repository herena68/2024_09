package day_1017;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Test03 {

	public static void main(String[] args) {
		//Employee emp = new Employee("홍길동", "기술부", 33); 

		String data = "홍길동 기술부 33\r\n"
				+ "고길동 마케팅부 23\r\n"
				+ "박길동 영업부 22\r\n"
				+ "최길동 기술부 29\r\n"
				+ "김길동 영업부 31";
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		 
		Scanner sc = new Scanner(data);
		
		while (sc.hasNextLine()) {
			String readLine = sc.nextLine();
			StringTokenizer st  = new StringTokenizer(readLine);
			while (st.hasMoreTokens()) {
				String name = st.nextToken();
				String dept = st.nextToken();
				int age = Integer.parseInt(st.nextToken());
				
				employees.add(new Employee(name, dept, age));
			}
		}
		
		double sum = 0;
		for(Employee e :employees) {
			e.print();
			sum += e.getAge();
		}
		System.out.printf("전체 직원의 평균연령 :  %.1f %n",sum/employees.size());
		
		System.out.println("******** 기술부 직원 목록과 평균 연령   *******");
		sum = 0;
		int count =0;
		for(Employee e :employees) {
			if(e.getDept().equals("기술부")) {
			    e.print();
			    sum += e.getAge();
			    count++;
			}
		}
		System.out.printf("기술부 :  %.1f %n",sum/count);

		sc.close();
		sc = null;

	}
}



