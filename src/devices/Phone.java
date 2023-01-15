package devices;

public class Phone {
    String model;
    String color;
    int weight;
    int height;
    int price;


    @Override
    public String toString() {
        return "devices.Phone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", price=" + price +
                '}';
    }
}
