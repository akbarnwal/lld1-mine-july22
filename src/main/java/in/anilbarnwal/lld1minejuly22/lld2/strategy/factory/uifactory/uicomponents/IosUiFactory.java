package in.anilbarnwal.lld1minejuly22.lld2.strategy.factory.uifactory.uicomponents;

import in.anilbarnwal.lld1minejuly22.lld2.strategy.factory.uifactory.UiFactory;
import in.anilbarnwal.lld1minejuly22.lld2.strategy.factory.uifactory.uicomponents.interfaces.Button;
import in.anilbarnwal.lld1minejuly22.lld2.strategy.factory.uifactory.uicomponents.interfaces.Menu;
import in.anilbarnwal.lld1minejuly22.lld2.strategy.factory.uifactory.uicomponents.ios.IosButton;
import in.anilbarnwal.lld1minejuly22.lld2.strategy.factory.uifactory.uicomponents.ios.IosMenu;

public class IosUiFactory implements UiFactory {
    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public Menu createMenu() {
        return new IosMenu();
    }
}
