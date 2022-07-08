package protalento.basics.interfaces;

public class DebitPayment implements IPayments, Interface2 {

    @Override
    public String makePayment() {
        return "Pago en débito implementado correctamente";
    }
}
