import vehicles.Vehicle;

public abstract class Transport {

    void startTranport() {
        Vehicle vehicle = createTransport();
        vehicle.startRoute();
    }

    protected abstract Vehicle createTransport();
}
