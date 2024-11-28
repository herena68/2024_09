package day_1128;

public class Test01 {

	public static void main(String[] args) {

		Service.exec1();
		//Service.NAME = "";   error 
		System.out.println( Service.NAME);
		
//		Service service = new OracleServiceImpl();
		Service service = new MysqlServiceImpl();
		service.exec();
		
	}

}
