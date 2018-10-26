package br.com.keyrus.digital.hybriswarmup.chainofresponsibilities;

abstract  class Processor {
    public Processor nextProcessor;

    public Processor(Processor processor) {
        this.nextProcessor = processor;
    }

    protected Processor() {
    }

    public abstract void handle(Payment payment);
}
