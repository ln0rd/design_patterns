import platforms.FacebookLive;
import platforms.Platform;
import platforms.Twitch;
import platforms.Youtube;
import transmissions.AdvancedLive;
import transmissions.Live;

public class Main {
    public static void main(String[] args) {
        startLive(new Youtube());
        startLive(new Twitch());
        startLive(new FacebookLive());
    }

    public static void startLive(Platform platform) {
        System.out.println("...Aguarde");
        Live live = new Live(platform);
        live.broadcasting();
        live.result();

        // Avançado
        // Continuo emitindo para os 3, youtube, twitch e Faceboklive
        // implementamos uma abstração
        // recebemos uma interface
        System.out.println("Transmissão avançada");
        AdvancedLive advancedLive = new AdvancedLive(platform);
        advancedLive.broadcasting();
        advancedLive.comments();
        advancedLive.subtitles();
        advancedLive.result();
    }
}
