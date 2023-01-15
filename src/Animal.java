public class Animal {
    String name;
    int age;
    Double weight;

    final String species;


    public Animal(String name, int age, Double weight, String species) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.species = species;
    }

    void feed() {
        if (weight > 0) {
            weight += 1;
            System.out.println("Thx for food. My weight is now " + weight);
        } else {
            System.out.println("Too late, I am dead");
        }
    }
    void takeForAWalk() {
        if (weight > 0) {
            weight -= 1;
            System.out.println("Thx for a walk. My weight is now " + weight);
        } else {
            System.out.println("Too late, I am dead");
        }
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", species='" + species + '\'' +
                '}';
    }
}
