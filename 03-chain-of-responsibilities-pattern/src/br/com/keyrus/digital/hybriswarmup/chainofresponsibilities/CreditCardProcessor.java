package br.com.keyrus.digital.hybriswarmup.chainofresponsibilities;

public class CreditCardProcessor extends Processor {

	private static final int LIMIT = 1000;

	public CreditCardProcessor(){

	}

	public CreditCardProcessor(Processor nextProcessor) {
		super(nextProcessor);
	}

	@Override
	public void handle(Payment payment) {
		if (payment.getAmount() > LIMIT)
			System.out.println("Credit Card payment not allowed!");
		else
			System.out.println("Credit Card payment good for " + payment.getAmount());

		if (this.nextProcessor != null)
			this.nextProcessor.handle(payment);
	}
}
