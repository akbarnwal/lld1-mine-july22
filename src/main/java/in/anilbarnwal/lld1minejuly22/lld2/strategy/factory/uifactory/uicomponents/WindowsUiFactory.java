package in.anilbarnwal.lld1minejuly22.lld2.strategy.factory.uifactory.uicomponents;

import in.anilbarnwal.lld1minejuly22.lld2.strategy.factory.uifactory.UiFactory;
import in.anilbarnwal.lld1minejuly22.lld2.strategy.factory.uifactory.uicomponents.interfaces.Button;
import in.anilbarnwal.lld1minejuly22.lld2.strategy.factory.uifactory.uicomponents.interfaces.Menu;
import in.anilbarnwal.lld1minejuly22.lld2.strategy.factory.uifactory.uicomponents.windows.WindowsButton;
import in.anilbarnwal.lld1minejuly22.lld2.strategy.factory.uifactory.uicomponents.windows.WindowsMenu;

public class WindowsUiFactory implements UiFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Menu createMenu() {
        return new WindowsMenu();
    }
}
