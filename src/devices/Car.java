package devices;

import other.Human;
import other.Salleable;

import java.util.Objects;

public abstract class Car extends Device implements Salleable {

    String color;
    public Integer price;
    String producer;
    String model;
    Integer yearOfProduction;

    public Car(String color, Integer price, String producer, String model, Integer yearOfProduction) {
        this.color = color;
        this.price = price;
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    abstract void refuel();



    public void sell(Human seller, Human buyer, Double price) {
        if(seller.getCar() != this){
            System.out.println("Sprzedający nie posiada tego zwierzęcia");
            return;
        }
        if(buyer.cash < price){
            System.out.println("Kupujący nie ma wystarczająco pieniędzy");
            return;
        }
        buyer.cash -= price;
        seller.cash += price;
        buyer.setCar(this);
        seller.setCar(null);
        System.out.println("Transakcja zakończona, nowy właściciel zwierzęcia: " + buyer.name);
    }

    @Override
    public String toString() {
        return "Car{" +
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

        Car car = (Car) o;

        if (!Objects.equals(color, car.color)) return false;
        if (!Objects.equals(price, car.price)) return false;
        if (!Objects.equals(producer, car.producer)) return false;
        if (!Objects.equals(model, car.model)) return false;
        return Objects.equals(yearOfProduction, car.yearOfProduction);
    }

    @Override
    public int hashCode() {
        int result = color != null ? color.hashCode() : 0;
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (producer != null ? producer.hashCode() : 0);
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + (yearOfProduction != null ? yearOfProduction.hashCode() : 0);
        return result;
    }
}
