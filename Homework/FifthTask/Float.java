package Homework.FifthTask;

import java.util.Arrays;

public class Float {
    public static void main(String[] args) {
        double [] arr = new double[3];
        arr[0] = -2.3;
        arr[1] = 0.5;
        arr[2] = 2.5;

        int [] array = new int[3];
        array[0] = 3;
        array[1] = 4;
        array[2] = 5;

        System.out.println("Array: ");
        for (int d = 0; d < arr.length; d++) {
            System.out.println("arr [" + d + "] = " + arr[d]);
        }

        System.out.println();


            System.out.println("second array: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.println("array [" + i + "] = " + array[i]);

        }

        for ( int d = 0; d < arr.length; d++)
            if ( arr[d] > -6 && arr[d] < 6) {
                System.out.println("Float numbers belong to range [-5,5]");
                break;
            }

            else {
                System.out.println("Float numbers don't belong to range [-5,5]");
                break;
            }

            Arrays.sort(array);
        System.out.println("Minimum " + array[0]);
        System.out.println("Maximum " + array[array.length -1]);
        System.out.println();

        HTTP_error current = HTTP_error.Not_found;
        System.out.println("HTTP ERROR 404 " + current);

    }

    enum HTTP_error {

       Bad_request, Unauthorized, Payment_required, Forbidden, Not_found,
    }
    }

