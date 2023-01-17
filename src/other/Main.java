package other;

import devices.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Application> apps = new ArrayList<>();
        Human buyer = new Human("Jan", 5000.0);
        Phone phone = new Phone("black", 500, apps, "Galaxy S10", "Samsung", 2019);

        phone.installApp("Facebook", buyer, 500.0);
        phone.installApp("Instagram", buyer, 200.0);
        phone.installApp("Messenger", buyer, 100.0);
        System.out.println(apps);

        boolean isApp = phone.isAppInstalled(apps);
        System.out.println(isApp);

        double totalPrice = phone.getTotalPriceOfInstalledApps();
        System.out.println(totalPrice);

        phone.sortAppsByName();
        System.out.println(apps);

        phone.sortAppsByPrice();
        System.out.println(apps);


    }
}