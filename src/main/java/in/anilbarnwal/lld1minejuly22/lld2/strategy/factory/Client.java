package in.anilbarnwal.lld1minejuly22.lld2.strategy.factory;

import in.anilbarnwal.lld1minejuly22.lld2.strategy.factory.uifactory.UiFactory;
import in.anilbarnwal.lld1minejuly22.lld2.strategy.factory.uifactory.uicomponents.interfaces.Button;
import in.anilbarnwal.lld1minejuly22.lld2.strategy.factory.uifactory.uicomponents.interfaces.Menu;

public class Client {
    public static void main(String[] args) {
        demoFactory();
    }

    private static void demoFactory() {
        Flutter flutter = new Flutter();
        UiFactory uiFactory = flutter.getUIFactory(PlatformType.ANDROID);
        Button button = uiFactory.createButton();
        button.clickButton();

        Menu menu = uiFactory.createMenu();
        menu.menuClick();
        System.out.println("Main");
    }
}
