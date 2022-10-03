package Java.DesignPatterns.Factory;

public class UIFactoryFactory {

    public static UIFactory GetUIFactoryForPlatforms(SupportedPlatforms platform)
    {
        if(platform == SupportedPlatforms.ANDROID)
        {
            return new AndroidUIFactory();
        }
        else if(platform == SupportedPlatforms.IOS)
        {
            return new IosUIFactory();
        }
        return null;
    }
}
