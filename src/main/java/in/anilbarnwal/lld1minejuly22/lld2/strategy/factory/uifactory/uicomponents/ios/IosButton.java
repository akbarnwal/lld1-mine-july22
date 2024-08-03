package in.anilbarnwal.lld1minejuly22.lld2.strategy.factory.uifactory.uicomponents.ios;

import in.anilbarnwal.lld1minejuly22.lld2.strategy.factory.uifactory.uicomponents.interfaces.Button;

public class IosButton implements Button {
    @Override
    public void clickButton() {
        System.out.println("iOS button clicked");
    }
}
