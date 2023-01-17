package other;

import creatures.Animal;
import creatures.Pet;
import devices.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)  {
        List<Car> myGarage = new ArrayList<>();
        myGarage.add(new Electric("Black", 25000, "Audi", "A5", 2007));
        myGarage.add(new Disel("Red", 30000, "BMW", "X5", 2006));
        myGarage.add(new Electric("White", 35000, "Mercedes", "E", 2005));

        Human me = new Human(myGarage, 3);

        System.out.println(me.getCar(0));
        me.setCar(0, new Electric("BMW", 20000, "Audi", "A5", 2007));
        System.out.println(me.getCar(0));
        System.out.println(myGarage);
        me.sortCarsByYear();
        System.out.println(myGarage);
        me.getGarageSize();
        System.out.println(me.getGarageSize());








    }
}