package devices;

import other.Human;

import java.util.List;

public class Lpg extends Car {


    public Lpg(String color, Integer price, String producer, String model, Integer yearOfProduction, List<Human> owners, Human currentOwner) {
        super(color, price, producer, model, yearOfProduction, owners, currentOwner);
    }

    @Override
    void refuel() {

    }

    @Override
    public void sell(Human seller, Human buyer, Double price)  {

    }
}

