package adapters;

import payoneer.Payoneer;
import paypal.PayPalPayments;
import utils.Token;

public class PayoneerAdapter implements PayPalPayments {

    private Token token;
    private Payoneer payoneer;

    public PayoneerAdapter(Payoneer payoneer) {
        this.payoneer = payoneer;
        System.out.println("Adaptando Payoneer utilizando metodos padrão do Paypal");
    }

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalPayments() {
        this.token = authToken();
        this.payoneer.sendPayment();
    }

    @Override
    public void paypalRecieve() {
        this.payoneer.receivePayment();
    }
}
