package EntitiesPackage.classes;

import  EntitiesPackage.abstractclasses.Person;
import  EntitiesPackage.interfaces.Eatable;

public class Human extends Person implements Eatable {
    private String occupation;
    private String nationality;

    public String getOccupation() { return occupation; }
    public void setOccupation(String occupation) { this.occupation = occupation; }

    public String getNationality() { return nationality; }
    public void setNationality(String nationality) { this.nationality = nationality; }

    @Override
    public void speak() {
        System.out.println("Human is speaking.");
    }

    @Override
    public void walk() {
        System.out.println("Human is walking.");
    }

    @Override
    public void eat(String food) {
        System.out.println("Human is eating: " + food);
    }

    @Override
    public void drink(String liquid) {
        System.out.println("Human is drinking: " + liquid);
    }

    @Override
    public boolean isHungry() {
        return false;
    }
}
