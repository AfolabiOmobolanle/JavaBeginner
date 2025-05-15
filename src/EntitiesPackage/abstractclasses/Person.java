package EntitiesPackage.abstractclasses;

public abstract class Person {
    protected String name;
    protected int age;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public abstract void speak();
    public abstract void walk();
}
