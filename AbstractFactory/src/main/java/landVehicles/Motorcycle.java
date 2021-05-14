package landVehicles;

public class Motorcycle implements LandVehicle {

    @Override
    public void startRout() {
        getCargo();
        System.out.println("Iniciando trajeto de Moto");
    }

    @Override
    public void getCargo() {
        System.out.println("Pegamos a carga de Moto");
    }
}
