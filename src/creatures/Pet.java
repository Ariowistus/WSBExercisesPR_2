package creatures;

public class Pet extends Animal {
    public Pet(String name, int age, Double weight, Double price, String species) {
        super(name, age, weight, price, species);
    }

    @Override
    public void feed() {
        if (weight > 0) {
            weight += 1;
            System.out.println("Thx for food. My weight is now " + weight);
        } else {
            System.out.println("Too late, I am dead");
        }

    }

    @Override
    public void feed(Double foodWeight) {
        if (weight > 0) {
            weight += foodWeight;
            System.out.println("Thx for food. My weight is now " + weight);
        } else {
            System.out.println("Too late, I am dead");
        }



    }

}
