package javafundamentals.quiz;

import java.util.Scanner;

/**
 * Read n as integer from console.
 * Read n integer values and display min and max from these n values
 */
public class MaxMinFromArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, i;
        Integer[] array = new Integer[100];
        System.out.println("n=");
        n = in.nextInt();

        //read array from console
        for (i = 0; i < n; i++) {
            System.out.println("array[" + i + "]=");
            array[i] = in.nextInt();
        }
        //display array
        System.out.println("Display array:");
        for (i = 0; i < n; i++) {
            System.out.println("array[" + i + "]=" + array[i]);
        }
        System.out.println("\nDisplay Max&Min:");
        //find min and max;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(i=0; i<n; i++) {
            if(array[i] < min) {
                min = array[i];
            }
            if(array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);

    }
}
