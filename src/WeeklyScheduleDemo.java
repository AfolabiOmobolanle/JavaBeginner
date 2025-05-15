// Enum to define days of the week
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

// Superclass
class Schedule {
    protected Day day;

    public Schedule(Day day) {
        this.day = day;
    }

    public void displayDay() {
        System.out.println("Day: " + day);
    }
}

// Subclass extending Schedule
class WeeklySchedule extends Schedule {

    public WeeklySchedule(Day day) {
        super(day); // Call superclass constructor
    }

    // Add additional behavior
    public void displayActivity() {
        switch (day) {
            case MONDAY -> System.out.println("Start the week strong!");
            case TUESDAY -> System.out.println("Team meetings day.");
            case WEDNESDAY -> System.out.println("Midweek grind.");
            case THURSDAY -> System.out.println("Almost there...");
            case FRIDAY -> System.out.println("Wrap up and plan next week.");
            case SATURDAY -> System.out.println("Relax or explore.");
            case SUNDAY -> System.out.println("Prepare for the new week.");
        }
    }
}

// Main class
public class WeeklyScheduleDemo {
    public static void main(String[] args) {
        // Create instances for each day
        for (Day d : Day.values()) {
            WeeklySchedule schedule = new WeeklySchedule(d);
            schedule.displayDay();
            schedule.displayActivity();
            System.out.println("-----------");
        }
    }
}
