package vehicles;

public class Car implements Vehicle {


    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Inicianto o trajeto de carro");
    }

    @Override
    public void getCargo() {
        System.out.println("Pegamos a carga de carro, estamos pronto");
    }
}
