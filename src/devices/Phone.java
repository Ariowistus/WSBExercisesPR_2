package devices;

import other.Human;
import other.Salleable;

public class Phone extends Device implements Salleable {

    String color;
    int price;
    final String producer;
    final String model;
    final Integer yearOfProduction;


    public Phone(String color, int price, String producer, String model, Integer yearOfProduction) {
        this.color = color;
        this.price = price;
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
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
