package br.com.keyrus.digital.hybriswarmup.strategy.payStrategyImpl;

import br.com.keyrus.digital.hybriswarmup.strategy.payStrategy.PayStrategy;

public class PayPalStrategy implements PayStrategy {
    @Override
    public int pay(int cartTotal) {
        cartTotal+= 10;
        System.out.println(" Pay with PayPal: " + cartTotal);
        return cartTotal;
    }
}
