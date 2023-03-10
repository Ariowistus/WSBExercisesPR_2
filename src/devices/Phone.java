package devices;

import other.Human;
import other.Salleable;

import java.net.URL;
import java.util.List;

public class Phone extends Device implements Salleable {
    public static final String DEFAULT_SERVER_ADDRESS = "https://example.com";
    public static final String DEFAULT_PROTOCOL = "https";
    public static final String DEFAULT_VERSION = "1.0";

    String color;
    int price;
    List<Application> apps;
    final String producer;
    final String model;
    final Integer yearOfProduction;


    public Phone(String color, int price, List<Application> apps, String producer, String model, Integer yearOfProduction) {
        this.color = color;
        this.price = price;
        this.apps = apps;
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    public void installApp(String appName, Human buyer, Double appPrice) {
        if(buyer.cash < appPrice){
            System.out.println("Kupujący nie ma wystarczająco pieniędzy");
            return;
        }
        buyer.cash -= appPrice;
        apps.add(new Application(appName, 1.0, appPrice));
        System.out.println("Aplikacja " + appName + " zainstalowana pomyślnie. Koszt: " + appPrice + " zł. Pozostałe środki na koncie kupującego: " + buyer.cash + " zł");
    }
    public boolean isAppInstalled(List<Application> apps) {
        return apps.contains(apps.get(0));
    }
    public double getTotalPriceOfInstalledApps() {
        double totalPrice = 0.0;
        for(Application app : apps) {
            totalPrice += app.price;
        }
        return totalPrice;
    }
    //chce metode  na wypisanie nazw wszystkich zainstalowanych aplikacji w kolejności alfabetycznej,

    public void sortAppsByName() {
        apps.sort((o1, o2) -> o1.name.compareTo(o2.name));
    }
    //wypisane nazw wszystkich zainstalowanych aplikacji od najtańszych do najdroższych.
    public void sortAppsByPrice() {
        apps.sort((o1, o2) -> o1.price.compareTo(o2.price));
    }

    public void installAnnApp(String appName) {
        System.out.println("Installing " + appName + "...");

        System.out.println(appName + " installed successfully!");
    }

    public void installAnnApp(String appName, String appVersion) {
        System.out.println("Installing " + appName + " version " + appVersion + "...");

        System.out.println(appName + " version " + appVersion + " installed successfully!");
    }

    public void installAnnApp(String appName, String appVersion, String serverAddress) {
        System.out.println("Installing " + appName + " version " + appVersion + " from " + serverAddress + "...");

        System.out.println(appName + " version " + appVersion + " installed successfully from " + serverAddress + "!");
    }

    public void installAnnApp(List<String> appNames) {
        System.out.println("Installing apps: " + appNames.toString() + "...");

        System.out.println("All apps: " + appNames.toString() + " installed successfully!");
    }

    public void installAnnApp(URL appURL) {
        System.out.println("Installing app from " + appURL.toString() + "...");

        System.out.println("App installed successfully from " + appURL.toString() + "!");
    }


    public void sell(Human seller, Human buyer, Double price) {
        if(seller.phone != this){
            System.out.println("Sprzedający nie posiada tego telefonu");
            return;
        }
        if(buyer.cash < price){
            System.out.println("Kupujący nie ma wystarczająco pieniędzy");
            return;
        }
        buyer.cash -= price;
        seller.cash += price;
        buyer.phone = this;
        seller.phone = null;
        System.out.println("Transakcja zakończona, nowy właściciel telefonu: " + buyer.name);
    }

    @Override
    void turnOn() {
        super.turnOn();
    }

    @Override
    public String toString() {
        return "Phone{" +
                "color='" + color + '\'' +
                ", price=" + price +
                ", producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Phone phone = (Phone) o;

        if (price != phone.price) return false;
        if (!color.equals(phone.color)) return false;
        if (!producer.equals(phone.producer)) return false;
        if (!model.equals(phone.model)) return false;
        return yearOfProduction.equals(phone.yearOfProduction);
    }

    @Override
    public int hashCode() {
        int result = color.hashCode();
        result = 31 * result + price;
        result = 31 * result + producer.hashCode();
        result = 31 * result + model.hashCode();
        result = 31 * result + yearOfProduction.hashCode();
        return result;
    }
}
