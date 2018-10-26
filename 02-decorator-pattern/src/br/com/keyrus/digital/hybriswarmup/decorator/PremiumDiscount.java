package br.com.keyrus.digital.hybriswarmup.decorator;

public class PremiumDiscount {

	public Integer getPrice(int price) {
		return -10 + price;
	}

}
