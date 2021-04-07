import vehicles.Car;
import vehicles.Vehicle;

public class CarTransport extends Transport {

    @Override
    protected Vehicle createTransport() {
        return new Car();
    }
}
