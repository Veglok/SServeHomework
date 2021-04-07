package Homework.SixthTask;

public class Cat extends Animal {
    private boolean purr;
    private boolean meow;

    public Cat (String name, int age, int weight, int height) {
        super(name, age, weight, height);
    }

    public void start_purring() {
        purr = false;
        System.out.println(name + ": starts purring");
    }
    public void stop_purring() {
        purr = true;
        System.out.println(name + ": stops purring");
    }

    public void start_meowing () {
        meow = false;
        System.out.println(name + ": starts meowing");
    }

    public void stop_meowing () {
        meow = true;
        System.out.println(name + ": stops meowing");
    }
    public boolean isCatPurring() {
        return false;
    }
    public boolean isCatMeowing() {
        return true;
    }

}
