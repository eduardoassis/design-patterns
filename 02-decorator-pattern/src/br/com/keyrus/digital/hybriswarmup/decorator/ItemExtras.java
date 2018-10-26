package br.com.keyrus.digital.hybriswarmup.decorator;

public class ItemExtras implements Item {

	private Item item;

	public ItemExtras(Item item) {
		this.item = item;
	}

	@Override
	public Integer getPrice() {
		return item.getPrice();
	}

}
