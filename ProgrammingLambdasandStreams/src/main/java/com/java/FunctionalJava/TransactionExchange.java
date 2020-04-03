package com.java.FunctionalJava;

public   class TransactionExchange {

    private final Currency currency;
    private final double value;

    public TransactionExchange(Currency currency, double value) {
        this.currency = currency;
        this.value = value;
    }

    public Currency getCurrency() {
        return currency;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return currency + " " + value;
    }

}


