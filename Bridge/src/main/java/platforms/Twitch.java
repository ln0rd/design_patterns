package platforms;

public class Twitch implements Platform {

    public Twitch() {
        configureRMTP();
        System.out.println("Twitch transmissão iniciada");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("Twitch conta Autenticada");
    }

    @Override
    public void authToken() {
        System.out.println("Autorizando Twitch Live");
    }
}
