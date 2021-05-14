package landVehicles;

public class Car implements LandVehicle {

    @Override
    public void startRout() {
        getCargo();
        System.out.println("Iniciando trajeto de Carro");
    }

    @Override
    public void getCargo() {
        System.out.println("Pegamos a carga de Carro");
    }
}
