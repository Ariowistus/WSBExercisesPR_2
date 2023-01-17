package devices;

public class Application {
    public String name;
    public Double version;
    public Double price;

    public Application(String name, Double version, Double price) {
        this.name = name;
        this.version = version;
        this.price = price;
    }

    public String toString() {
        return name + " " + version + " " + price;
    }
}

