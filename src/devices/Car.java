package devices;

import other.Human;
import other.Salleable;

import java.util.List;
import java.util.Objects;

public abstract class Car extends Device implements Salleable {

    String color;
    public Integer price;
    String producer;
    String model;
    Integer yearOfProduction;
    List<Human> owners;
    Human currentOwner;

    public Car(String color, Integer price, String producer, String model, Integer yearOfProduction, List<Human> owners, Human currentOwner) {
        this.color = color;
        this.price = price;
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.owners = owners;
        this.currentOwner = currentOwner;
    }



    abstract void refuel();

    public void sell(Human seller, Human buyer, Double price) throws Exception {
// Sprawdzenie czy sprzedawca posiada pojazd w swoim garażu
        if (!seller.garage.contains(this)) {
            throw new Exception("Sprzedawca nie posiada pojazdu w swoim garażu.");
        }
// Sprawdzenie czy kupujący ma wystarczającą ilość gotówki
        if (buyer.cash < price) {
            throw new Exception("Kupujący nie ma wystarczającej ilości gotówki.");
        }
// Usunięcie pojazdu z garażu sprzedawcy
        seller.garage.remove(this);
// Dodanie pojazdu do garażu kupującego
        buyer.garage.add(this);
// Odejmowanie ceny od gotówki kupującego
        buyer.cash -= price;
// Dodanie ceny do gotówki sprzedawcy
        seller.cash += price;
// Dodanie nowego właściciela do listy właścicieli pojazdu
        this.owners.add(buyer);
// Ustawienie nowego właściciela jako aktualnego właściciela pojazdu
        this.currentOwner = buyer;
        System.out.println("Transakcja zakończona sukcesem: " + buyer.name + " kupił " + this.model + " od " + seller.name + " za " + price + " złotych");
    }
    public boolean wasOwner(Human human) {
        return owners.contains(human);
    }
    public boolean wasSoldTo(Human seller, Human buyer) {
        int sellerIndex = owners.indexOf(seller);
        if(sellerIndex != -1 && owners.size() > sellerIndex+1 &&
                owners.get(sellerIndex+1).equals(buyer)) {
            return true;
        }
        return false;
    }
    public int numberOfTransactions() {
        return owners.size() - 1;
    }



//    public void sell(Human seller, Human buyer, Double price) {
//        if(seller.getCar() != this){
//            System.out.println("Sprzedający nie posiada tego zwierzęcia");
//            return;
//        }
//        if(buyer.cash < price){
//            System.out.println("Kupujący nie ma wystarczająco pieniędzy");
//            return;
//        }
//        buyer.cash -= price;
//        seller.cash += price;
//        buyer.setCar(this);
//        seller.setCar(null);
//        System.out.println("Transakcja zakończona, nowy właściciel zwierzęcia: " + buyer.name);
//    }


    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", price=" + price +
                ", producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", owners=" + owners +
                ", currentOwner=" + currentOwner +
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



    public Integer getYearOfProduction() {
        return yearOfProduction;
    }
}
