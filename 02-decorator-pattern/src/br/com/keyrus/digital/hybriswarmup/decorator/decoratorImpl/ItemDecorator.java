package br.com.keyrus.digital.hybriswarmup.decorator.decoratorImpl;

import br.com.keyrus.digital.hybriswarmup.decorator.Item;

public abstract class ItemDecorator implements Item {

    protected Item item;

    public ItemDecorator(Item item) {
        this.item = item;
    }

    @Override
    public Integer getPrice() {
        return item.getPrice();
    }
}
