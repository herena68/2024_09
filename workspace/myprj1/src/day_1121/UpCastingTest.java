package day_1121;

import java.util.ArrayList;
import java.util.List;

public class UpCastingTest {
    public static void main(String[] args) {
    	Shape s1 = new Square();
//    	Square s2 = new Shape(); //에러 
//    	Square s2 = (Square)new Shape(); // 런타임 예외 발생 

    	
        Square s = new Square();
        s.name = "정사각형";
        Triangle t = new Triangle();
        t.name = "삼각형";
        Circle c = new Circle();
        c.name = "원";
        
        Shape[] shapes = {s, t, c};
        
        for(Shape data :shapes) {
        	System.out.println(data.name);
        	
        	if(data instanceof Circle) System.out.println((Circle)data);
        }
        
//        List<Circle> list = new ArrayList<Circle>();
        List<Shape> list = new ArrayList<Shape>();
        list.add(c);
        list.add(s);
        list.add(t);
        list.add(new Circle());
        list.add(new Triangle());
        list.add(new Square());
        
        System.out.println(list);
        
    }
}

// 부모 클래스
class Shape { // 도형
    String name;

	@Override
	public String toString() {
		return "Shape[name=" + name + "]";
	}
    
}

// 자식 클래스
class Square extends Shape {} // 정사각형

class Triangle extends Shape {} // 삼각형

class Circle extends Shape {} // 원

