package app;

import airVehicles.AirVehicle;
import factories.TransportFactory;
import landVehicles.LandVehicle;

public class Application {

    private LandVehicle vehicle;
    private AirVehicle aircraft;

    public Application(TransportFactory factory) {
        vehicle = factory.createTransportLandVehicle();
        aircraft = factory.createTransportAirVehicle();
    }

    public void startRoute() {
        vehicle.startRout();
        aircraft.startRoute();
    }
}
