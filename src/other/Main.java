package other;

import devices.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Car> sellerGarge = new ArrayList<>();
        List<Car> buyerGarge = new ArrayList<>();
        Car mercedes = new Disel("white", 34000, "Mercedes", "CLS", 2019);
        sellerGarge.add(mercedes);
        Human seller = new Human("Jan", 30, 10000.0, 10000.0, sellerGarge);
        Human buyer = new Human("Adam", 40, 50000.0, 50000.0, buyerGarge);




        try {

            mercedes.sell(seller, buyer, 30000.0);

        } catch (Exception e) {
            System.out.println(e.getMessage());


        }

        try {
            System.out.println("Garaż kupującego: "+buyerGarge.get(0));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }




    }
}