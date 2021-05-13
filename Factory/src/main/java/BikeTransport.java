import vehicles.Bike;
import vehicles.Vehicle;

public class BikeTransport extends Transport {

    @Override
    protected Vehicle createTransport() {
        return new Bike();
    }
}
