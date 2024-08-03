package in.anilbarnwal.lld1minejuly22.lld2.strategy.factory.uifactory.uicomponents.windows;

import in.anilbarnwal.lld1minejuly22.lld2.strategy.factory.uifactory.uicomponents.interfaces.Button;

public class WindowsButton implements Button {
    @Override
    public void clickButton() {
        System.out.println("Windows button clicked");
    }
}
