package EntitiesPackage.classes;

import EntitiesPackage.abstractclasses.Device;
import EntitiesPackage.interfaces.Workable;

public class Computer extends Device implements Workable {
    private int ramSize;
    private String processor;

    public int getRamSize() { return ramSize; }
    public void setRamSize(int ramSize) { this.ramSize = ramSize; }

    public String getProcessor() { return processor; }
    public void setProcessor(String processor) { this.processor = processor; }

    @Override
    public void start() {
        System.out.println("Computer booting up...");
    }

    @Override
    public void shutdown() {
        System.out.println("Computer shutting down...");
    }

    @Override
    public void startWork() {
        System.out.println("Running code editor...");
    }

    @Override
    public void stopWork() {
        System.out.println("Closing all apps.");
    }

    @Override
    public boolean isWorking() {
        return true;
    }
}

