package day_1121;

public class MoreKeywords {
    public static void main(String[] args) {
        Weapon w1 = new Weapon("장검", 1200, 10);
        Weapon w2 = new Weapon();
        w1.printInfo();
        w2.printInfo();
        
    }
}

abstract class Item {
    protected String name; // 이름
    private int price; // 가격

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Item() {
        this.name = "이름 없음";
        this.price = -1;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}

class Weapon extends Item {
    private int power; // 공격력

    Weapon(String name, int price, int power) {
        super(name, price);
        this.power = power;
    }

    Weapon() {
        super();
        this.power = -1;
    }

    void printInfo() {
        System.out.printf("[%s] 가격: %d 골드, 공격력: %d\n",
        super.name, super.getPrice(), this.power);
        
        System.out.printf("[%s] 가격: %d 골드, 공격력: %d\n",
                this.name, getPrice(), this.power);
    }
}