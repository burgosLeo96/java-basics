package protalento.basics.interfaces;

public interface IPayments {

    String NOT_IMPLEMENTED = "This payment is not implemented";

    default String makePayment(){
        System.out.println(interfacePrivateMethod());
        return NOT_IMPLEMENTED;
    }

    private String interfacePrivateMethod(){
        return "Calling private method";
    }

}
