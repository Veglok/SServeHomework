package Homework.SixthTask;

import java.util.Objects;

public class Animal extends AppCat {
    protected String name;
    private int age;
    private int weight;
    private int height;
    private boolean awake;

    public Animal(String name, int age, int weight, int height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }


    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String wakeUp (boolean awake) {
        awake = false;
        System.out.println(name + ": Wakes up");
        return "";
    }

    public String fallAsleep (boolean awake) {
        awake = true;
        System.out.println(name + ": Falls asleep");
        return "";
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal " +
                "name is " + name + '\'' +
                " his age is " + age + " years " +
                ", weight: " + weight + " kg " +
                ", height: " + height + " cm" +
                '.';
    }

    @Override
    public boolean equals(Object o) {
        if (this.hashCode() == name.hashCode()) {
            return true;
        }
        else {
            return false;                 // not finished
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, weight, height);
    }

}


