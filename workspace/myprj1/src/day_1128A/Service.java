package day_11_28;

public interface Service {
	public static final String NAME ="서비스이름";
    abstract public void insert() ;
    void delete();
    void select();
    // static  default 구분 사용가능해야해요 ... 
    default public void exec() {
    	System.out.println("default method는 선택적으로 오버라이딩 가능해요 ...");
    }
}
class OracleServiceImpl extends Object implements Service{
	@Override
	public void insert() {
		System.out.println("Oracle insert");
	}
	@Override
	public void delete() {
		System.out.println("Oracle delete");
	}
	@Override
	public void select() {
		System.out.println("Oracle select");
	}
}
class MysqlServiceImpl extends Object implements Service{
	@Override
	public void insert() {
		System.out.println("Mysql insert");
	}
	@Override
	public void delete() {
		System.out.println("Mysql delete");
	}
	@Override
	public void select() {
		System.out.println("Mysql select");
	}
	@Override
	public void exec() {
		Service.super.exec();
		System.out.println(".....   이렇게 오버라이딩 했어요 .....");
		
	}
	
}
