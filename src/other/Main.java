package other;

import creatures.Animal;
import creatures.Pet;
import devices.Car;
import devices.Phone;

public class Main {
    public static void main(String[] args) {
        Animal pet = new Pet("Dog", 5, 10.0, 100.0, "Dog");

        System.out.println(pet);
        pet.feed(5.0);
        System.out.println(pet);
        pet.takeForAWalk();
        System.out.println(pet);
        pet.feed();
        System.out.println(pet);
        pet.takeForAWalk();
        System.out.println(pet);


    }
}