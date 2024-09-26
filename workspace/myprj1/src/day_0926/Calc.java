package day_0926;

public class Calc {
	public static double PI = 3.14159;

	//두 정수를 더하는 add 함수 정의해 보세요..
	
	// static 영역에서는 this 사용 X
	/*
	public  static int  add(int a,int b){
		return  a+b;
	}
	
	public  static double  add(double a,double b){
		return  a+b;
	}
	
	public  static int  add(int a,int b,int c,int d){
		return  a+b+c+d;
	}
	*/
	
	public static double add(double ... a) {
		double sum = 0;
		for(double data :a) {
			sum += data;
		}
		return sum;
	}
	
}




