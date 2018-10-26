package br.com.keyrus.digital.hybriswarmup.decorator.decoratorImpl;

import br.com.keyrus.digital.hybriswarmup.decorator.Item;

public class NoPackingDecorator extends ItemDecorator  {
    public NoPackingDecorator(Item item) {
        super(item);
    }

    @Override
    public Integer getPrice() {
        return super.getPrice();
    }
}
