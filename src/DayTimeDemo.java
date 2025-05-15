interface TimeCalculator {
    int getTotalHours();
    void displayHours();
}

// Class that implements the interface
class DayTime implements TimeCalculator {
    private final int hours = 24; 

    @Override
    public int getTotalHours() {
        return hours;
    }

    @Override
    public void displayHours() {
        System.out.println("There are " + getTotalHours() + " hours in a day.");
    }
}

// Main class to run the program
public class DayTimeDemo {

    
    public static void main(String[] args) {
        DayTime myDay = new DayTime();
        myDay.displayHours();
    }
}
