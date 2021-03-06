package day10.ex;

public class Book {
	
	private String title;
	private int price;
	
	//
	public Book() {
		this("", 0);
	}
	
	public Book(String title, int price) {
		this.title = title;
		this.price = price;
	}
	
	//
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + price;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
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
		if (price != other.price)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
	//
	public void print() {
		System.out.printf("[title: %-15s|price: %6d]\n", 
				this.title, this.price);
	}

	@Override
	public String toString() {
		return "[title: " + title + ", price: " + price + "]";
	}

}
