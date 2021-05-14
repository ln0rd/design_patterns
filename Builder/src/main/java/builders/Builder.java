package builders;

import components.CarType;
import components.Engine;
import components.Transmission;

public interface Builder {

    void setCarType(CarType type);
    void setSeats(int seats);
    void setTransmission(Transmission transmission);
    void setEngine(Engine engine);
}
