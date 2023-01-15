package devices;

public abstract class Device {
    String producer;
    String model;
    Integer yearOfProduction;

    void turnOn() {
        System.out.println("Device is on");
    }
}
