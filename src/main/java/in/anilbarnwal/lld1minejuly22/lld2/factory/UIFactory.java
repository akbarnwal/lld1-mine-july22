package in.anilbarnwal.lld1minejuly22.lld2.factory;

import in.anilbarnwal.lld1minejuly22.lld2.factory.components.button.Button;
import in.anilbarnwal.lld1minejuly22.lld2.factory.components.dropdown.DropDown;
import in.anilbarnwal.lld1minejuly22.lld2.factory.components.menu.Menu;

public interface UIFactory {
    Button createButton();
    DropDown createDropDown();
    Menu createMenu();
}
