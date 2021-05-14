package directors;

import builders.Builder;
import components.CarType;
import components.Engine;
import components.Transmission;

public class Director {

    public void constructSedanCar(Builder builder) {
        builder.setCarType(CarType.SEDAN);
        builder.setSeats(5);
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setEngine(new Engine(1600));
    }

    public void constructTruck(Builder builder) {
        builder.setCarType(CarType.TRUCK);
        builder.setSeats(5);
        builder.setTransmission(Transmission.MANUAL);
        builder.setEngine(new Engine(13000));
    }
}
