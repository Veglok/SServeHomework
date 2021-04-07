package Homework.FirstTask;

import java.util.Scanner;

public class FirstTask {
    private static Scanner from_user;


    public static void main(String[] args) {
        from_user = new Scanner(System.in);
       // System.out.println("Please write down radius number (integer only!) ");

       //int r = Integer.parseInt((from_user.nextLine()));

        int r = 5;                          // comment this line and enable lines 11 and 13
        int d = 2 * r;                      // to input your own radius value
        double p = 3.14;
        int Ci = (int) (d * p);
        int Ai = (int) (p * (r * r));

        double C = (d * p);
        double A = (p * (r * r));
        System.out.println("Flower bed ");
        System.out.println("Perimeter (fraction) = " + C);
        System.out.println("Area (fraction) = " + A);
        System.out.println("Perimeter (integer) = " + Ci);
        System.out.println("Area (integer) = " + Ai);
    }
}
