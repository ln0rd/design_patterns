package platforms;

public class FacebookLive implements Platform {

    public FacebookLive() {
        configureRMTP();
        System.out.println("Facebook Live transmissão iniciada");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("Facebook conta Autenticada");
    }

    @Override
    public void authToken() {
        System.out.println("Autorizando Facebook Live");
    }
}
