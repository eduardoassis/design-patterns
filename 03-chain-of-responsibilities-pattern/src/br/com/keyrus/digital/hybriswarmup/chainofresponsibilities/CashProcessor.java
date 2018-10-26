package br.com.keyrus.digital.hybriswarmup.chainofresponsibilities;

public class CashProcessor extends Processor {

	private static final int LIMIT = 100;

	public CashProcessor() {

	}

	public CashProcessor(Processor nextProcessor) {
		super(nextProcessor);
	}

	@Override
	public void handle(Payment payment) {
		if (payment.getAmount() > LIMIT)
			System.out.println("Cash payment not allowed!");
		else
			System.out.println("Cash payment good for " + payment.getAmount());

		if (this.nextProcessor != null)
			this.nextProcessor.handle(payment);
	}

}
