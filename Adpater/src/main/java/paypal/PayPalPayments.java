package paypal;

import utils.Token;

public interface PayPalPayments {
    Token authToken();
    void paypalPayments();
    void paypalRecieve();
}
