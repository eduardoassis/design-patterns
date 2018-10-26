package br.com.keyrus.digital.hybriswarmup.decorator.decoratorImpl;

import br.com.keyrus.digital.hybriswarmup.decorator.Item;

public class PremiumDiscountDecorator extends ItemDecorator {
    public PremiumDiscountDecorator(Item item) {
        super(item);
    }

    @Override
    public Integer getPrice() {
        return super.getPrice() - 10;
    }
}
