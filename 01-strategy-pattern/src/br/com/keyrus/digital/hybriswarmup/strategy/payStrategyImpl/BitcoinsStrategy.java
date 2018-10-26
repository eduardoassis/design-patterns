package br.com.keyrus.digital.hybriswarmup.strategy.payStrategyImpl;

import br.com.keyrus.digital.hybriswarmup.strategy.payStrategy.PayStrategy;

public class BitcoinsStrategy implements PayStrategy {
    @Override
    public int pay(int cartTotal) {
        cartTotal+= 50;
        System.out.println(" Pay with Bitcoins: " + cartTotal);
        return cartTotal;
    }
}
