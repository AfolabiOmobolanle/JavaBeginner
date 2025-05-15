package EntitiesPackage.classes;

import EntitiesPackage.interfaces.Eatable;
import EntitiesPackage.interfaces.Playable;

public class Dog implements Eatable, Playable {
    private String breed;
    private int age;

    public String getBreed() { return breed; }
    public void setBreed(String breed) { this.breed = breed; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    @Override
    public void eat(String food) {
        System.out.println("Dog is eating: " + food);
    }

    @Override
    public void drink(String liquid) {
        System.out.println("Dog is drinking: " + liquid);
    }

    @Override
    public boolean isHungry() {
        return true;
    }

    @Override
    public void play() {
        System.out.println("Dog is playing.");
    }

    @Override
    public void pause() {
        System.out.println("Dog paused playing.");
    }

    @Override
    public void stop() {
        System.out.println("Dog stopped playing.");
    }
}
