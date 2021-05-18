package transmissions;

import platforms.Platform;

public class Live implements Transmission {

    protected Platform platform;

    public Live() {

    }

    public Live(Platform platform) {
        this.platform = platform;
    }

    @Override
    public void broadcasting() {
        System.out.println("Iniciando Transmissão");
    }

    @Override
    public void result() {
        System.out.println("******* ON AR *******");
    }
}
