package Proxy;

public class PaymentProxy {
    private boolean userAuthenticated;
    private Payment payment;

    public PaymentProxy(boolean userAuthenticated) {
        this.userAuthenticated = userAuthenticated;
        this.payment = new Payment();
    }

    public void processPayment(double amount) {
        if (userAuthenticated) {
            payment.processPayment(amount);
            System.out.println("Payment successful.");
        } else {
            System.out.println("User not authenticated. Payment denied.");
        }
    }
}
