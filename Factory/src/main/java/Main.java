public class Main {

    private static Transport transport;

    public static void main(String[] args) {

        configure(args[0]);
        if(transport != null){
            runTransport();
        }
    }

    private static void runTransport() {
        transport.startTranport();
    }

    private static void configure(String type) {
        switch(type){
            case "car":
                transport = new CarTransport();
                break;
            case "log" :
                transport = new MotorcycleTransport();
                break;
            default :
                System.out.println("Selecione o tipo de entrega");
        }
    }
}