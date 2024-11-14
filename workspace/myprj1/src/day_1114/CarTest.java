package day_1114;

public class CarTest {
    public static void main(String[] args) {
        Truck t = new Truck("봉고", 1.5);
        System.out.println(t.name);
        System.out.println(t.payload);
        
        Car c = t;
        System.out.println(c.name);
//        System.out.println(c.payload);
    }
}

class Car {
    String name; // 차량 모델명

    Car(String _name) {
        name = _name;
        System.out.printf("모델명: %s\n", name);
    }

    void move() {
        System.out.printf("[%s]가 이동합니다.\n", name);
    }
}

class Truck extends Car {
    double payload; // 트럭 최대 적재량(톤)

    Truck(String _name, double _payload) {
        super(_name);
        payload = _payload;
        System.out.printf("적재량: %.1f 톤\n", payload);
    }

    void load() {
        System.out.printf("[%s]가 물건을 적재합니다. (최대 %.1f 톤)\n", name,
                payload);
    }
}