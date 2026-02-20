package Esercizi.adapter;

public class Main {
    static void main() {
        PaymentSystem ps = new PaymentSystem();
        ps.makePayment(14389);

        Adapter a = new Adapter(ps);
        a.pay(0.5);
    }
}
