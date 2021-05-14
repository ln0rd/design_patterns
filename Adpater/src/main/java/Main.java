import adapters.PayoneerAdapter;
import payoneer.Payoneer;
import paypal.PayPal;
import paypal.PayPalPayments;

public class Main {

    public static void main(String[] args) {
        /* Desse jeito funciona normal, mas se trocar PayPal() por Payoneer() vai quebrar a aplicação
           Pos os nomes dos metodos são diferentes
        */
        /*
        PayPalPayments payments = new PayPal();
        payments.paypalPayments();
        payments.paypalRecieve();
         */

        PayPalPayments payments = new PayPal();
        payments.paypalPayments();
        payments.paypalRecieve();

        // Pos criação do adapter para o Payoneer
        PayPalPayments payments2 = new PayoneerAdapter(new Payoneer());
        payments2.paypalPayments();
        payments2.paypalRecieve();
    }
}
