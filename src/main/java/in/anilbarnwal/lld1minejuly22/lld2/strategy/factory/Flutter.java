package in.anilbarnwal.lld1minejuly22.lld2.strategy.factory;

import in.anilbarnwal.lld1minejuly22.lld2.strategy.factory.uifactory.UiFactory;

public class Flutter {
    public void refreshUI(){
        System.out.println("Refreshing UI");
    }

    public void setTheme(){
        System.out.println("Setting theme...");
    }

    public UiFactory getUIFactory(PlatformType platformType){
        return UIFactoriesFactory.getUIFactory(platformType);

    }

}
