package in.anilbarnwal.lld1minejuly22.lld2.factory;

import in.anilbarnwal.lld1minejuly22.lld2.factory.components.button.AndroidButton;
import in.anilbarnwal.lld1minejuly22.lld2.factory.components.button.Button;
import in.anilbarnwal.lld1minejuly22.lld2.factory.components.dropdown.AndroidDropDown;
import in.anilbarnwal.lld1minejuly22.lld2.factory.components.dropdown.DropDown;
import in.anilbarnwal.lld1minejuly22.lld2.factory.components.menu.Menu;

public class AndroidUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public DropDown createDropDown() {
        return new AndroidDropDown();
    }

    @Override
    public Menu createMenu() {
        return null;
    }
}
