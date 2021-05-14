import app.Application;
import factories.NineNineTransportFactory;
import factories.TransportFactory;
import factories.UberTransportFactory;

public class main {

    public static void main(String[] args) {
        Application app = configureApplication();
        app.startRoute();
    }

    public static Application configureApplication() {
        Application app;
        TransportFactory factory;
        String company = "Uber";

        if (company == "Uber") {
            factory = new UberTransportFactory();
        } else {
            factory = new NineNineTransportFactory();
        }

        app = new Application(factory);

        return app;
    }
}
