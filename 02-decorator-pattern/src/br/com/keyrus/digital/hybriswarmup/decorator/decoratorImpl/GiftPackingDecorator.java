package br.com.keyrus.digital.hybriswarmup.decorator.decoratorImpl;

import br.com.keyrus.digital.hybriswarmup.decorator.Item;

public class GiftPackingDecorator extends ItemDecorator {

    public GiftPackingDecorator(Item item) {
        super(item);
    }

    @Override
    public Integer getPrice() {
        return super.getPrice() + 15;
    }
}
