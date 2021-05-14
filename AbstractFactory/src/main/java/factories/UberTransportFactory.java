package factories;

import airVehicles.AirVehicle;
import airVehicles.Airplane;
import landVehicles.Car;
import landVehicles.LandVehicle;

public class UberTransportFactory implements TransportFactory {

    @Override
    public LandVehicle createTransportLandVehicle() {
        return new Car();
    }

    @Override
    public AirVehicle createTransportAirVehicle() {
        return new Airplane();
    }
}
