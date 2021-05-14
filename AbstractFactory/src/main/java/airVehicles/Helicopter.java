package airVehicles;

public class Helicopter implements AirVehicle {

    @Override
    public void startRoute() {
        wind();
        getCargo();
        System.out.println("Iniciando trajeto de Helicoptero");
    }

    @Override
    public void getCargo() {
        System.out.println("Pegamos a carga de helicoptero");
    }

    @Override
    public void wind() {
        System.out.println("Ventos a 30km/h");
    }
}
