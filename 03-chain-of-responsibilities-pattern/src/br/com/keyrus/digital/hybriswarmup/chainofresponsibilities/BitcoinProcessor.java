package br.com.keyrus.digital.hybriswarmup.chainofresponsibilities;

public class BitcoinProcessor extends Processor {

	
	private static final int LIMIT = 1000000;

	public BitcoinProcessor() {
	}

	public BitcoinProcessor(Processor nextProcessor) {
		super(nextProcessor);
	}

	@Override
	public void handle(Payment payment) {
		if (payment.getAmount() > LIMIT)
			System.out.println("Bitcoin payment not allowed!");
		else
			System.out.println("Bitcoin payment good for " + payment.getAmount());

		if (this.nextProcessor != null)
			this.nextProcessor.handle(payment);
	}
}
