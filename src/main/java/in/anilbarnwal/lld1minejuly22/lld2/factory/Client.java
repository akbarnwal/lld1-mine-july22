package in.anilbarnwal.lld1minejuly22.lld2.factory;


import in.anilbarnwal.lld1minejuly22.lld2.factory.components.button.Button;
import in.anilbarnwal.lld1minejuly22.lld2.factory.components.dropdown.DropDown;

public class Client {
    public static void main(String[] args) {
        demoFactory();
    }

    private static void demoFactory() {
        Flutter flutter = new Flutter();
        UIFactory uiFactory = flutter.getUIFactory(SupportedPlatform.ANDROID);
        Button button = uiFactory.createButton();
        button.clickButton();

        DropDown dropDown = uiFactory.createDropDown();
        dropDown.showDropDown();
    }
}
