package devices;

public class Car extends Device {

    String color;

    public Integer price;
    final String producer;
    final String model;
    final Integer yearOfProduction;


    public Car(String color, Integer price, String producer, String model, Integer yearOfProduction) {
        this.color = color;
        this.price = price;
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public void turnOn() {

        super.turnOn();
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", price=" + price +
                ", producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                "} " + super.toString();
    }
}
