package in.anilbarnwal.lld1minejuly22.lld2.strategy.factory.uifactory.uicomponents;

import in.anilbarnwal.lld1minejuly22.lld2.strategy.factory.uifactory.UiFactory;
import in.anilbarnwal.lld1minejuly22.lld2.strategy.factory.uifactory.uicomponents.android.AndroidButton;
import in.anilbarnwal.lld1minejuly22.lld2.strategy.factory.uifactory.uicomponents.android.AndroidMenu;
import in.anilbarnwal.lld1minejuly22.lld2.strategy.factory.uifactory.uicomponents.interfaces.Button;
import in.anilbarnwal.lld1minejuly22.lld2.strategy.factory.uifactory.uicomponents.interfaces.Menu;

public class AndroidUiFactory implements UiFactory {

    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }
}
