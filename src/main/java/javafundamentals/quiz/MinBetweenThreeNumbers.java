package javafundamentals.quiz;

import java.util.Scanner;

/**
 * Read three integer numbers from console, and display the smallest number
 */
public class MinBetweenThreeNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c;
        System.out.println("a=");
        a = in.nextInt();
        System.out.println("b=");
        b = in.nextInt();
        System.out.println("c=");
        c = in.nextInt();

        if(a<b && a<c) {
            System.out.println("min: " + a);
        } else
            if(b<c && b<a) {
                System.out.println("min:" + b);
            } else {
                System.out.println("min: " +c );
            }

        System.out.println(min(a, min(b,c)));
    }

    private static int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }
}
