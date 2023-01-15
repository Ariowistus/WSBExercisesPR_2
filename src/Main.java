public class Main {
    public static void main(String[] args) {
        Car car = new Car("Audi", "A4", "black", 2010, 100000);

        Human human = new Human();
        human.getSalary();
        human.setSalary(1000.0);
        human.getSalary();
        human.setCar(car);
        human.setSalary(30000.0);
        human.getSalary();
        human.setCar(car);




    }
}