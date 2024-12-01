package in.anilbarnwal.lld1minejuly22.lld2.factory;

public class Flutter {
    private SupportedPlatform platform;

    //Non-factory methods
    void refreshUI() {
        System.out.println("Refreshing UI");
    }

    void setTheme() {
        System.out.println("Setting theme");
    }

    UIFactory getUIFactory(SupportedPlatform platform) {
        return UIFactoryFactory.getUIFactory(platform);
    }
}
