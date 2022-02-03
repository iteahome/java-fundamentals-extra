package javafundamentals.quiz;

import java.util.Scanner;

/**
 * Read two integer numbers from console, and display the bigger number
 */
public class MaxBetweenTwoNumbers {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a, b;
        System.out.println("a=");
        a = in.nextInt();
        System.out.println("b=");
        b = in.nextInt();

        // v1
        System.out.println("\nv1:");
        if (a > b) {
            System.out.println("Max: " + a);
        } else {
            System.out.println("Max: " + b);
        }

        // v2
        System.out.println("\nv2:");
        System.out.println("max: " + max(a, b));

    }

    private static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
