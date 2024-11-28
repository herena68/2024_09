package day_1128;

import java.util.ArrayList;
import java.util.List;

public class FlyWithInterface {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Helicopter copter = new Helicopter();
        Rocket rocket = new Rocket();
        
        Flyable[] arr = {bird, copter, rocket};
        
        for(Flyable data :arr) {
        	data.fly();
        }
        
        List<Flyable> list = new ArrayList<Flyable>();
        list.add(rocket);
        list.add(bird);
        list.add(copter);
        
        for(Flyable data :list) {
        	data.fly();
        }
    }
}

interface Flyable {
    void fly();
}

class Bird implements Flyable {
    public void fly() {
        System.out.println("[새]가 날개를 퍼덕이며 날아갑니다!");
    }
}

class Helicopter implements Flyable {
    public void fly() {
        System.out.println("[헬기]가 프로펠러를 돌리며 날아갑니다.");
    }
}

class Rocket implements Flyable {
    public void fly() {
        System.out.println("[로켓]이 불꽃을 뿜으며 날아갑니다!");
    }
}