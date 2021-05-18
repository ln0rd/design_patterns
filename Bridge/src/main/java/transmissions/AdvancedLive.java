package transmissions;

import platforms.Platform;

public class AdvancedLive extends Live{

    public AdvancedLive(Platform platform) {
        super(platform);
    }

    public void subtitles() {
        System.out.println("Legendas ativadas na transmissão");
    }

    public void comments() {
        System.out.println("Comentarios habilitados na live");
    }
}
