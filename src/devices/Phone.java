package devices;

public class Phone extends Device {

    String color;
    int price;
    final String producer;
    final String model;
    final Integer yearOfProduction;


    public Phone(String color, int price, String producer, String model, Integer yearOfProduction) {
        this.color = color;
        this.price = price;
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    void turnOn() {
        super.turnOn();
    }

    @Override
    public String toString() {
        return "Phone{" +
                "color='" + color + '\'' +
                ", price=" + price +
                ", producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                "} " + super.toString();
    }
}
