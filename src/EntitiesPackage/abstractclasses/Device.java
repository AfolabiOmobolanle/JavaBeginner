package EntitiesPackage.abstractclasses;

public abstract class Device {
    protected String brand;
    protected double price;

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public abstract void start();
    public abstract void shutdown();
}
