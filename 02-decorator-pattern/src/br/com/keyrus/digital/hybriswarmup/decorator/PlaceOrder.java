package br.com.keyrus.digital.hybriswarmup.decorator;

import br.com.keyrus.digital.hybriswarmup.decorator.decoratorImpl.GiftPackingDecorator;
import br.com.keyrus.digital.hybriswarmup.decorator.decoratorImpl.InternationalDeliveryDecorator;
import br.com.keyrus.digital.hybriswarmup.decorator.decoratorImpl.PremiumDiscountDecorator;

public class PlaceOrder {

	public static void main(String[] args) {

		Item book = new Book(10);

		InternationDelivery international = new InternationDelivery();
		GitfPacking gp = new GitfPacking();
		PremiumDiscount pd = new PremiumDiscount();

		System.out.println(" International Order price: " + international.getPrice(book.getPrice()));

		System.out.println(" International Gift Order price: " + gp.getPrice(international.getPrice(book.getPrice())));

		System.out.println(" International Gift Premium Discount Order price: "
				+ gp.getPrice(international.getPrice(pd.getPrice(book.getPrice()))));

		System.out.println(" International Premium Discount Order price: " + international.getPrice(pd.getPrice(book.getPrice())));

		System.out.println(" ----------------------------- ");


		InternationalDeliveryDecorator internationalDeliveryDecorator = new InternationalDeliveryDecorator(book);
		GiftPackingDecorator gift = new GiftPackingDecorator(internationalDeliveryDecorator);
		PremiumDiscountDecorator premiumDiscount = new PremiumDiscountDecorator(gift);


		System.out.println(" International Order price: " + internationalDeliveryDecorator.getPrice());
		System.out.println(" International Gift Order price: " + gift.getPrice());

		System.out.println(" International Gift Premium Discount Order price: " + premiumDiscount.getPrice());

		System.out.println(" International Premium Discount Order price: "
				+ new PremiumDiscountDecorator(internationalDeliveryDecorator).getPrice());

	}
}
