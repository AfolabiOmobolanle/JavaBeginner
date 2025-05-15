package EntitiesPackage.classes;

import EntitiesPackage.abstractclasses.Machine;
import EntitiesPackage.interfaces.Workable;

public class Robot extends Machine implements Workable {
    private String id;
    private boolean aiEnabled;

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public boolean isAiEnabled() { return aiEnabled; }
    public void setAiEnabled(boolean aiEnabled) { this.aiEnabled = aiEnabled; }

    @Override
    public void powerOn() {
        System.out.println("Robot powering on.");
    }

    @Override
    public void powerOff() {
        System.out.println("Robot shutting down.");
    }

    @Override
    public void startWork() {
        System.out.println("Robot begins assigned task.");
    }

    @Override
    public void stopWork() {
        System.out.println("Robot halts current operation.");
    }

    @Override
    public boolean isWorking() {
        return true;
    }
}
