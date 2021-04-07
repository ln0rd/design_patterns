package vehicles;

public class Motorcycle implements Vehicle {

    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Inicianto o trajeto de moto");
    }

    @Override
    public void getCargo() {
        System.out.println("Pegamos a carga de moto, estamos pronto");
    }
}
