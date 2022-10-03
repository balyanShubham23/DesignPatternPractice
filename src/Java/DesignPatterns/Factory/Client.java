package Java.DesignPatterns.Factory;

import Java.DesignPatterns.Factory.Components.Button.Button;

public class Client {

    public static void main(String[] args) {
        Flutter flutter = new Flutter(SupportedPlatforms.ANDROID);

        UIFactory android = flutter.CreateUIFactory();

        Button button = android.CreateButton();
        button.ChangeSize();

    }
}
