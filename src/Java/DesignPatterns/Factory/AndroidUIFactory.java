package Java.DesignPatterns.Factory;

import Java.DesignPatterns.Factory.Components.Button.AndroidButton;
import Java.DesignPatterns.Factory.Components.Button.Button;
import Java.DesignPatterns.Factory.Components.DropDown.AndroidDropDown;
import Java.DesignPatterns.Factory.Components.DropDown.DropDown;
import Java.DesignPatterns.Factory.Components.Menu.AndroidMenu;
import Java.DesignPatterns.Factory.Components.Menu.Menu;

public class AndroidUIFactory implements UIFactory{

    @Override
    public AndroidButton CreateButton() {
        return new AndroidButton();
    }

    @Override
    public AndroidDropDown CreateDropDown() {
        return new AndroidDropDown();
    }

    @Override
    public AndroidMenu CreateMenu() {
        return new AndroidMenu();
    }
}
