package other;

import devices.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Human> owners = new ArrayList<>();
        List<Car> sellerGarage = new ArrayList<>();
        List<Car> buyerGarage = new ArrayList<>();
        Human seller = new Human("Jan", 30, 1000.0, 1000.0, sellerGarage);
        Human buyer = new Human("Adam", 30, 1000.0, 1000.0, buyerGarage);
        owners.add(seller);


        Car mercedes = new Disel("Czarny", 100000, "Mercedes", "CLS", 2019, owners, owners.get(0));
        System.out.println(mercedes);
        Car volvo = new Disel("Czarny", 100000, "Volvo", "EX90", 2019, owners, owners.get(0));
        System.out.println(volvo);
        sellerGarage.add(mercedes);
        sellerGarage.add(volvo);

        System.out.println(owners);

        mercedes.sell(seller, buyer, 1000.0);
        System.out.println(owners);
        System.out.println(mercedes);

        boolean check= mercedes.wasOwner(seller);
        System.out.println(check);
        boolean check2= mercedes.wasSoldTo(seller, buyer);
        System.out.println(check2);
        int CountOfTransactions=mercedes.numberOfTransactions();
        System.out.println(CountOfTransactions);


    }
}