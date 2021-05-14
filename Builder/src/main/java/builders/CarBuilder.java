package builders;

import cars.Car;
import components.CarType;
import components.Engine;
import components.Transmission;

public class CarBuilder implements Builder {
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

    public Car build() {
        return new Car(type, seats, engine, transmission);
    }
}
