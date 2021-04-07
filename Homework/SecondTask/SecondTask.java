package Homework.SecondTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SecondTask {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Hello, what is your name ?");
        String name = br.readLine();
        System.out.println("Where are you from " + name + " ?");
        String address = br.readLine();
        System.out.println("Nice to meet you, " + name + " from " + address + ".");

    }
}
