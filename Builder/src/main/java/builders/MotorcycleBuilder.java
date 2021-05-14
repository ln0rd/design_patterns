package builders;

import cars.Motorcycle;
import components.CarType;
import components.Engine;
import components.Transmission;

public class MotorcycleBuilder {
    private CarType type;
    private int seats;
    private Transmission transmission;
    private Engine engine;

    public CarType getType() {
        return type;
    }

    public MotorcycleBuilder setType(CarType type) {
        this.type = type;
        return this;
    }

    public int getSeats() {
        return seats;
    }

    public MotorcycleBuilder setSeats(int seats) {
        this.seats = seats;
        return this;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public MotorcycleBuilder setTransmission(Transmission transmission) {
        this.transmission = transmission;
        return this;
    }

    public Engine getEngine() {
        return engine;
    }

    public MotorcycleBuilder setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    public Motorcycle build() {
        return new Motorcycle(type, seats, engine, transmission);
    }
}
