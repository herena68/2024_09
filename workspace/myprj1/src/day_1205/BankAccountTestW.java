package day_1205;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BankAccountTestW {
    public static void main(String[] args) throws IOException {
        BankAccount a = new BankAccount("빌 게이츠", "206-000001", 1000000);
        BankAccount b = new BankAccount("워런 버핏", "206-000002", 1000000);
        BankAccount c = new BankAccount("워런 버핏3", "207-000002", 77000);
        
        File file = new File("accounts-data.txt");
        
        FileWriter fw = new FileWriter(file,true);
        
        fw.write(a.toString() + "\n");
        fw.write(b.toString() + "\n");
        fw.write(c.toString() + "\n");
        fw.close();
        System.out.println("파일에 저장 완료....");
    }
}

class BankAccount {
    private final String username; // 고객명
    private final String number; // 계좌번호
    private int amount; // 잔액

    public BankAccount(String username, String number, int amount) {
        this.username = username;
        this.number = number;
        this.amount = amount;
    }

    public String toString() {
        return String.format("%s, %s, %d", username, number, amount);
    }
}