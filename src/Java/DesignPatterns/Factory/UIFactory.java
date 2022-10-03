package Java.DesignPatterns.Factory;

import Java.DesignPatterns.Factory.Components.Button.Button;
import Java.DesignPatterns.Factory.Components.DropDown.DropDown;
import Java.DesignPatterns.Factory.Components.Menu.Menu;

public interface UIFactory {

    public Button CreateButton();

    public Menu CreateMenu();

    public DropDown CreateDropDown();
}
