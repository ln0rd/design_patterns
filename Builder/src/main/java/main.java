import builders.CarBuilder;
import builders.MotorcycleBuilder;
import cars.Car;
import cars.Motorcycle;
import components.CarType;
import components.Engine;
import components.Transmission;
import directors.Director;

public class main {

    public static void main(String[] args) {
        Director director = new Director();

        // EXAMPLE 1
        CarBuilder builder = new CarBuilder();
        director.constructSedanCar(builder);

        Car car = builder.build();
        System.out.println(car);


        // EXAMPLE 2
        MotorcycleBuilder motorcycleBuilder = new MotorcycleBuilder();

        Motorcycle moto = motorcycleBuilder
                .setTransmission(Transmission.AUTOMATIC)
                .setType(CarType.MOTORCYCLE)
                .setEngine(new Engine(1000))
                .setSeats(2)
                .build();

        System.out.println(moto);

    }
}
