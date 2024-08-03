package in.anilbarnwal.lld1minejuly22.lld2.strategy.factory;

import in.anilbarnwal.lld1minejuly22.lld2.strategy.factory.uifactory.UiFactory;
import in.anilbarnwal.lld1minejuly22.lld2.strategy.factory.uifactory.uicomponents.AndroidUiFactory;
import in.anilbarnwal.lld1minejuly22.lld2.strategy.factory.uifactory.uicomponents.IosUiFactory;
import in.anilbarnwal.lld1minejuly22.lld2.strategy.factory.uifactory.uicomponents.WindowsUiFactory;

public class UIFactoriesFactory {
    public static UiFactory getUIFactory(PlatformType platformType){
        switch (platformType){
            case WINDOWS:
                return new WindowsUiFactory();
            case IOS:
                return new IosUiFactory();
            case ANDROID:
                return new AndroidUiFactory();
        }
        return new AndroidUiFactory();
    }
}
