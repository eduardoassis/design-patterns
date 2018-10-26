package br.com.keyrus.digital.hybriswarmup.decorator;

public class Book implements Item {

	private Integer price;

	public Book(Integer price) {
		this.price = price;
	}

	@Override
	public Integer getPrice() {
		return price;
	}
 
}
