package Homework.FourthTask;

public class Main
{
    public static void main(String[] args) {

        Person person1 = new Person("Andrew", 2000, "Stress resilient");
        System.out.println(person1);

        Person person2 = new Person("Artem", 1998, "Love cats");
        System.out.println(person2);

        Person person3 = new Person("Myroslav", 1996, "Dislike mondays");
        System.out.println(person3);

        Person person4 = new Person("Yuriy", 1995, "Dislike dogs");
        System.out.println(person4);

        Person person5 = new Person("Konstantin", 1998, "Works really fast");
        System.out.println(person5);

        System.out.println();

        person1.setName("Nazar");
        System.out.println(person1);
        person2.setName("Ivan");
        System.out.println(person2);
        person3.setName("Stepan");
        System.out.println(person3);
        person4.setName("Ostap");
        System.out.println(person4);
        person5.setName("Bogdan");
        System.out.println(person5);

        //System.out.println(person1.getName().equals(person2.getName()));



    }
}
