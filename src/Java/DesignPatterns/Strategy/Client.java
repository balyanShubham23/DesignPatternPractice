package Java.DesignPatterns.Strategy;

public class Client {

    public static void main(String[] args) {
        GoogleMaps googleMaps = new GoogleMaps();
        googleMaps.FindPath("Suncity", "Gurgaon", "Car");
    }
}
