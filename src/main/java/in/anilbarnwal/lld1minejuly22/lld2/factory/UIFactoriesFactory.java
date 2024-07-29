package in.anilbarnwal.lld1minejuly22.lld2.factory;

import in.anilbarnwal.lld1minejuly22.lld2.factory.uifactory.UiFactory;
import in.anilbarnwal.lld1minejuly22.lld2.factory.uifactory.uicomponents.AndroidUiFactory;
import in.anilbarnwal.lld1minejuly22.lld2.factory.uifactory.uicomponents.IosUiFactory;
import in.anilbarnwal.lld1minejuly22.lld2.factory.uifactory.uicomponents.WindowsUiFactory;
import in.anilbarnwal.lld1minejuly22.lld2.factory.uifactory.uicomponents.windows.WindowsMenu;

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
