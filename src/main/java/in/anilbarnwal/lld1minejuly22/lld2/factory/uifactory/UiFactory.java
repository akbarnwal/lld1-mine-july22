package in.anilbarnwal.lld1minejuly22.lld2.factory.uifactory;

import in.anilbarnwal.lld1minejuly22.lld2.factory.uifactory.uicomponents.android.AndroidButton;
import in.anilbarnwal.lld1minejuly22.lld2.factory.uifactory.uicomponents.interfaces.Button;
import in.anilbarnwal.lld1minejuly22.lld2.factory.uifactory.uicomponents.interfaces.Menu;

public interface UiFactory {

    Button createButton();
    Menu createMenu();

}
