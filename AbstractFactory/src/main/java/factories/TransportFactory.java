package factories;

import airVehicles.AirVehicle;
import landVehicles.LandVehicle;

public interface TransportFactory {

    LandVehicle createTransportLandVehicle();
    AirVehicle createTransportAirVehicle();
}
