package devices;

import other.Human;

import java.util.List;

public class Disel extends Car {


    public Disel(String color, Integer price, String producer, String model, Integer yearOfProduction, List<Human> owners, Human currentOwner) {
        super(color, price, producer, model, yearOfProduction, owners, currentOwner);
    }

    @Override
    void refuel() {

    }

    @Override
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

    @Override
    public String toString() {
        return "Disel{" +
                "producer='" + producer + '\'' +
                "} " + super.toString();
    }
}

