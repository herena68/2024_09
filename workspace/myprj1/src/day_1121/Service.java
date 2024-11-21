package day_1121;

public interface Service {
	abstract public void insert();
	void delete();
	void select();
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
}
