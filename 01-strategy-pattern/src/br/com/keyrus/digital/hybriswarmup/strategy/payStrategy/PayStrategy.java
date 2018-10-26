package br.com.keyrus.digital.hybriswarmup.strategy.payStrategy;

import br.com.keyrus.digital.hybriswarmup.strategy.PaymentMethod;

public interface PayStrategy {
    int pay( int cartTotal);
}
