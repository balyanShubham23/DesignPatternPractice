package Java.DesignPatterns.Factory;

import Java.DesignPatterns.Factory.Components.Button.Button;
import Java.DesignPatterns.Factory.Components.Button.IosButton;
import Java.DesignPatterns.Factory.Components.DropDown.DropDown;
import Java.DesignPatterns.Factory.Components.DropDown.IosDropDown;
import Java.DesignPatterns.Factory.Components.Menu.IosMenu;
import Java.DesignPatterns.Factory.Components.Menu.Menu;

public class IosUIFactory  implements  UIFactory{

    @Override
    public DropDown CreateDropDown() {
        return new IosDropDown();
    }

    @Override
    public Button CreateButton() {
        return new IosButton();
    }

    @Override
    public Menu CreateMenu() {
        return new IosMenu();
    }
}
