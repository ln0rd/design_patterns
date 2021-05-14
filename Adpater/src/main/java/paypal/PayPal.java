package paypal;

import utils.Token;

public class PayPal implements PayPalPayments{

    private Token token;

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalPayments() {
        this.token = authToken();
        System.out.println("Enviado pagamentos via PayPal");
    }

    @Override
    public void paypalRecieve() {
        System.out.println("Recebendo pagamentos via PayPal");
    }
}
