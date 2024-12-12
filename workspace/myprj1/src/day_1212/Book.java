package day_1212;

import java.io.Serializable;
import java.util.Objects;

public class Book extends Object implements Serializable{
	private String title;
	private int price;
	
	
	public Book() {
		super();
	}


	public Book(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(price, title);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return price == other.price && Objects.equals(title, other.title);
	}
	
	
	
    
	
    
	
	
}
