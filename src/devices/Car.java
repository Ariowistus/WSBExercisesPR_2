package devices;

public class Car {
    final String model;
    final String producer;
    String color;
    final int year;

    public Integer price;


    public Car(String model, String producer, String color, int year, Integer price) {
        this.model = model;
        this.producer = producer;
        this.color = color;
        this.year = year;
        this.price = price;
    }

    @Override
    public String toString() {
        return "devices.Car{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
