import devices.Car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Audi", "A4", "black", 2010, 100000);
        Car car2 = new Car("Audi", "A4", "black", 2010, 100000);

        System.out.println(car==car2);
        System.out.println(car.equals(car2));
        System.out.println(car);
        System.out.println(car2);






    }
}