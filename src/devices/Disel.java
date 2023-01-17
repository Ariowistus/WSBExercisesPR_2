package devices;

import other.Human;

public class Disel extends Car {
    public Disel(String color, Integer price, String producer, String model, Integer yearOfProduction) {
        super(color, price, producer, model, yearOfProduction);
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

        System.out.println("Transakcja zakończona sukcesem: " + buyer.name + " kupił " + this.model + " od " + seller.name + " za " + price + " złotych");
    }
}

