package devices;

import other.Human;

public class Electric extends Car {
    public Electric(String color, Integer price, String producer, String model, Integer yearOfProduction) {
        super(color, price, producer, model, yearOfProduction);
    }

    @Override
    void refuel() {

    }

    @Override
    public void sell(Human seller, Human buyer, Double price)  {

    }


}

