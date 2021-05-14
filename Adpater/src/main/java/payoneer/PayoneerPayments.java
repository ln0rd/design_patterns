package payoneer;

import utils.Token;

public interface PayoneerPayments {
    Token authToken();
    void sendPayment();
    void receivePayment();
}
