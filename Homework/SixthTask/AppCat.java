package Homework.SixthTask;

public class AppCat {
    public static void main(String[] args) {
        Animal Cat = new Cat( "Masik", 13, 6, 26 );
        System.out.println(Cat);
        System.out.println(Cat.fallAsleep(true));
        System.out.println(Cat.wakeUp(true));
        // Work in progress
    }
}
