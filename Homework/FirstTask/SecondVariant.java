package Homework.FirstTask;

import java.util.Scanner;

abstract class calcArea {
    abstract void findCircle(double r);
}

class findArea extends calcArea {

    void findCircle(double r)
    {
        double area = 3.14 * (r * r);
        double perimeter = 3.14 * (2 * r);
        System.out.println("Perimeter of Circle: " + perimeter);
        System.out.println("Area of Circle: "+area);
        int Ci = (int)  (3.14 * (2 * r));
        int Ai = (int) (3.14 * (r * r));
        System.out.println("Perimeter of Circle (integer): " + Ci);
        System.out.println("Area of Circle (integer): " + Ai);

    }
}

class area {
    public static void main(String args[])
    {
        double r;
        findArea area = new findArea();
        Scanner get = new Scanner(System.in);

        System.out.print("Enter Radius of Circle: ");
        r = get.nextDouble();
        area.findCircle(r);
    }
}