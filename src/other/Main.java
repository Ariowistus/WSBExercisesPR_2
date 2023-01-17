package other;

import creatures.Animal;
import creatures.Pet;
import devices.Car;
import devices.Lpg;
import devices.Phone;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws MalformedURLException {
        Car LPG = new Lpg("red", 10000, "Fiat", "Punto", 2000);
        System.out.println(LPG);
        System.out.println();
        List<String> appNames = new ArrayList<>();
        appNames.add("Facebook");
        appNames.add("Instagram");
        appNames.add("Twitter");
        URL appURL = new URL("https://example.com/myApp.apk");


        Phone phone = new Phone("black", 1000, "Samsung", "Galaxy S10", 2019);

        System.out.println("NameApp");
        phone.installAnnApp("Facebook");
        System.out.println();
        System.out.println("NameApp, VersionApp");
        phone.installAnnApp("Facebook", "1.0");
        System.out.println();
        System.out.println("NameApp, VersionApp, ServerAddress");
        phone.installAnnApp("Facebook", "1.0", "https://example.com");
        System.out.println();
        System.out.println("ListNameApp");
        phone.installAnnApp(appNames);
        System.out.println();
        System.out.println("URLApp");
        phone.installAnnApp(appURL);




    }
}