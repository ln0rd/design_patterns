package platforms;

public class Youtube implements Platform{

    public Youtube() {
        configureRMTP();
        System.out.println("Youtube transmissão iniciada");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("Youtube: Configurando broadcasting");
    }

    @Override
    public void authToken() {
        System.out.println("Autorizando Youtube Live");
    }
}
