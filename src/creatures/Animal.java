package creatures;

import other.Human;
import other.Salleable;

public abstract class Animal implements Salleable, Feedable {
    String name;
    int age;
    Double weight;
    Double price;

    final String species;


    public Animal(String name, int age, Double weight, Double price, String species) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.price = price;
        this.species = species;
    }

    public void sell(Human seller, Human buyer, Double price) {
        if(seller.pet != this){
            System.out.println("Sprzedający nie posiada tego zwierzęcia");
            return;
        }
        if(buyer.cash < price){
            System.out.println("Kupujący nie ma wystarczająco pieniędzy");
            return;
        }
        buyer.cash -= price;
        seller.cash += price;
        buyer.pet = this;
        seller.pet = null;
        System.out.println("Transakcja zakończona, nowy właściciel zwierzęcia: " + buyer.name);
    }


    public void takeForAWalk() {
        if (weight > 0) {
            weight -= 1;
            System.out.println("Thx for a walk. My weight is now " + weight);
        } else {
            System.out.println("Too late, I am dead");
        }
    }

    @Override
    public String toString() {
        return "creatures.Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", species='" + species + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;

        if (age != animal.age) return false;
        if (!name.equals(animal.name)) return false;
        if (!weight.equals(animal.weight)) return false;
        if (!price.equals(animal.price)) return false;
        return species.equals(animal.species);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        result = 31 * result + weight.hashCode();
        result = 31 * result + price.hashCode();
        result = 31 * result + species.hashCode();
        return result;
    }
}
