package br.com.keyrus.digital.hybriswarmup.strategy;

import br.com.keyrus.digital.hybriswarmup.strategy.payStrategy.PayStrategy;
import br.com.keyrus.digital.hybriswarmup.strategy.payStrategy.PaymentFunctionalStrategy;

import java.util.List;
import java.util.function.Consumer;

public class ShoppingCart {

	private List<Item> items;

	public ShoppingCart(List<Item> items) {
		this.items = items;
	}


	public int pay(PayStrategy payStrategy) {
		return payStrategy.pay(cartTotal());
	}

	public int payLambda(PaymentFunctionalStrategy paymentFunctionalStrategy){
		return paymentFunctionalStrategy.pay(cartTotal());
	}

	private int cartTotal() {
		return items.stream().mapToInt( Item:: getValue).sum();
	}

}
