package day_1121;

public class CarTest {
    public static void main(String[] args) {
        Truck t = new Truck("봉고", 1.5);
        
        System.out.println(t.name);
        System.out.println(t.payload);
        
    }
}

class Car {
    String name; // 차량 모델명

    Car(String name) {
        this.name = name;
        System.out.printf("모델명: %s\n", name);
    }

    void move() {
        System.out.printf("[%s]가 이동합니다.\n", this.name);
    }
}

class Truck extends Car {
    double payload; // 트럭 최대 적재량(톤)

    Truck(String name, double payload) {
        super(name);
        this.payload = payload;
        System.out.printf("적재량: %.1f 톤\n", payload);
    }

    void load() {
        System.out.printf("[%s]가 물건을 적재합니다. (최대 %.1f 톤)\n", this.name,
                this.payload);
    }
}