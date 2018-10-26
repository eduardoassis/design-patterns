package br.com.keyrus.digital.hybriswarmup.strategy.payStrategyImpl;

import br.com.keyrus.digital.hybriswarmup.strategy.PaymentMethod;
import br.com.keyrus.digital.hybriswarmup.strategy.payStrategy.PayStrategy;

public class CreditStrategy implements PayStrategy {

    @Override
    public int pay(int cartTotal) {
        cartTotal+= 100;
        System.out.println(" Pay with credit " + cartTotal);
        return cartTotal;
    }
}
