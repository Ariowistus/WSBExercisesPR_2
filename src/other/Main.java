package other;

import devices.Car;
import devices.Device;
import devices.Phone;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("red", 10000, "BMW", "X5", 2010);
        Car car2 = new Car("blue", 20000, "BMW", "X5", 2010);

        Animal dog = new Animal("Reksio", 5, 10.0, 1000.0,"dog");
        Animal cat = new Animal("Filemon", 3, 5.0, 500.0,"cat");

        Phone phone = new Phone("black", 2000, "Samsung", "Galaxy S10", 2019);
        Phone phone2 = new Phone("white", 3000, "Samsung", "Galaxy S10", 2019);

        Human seller = new Human("Adam", 40, 100000.0, 100000.0, cat, car, phone2);
        Human buyer = new Human("Jan", 30, 20000.0, 1000.0, dog, car2, phone);


        phone.sell(seller, buyer, 2000.0);

        car.sell(seller, buyer, 10000.0);

        phone.sell(seller, buyer, 2000.0);












    }
}