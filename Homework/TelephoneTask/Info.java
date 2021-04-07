package Homework.TelephoneTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Info {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //if (Double.parseDouble(br.readLine()) > 0 == true){

        System.out.println("Please input phone call price to the first country: ");
        double c1 = Double.parseDouble(br.readLine());
        System.out.println("Phone call price to the first country = " + c1 + " uah;");
        System.out.println("Please input time duration of the first phone call: ");
        double t1 = Double.parseDouble(br.readLine());
        System.out.println("First phone call duration = " + t1 + " min;");
        System.out.println("Total price for the first phone call = " + c1 * t1 + " uah.");


        System.out.println();

        System.out.println("Please input phone call price to the second country: ");
        double c2 = Double.parseDouble(br.readLine());
        System.out.println("Phone call price to the second country = " + c2 + " uah;");
        System.out.println("Please input time duration of the second phone call: ");
        double t2 = Double.parseDouble(br.readLine());
        System.out.println("Second phone call duration = " + t2 + " min;");
        System.out.println("Total price for the second phone call = " + c2 * t2 + " uah.");

        System.out.println();

        System.out.println("Please input phone call price to the third country: ");
        double c3 = Double.parseDouble(br.readLine());
        System.out.println("Phone call price to the third country = " + c3 + " uah;");
        System.out.println("Please input time duration of the third phone call: ");
        double t3 = Double.parseDouble(br.readLine());
        System.out.println("Third phone call duration = " + t3 + " min;");
        System.out.println("Total price for the third phone call = " + c3 * t3 + " uah.");

        System.out.println();

        System.out.println("Total price value of all calls = " + (c1 * t1 + (c2 * t2) + (c3 * t3)) + " uah.");


    }



    }





