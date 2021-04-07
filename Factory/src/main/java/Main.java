public class Main {

    private static Transport transport;

    public static void main(String[] args) {

        System.out.println("starting process");

        configure(args[0]);
        if(transport != null) {
            runTransport();
        }
    }

    private static void runTransport() {
        transport.startTranport();
    }

    private static void configure(String type) {
        switch (type) {
            case "car":
                transport = new CarTransport();
            case "log":
                transport = new MotorcycleTransport();
            default:
                System.out.println("selecione o tipo de entrega");
        }
    }
}