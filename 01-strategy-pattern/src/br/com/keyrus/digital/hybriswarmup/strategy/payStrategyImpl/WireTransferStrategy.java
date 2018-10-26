package br.com.keyrus.digital.hybriswarmup.strategy.payStrategyImpl;

import br.com.keyrus.digital.hybriswarmup.strategy.payStrategy.PayStrategy;

public class WireTransferStrategy implements PayStrategy {
    @Override
    public int pay(int cartTotal) {
        cartTotal+= 5;
        System.out.println(" Pay with Wire Transfer: " + cartTotal);
        return cartTotal;
    }
}
