package builders;

import cars.Truck;
import components.CarType;
import components.Engine;
import components.Transmission;

public class TruckBuilder implements Builder {
    private CarType type;
    private int seats;
    private Transmission transmission;
    private Engine engine;

    @Override
    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Truck build() {
        return new Truck(type, seats, engine, transmission);
    }
}