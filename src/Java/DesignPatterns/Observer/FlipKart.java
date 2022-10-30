package Java.DesignPatterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class FlipKart {

    private static FlipKart instance;

    public static FlipKart getInstance()
    {
        if(instance == null)
        {
            instance = new FlipKart();
        }
        return instance;
    }

    public List<ISubscriber> list = new ArrayList<>();

    public void RegisterSubscriber(ISubscriber subscriber){
        list.add(subscriber);
    }

    public void UnRegisterSubscriber(ISubscriber subscriber){
        list.remove(subscriber);
    }
    public void orderPaced()
    {
        for(ISubscriber subscriber: list)
        {
            subscriber.Announce();
        }
    }
}
