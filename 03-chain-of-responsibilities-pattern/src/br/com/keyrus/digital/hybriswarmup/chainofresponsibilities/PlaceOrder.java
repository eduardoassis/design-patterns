package br.com.keyrus.digital.hybriswarmup.chainofresponsibilities;

public class PlaceOrder {
	
	public static void main(String[] args) {
		
		Payment p1000 = new Payment(1000);
		Payment p5000 = new Payment(5000);
		
		System.out.println(" Placing $1000 order :");

		BitcoinProcessor bitCoinProcessor1 = new BitcoinProcessor();
		CreditCardProcessor creditCardProcessor1 = new CreditCardProcessor(bitCoinProcessor1);
		CashProcessor cashProcessor1 = new CashProcessor(creditCardProcessor1);
		cashProcessor1.handle(p1000);

		System.out.println("-----------------------------------------");
		System.out.println(" Placing $5000 order :");

		BitcoinProcessor bitCoinProcessor2 = new BitcoinProcessor();
		CreditCardProcessor creditCardProcessor2 = new CreditCardProcessor(bitCoinProcessor2);
		CashProcessor cashProcessor2 = new CashProcessor(creditCardProcessor2);

		cashProcessor2.handle(p5000);

	}

 

}
