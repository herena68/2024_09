package day_1114;

import java.util.Objects;

public abstract class Animal extends Object{
	protected String kind = "동물의 종류 " ;
	
	public Animal(){	
		super();
	}
	
	public Animal(String kind) {
		super();
		this.kind = kind;
	}

	public abstract void breath() ;

	public void print() {
		System.out.println(" 출력 .... ");
	}

	@Override
	public String toString() {
		return "Animal [kind=" + kind + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(kind);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return Objects.equals(kind, other.kind);
	}
	
	
}
