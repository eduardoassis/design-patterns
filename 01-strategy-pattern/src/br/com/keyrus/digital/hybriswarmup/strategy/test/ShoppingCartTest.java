package br.com.keyrus.digital.hybriswarmup.strategy.test;

import java.util.Arrays;

import br.com.keyrus.digital.hybriswarmup.strategy.payStrategyImpl.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import br.com.keyrus.digital.hybriswarmup.strategy.Item;
import br.com.keyrus.digital.hybriswarmup.strategy.PaymentMethod;
import br.com.keyrus.digital.hybriswarmup.strategy.ShoppingCart;
 
public class ShoppingCartTest {

	ShoppingCart cart;

	@Before
	public void setup() {
		Item item1 = new Item(1000);
		Item item2 = new Item(2000);
		cart = new ShoppingCart(Arrays.asList(item1, item2));
	}

	@Test
	public void totalCreditTest() {
		 assertEquals(3100, cart.pay(new CreditStrategy()));
	}

	@Test
	public void totalMoneyTest() {
		 assertEquals(3000, cart.pay(new MoneyStrategy()));
	}

	@Test
	public void totalBitcoinsTest() {
		assertEquals(3050, cart.pay(new BitcoinsStrategy()));
	}

	@Test
	public void totalPayPalTest() {
		assertEquals(3010, cart.pay(new PayPalStrategy()));
	}

	@Test
	public void totalWireTransferTest() {
		assertEquals(3005, cart.pay(new WireTransferStrategy()));
	}


	@Test
	public void totalFunctionalCreditTest() {
		assertEquals(3100, cart.payLambda(cartTotal -> {
			cartTotal+= 100;
			System.out.println(" Pay with credit " + cartTotal);
			return cartTotal;
		}));
	}

}
