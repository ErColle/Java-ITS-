package Esercizi.adapter;

public class Adapter implements PaymenProcessor {

    private PaymentSystem paymentsystem;

    public Adapter( PaymentSystem paymentsystem ){
        this.paymentsystem = paymentsystem;
    }

    @Override
    public void pay(double amount) {
        this.paymentsystem.makePayment((int)(amount * 100));
    }
}
