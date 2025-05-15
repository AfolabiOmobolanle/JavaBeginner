package EntitiesPackage.abstractclasses;

public abstract class Machine {
    protected String model;
    protected String manufacturer;

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public String getManufacturer() { return manufacturer; }
    public void setManufacturer(String manufacturer) { this.manufacturer = manufacturer; }

    public abstract void powerOn();
    public abstract void powerOff();
}
