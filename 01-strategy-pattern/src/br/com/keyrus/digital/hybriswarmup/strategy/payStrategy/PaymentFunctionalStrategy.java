package br.com.keyrus.digital.hybriswarmup.strategy.payStrategy;

@FunctionalInterface
public interface PaymentFunctionalStrategy {
    int pay( int cartTotal);
}
