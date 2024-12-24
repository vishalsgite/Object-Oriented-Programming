package polymorphism;


//An interface allows achieving polymorphism where multiple classes implement the same interface.
interface Payment {
    void pay(double amount);
}

class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}

class PayPalPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using PayPal.");
    }
}

public class InterfacePolymorphismDemo {
    public static void main(String[] args) {
        Payment payment;

        payment = new CreditCardPayment();
        payment.pay(100.50);

        payment = new PayPalPayment();
        payment.pay(200.75);
    }
}
