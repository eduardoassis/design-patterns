package br.com.keyrus.digital.hybriswarmup.decorator.decoratorImpl;

import br.com.keyrus.digital.hybriswarmup.decorator.Item;

public class InternationalDeliveryDecorator extends ItemDecorator {
    public InternationalDeliveryDecorator(Item item) {
        super(item);
    }

    @Override
    public Integer getPrice() {
        return super.getPrice() + 5;
    }
}
