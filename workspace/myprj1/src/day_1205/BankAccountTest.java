package day_1205;

import java.io.*; // File, FileReader, IOException 클래스 등을 불러옴

public class BankAccountTest {
    public static void main(String[] args) throws IOException, InterruptedException {
        File file = new File("accounts-data.txt");
        FileReader fr = new FileReader(file);
        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.print((char) ch);
            Thread.sleep(200);
        }
        fr.close();
    }
}

