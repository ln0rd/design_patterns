package airVehicles;

public class Airplane implements AirVehicle {

    @Override
    public void startRoute() {
        wind();
        getCargo();
        System.out.println("Iniciando trajeto de avião");
    }

    @Override
    public void getCargo() {
        System.out.println("Pegamos a carga de avião");
    }

    @Override
    public void wind() {
        System.out.println("Ventos a 25km/h");
    }
}
