package Java.DesignPatterns.Factory;

public class Flutter {

    private SupportedPlatforms supportedPlatforms;

    public Flutter(SupportedPlatforms platforms)
    {
        this.supportedPlatforms = platforms;
    }

    public void SetTheme(){
        System.out.println("Setting Theme");
    }

    public void SetRefreshRate()
    {

    }

    public UIFactory CreateUIFactory()
    {
        return UIFactoryFactory.GetUIFactoryForPlatforms(supportedPlatforms);
    }

}
