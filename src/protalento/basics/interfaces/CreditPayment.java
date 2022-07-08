package protalento.basics.interfaces;

public class CreditPayment implements IPayments {

    @Override
    public String makePayment() {
        return "credit card payment implemented";
    }
}
