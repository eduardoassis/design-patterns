package br.com.keyrus.digital.hybriswarmup.strategy.payStrategyImpl;

import br.com.keyrus.digital.hybriswarmup.strategy.payStrategy.PayStrategy;

public class MoneyStrategy implements PayStrategy {
    @Override
    public int pay(int cartTotal) {
        System.out.println(" Pay with money " + cartTotal);
        return cartTotal;
    }
}
