package javafundamentals.quiz;

import java.util.Scanner;

public class StringsToUpper {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n, i;
        System.out.println("n=");
        n = in.nextInt();
        String[] strings = new String[n];

        for (i = 0; i < n; i++) {
            System.out.println("strings[" + i + "]=");
            strings[i] = in.next();
        }
        //display init values:
        System.out.println("\nInitial values:");
        for (String str : strings) {
            System.out.println(str);
        }
        //to upper
        System.out.println("\nTo upper: ");
        for (String str : strings) {
            System.out.println(str.toUpperCase());
        }

    }
}
