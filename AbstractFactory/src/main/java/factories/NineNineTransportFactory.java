package factories;

import airVehicles.AirVehicle;
import airVehicles.Helicopter;
import landVehicles.LandVehicle;
import landVehicles.Motorcycle;

public class NineNineTransportFactory implements TransportFactory {

    @Override
    public LandVehicle createTransportLandVehicle() {
        return new Motorcycle();
    }

    @Override
    public AirVehicle createTransportAirVehicle() {
        return new Helicopter();
    }
}
