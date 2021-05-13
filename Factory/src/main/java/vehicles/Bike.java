package vehicles;

public class Bike implements Vehicle {

    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Inicianto o trajeto de Bicicleta");
    }

    @Override
    public void getCargo() {
        System.out.println("Pegamos a carga de Bicicleta, estamos pronto");
    }
}
