package day_1121;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ServiceApp {

	public static void main(String[] args) {
		
		Service service = null;
		
//		String msg = JOptionPane.showInputDialog("사용DB 선택  \n 1:Oracle,2:Mysql","1");
	   
		Scanner scanner = new Scanner(System.in);
	    System.out.println("사용DB 선택  \n 1:Oracle,2:Mysql");
		String msg = scanner.nextLine();
		
		switch(msg) {
		   case "1":
			   service = new OracleServiceImpl();
			   break;
		   case "2":
			   service = new MysqlServiceImpl();
			   break;
		   default:	   
			   service = new OracleServiceImpl();
		}
		
		service.insert();
		service.delete();
		service.select();
		//service.update();
		scanner.close();
	}

}
