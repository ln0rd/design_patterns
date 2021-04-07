import vehicles.Motorcycle;
import vehicles.Vehicle;

public class MotorcycleTransport extends Transport {

    @Override
    protected Vehicle createTransport() {
        return new Motorcycle();
    }

}
