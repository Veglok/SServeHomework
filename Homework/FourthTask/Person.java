package Homework.FourthTask;


public class Person {

    public Person(){
    }

    private String name;
    private int birthYear;
    private static int current_year = 2021;
    private String info;


    public Person(String name, int birthYear, String info) {
        this.name = name;
        this.birthYear = birthYear;
        this.info = info;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return "Person's " +
                "name is " + name +
                ", age: " + (current_year - birthYear) +
                '.' +  " additional info: " + info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
       this.info = info;
    }

    public static int getCurrent_year() {
        return current_year;
    }
    public void print(){
        System.out.println(info);
    }

    }

