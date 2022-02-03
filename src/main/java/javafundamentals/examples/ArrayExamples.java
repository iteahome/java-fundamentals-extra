package javafundamentals.examples;

import java.util.Scanner;

public class ArrayExamples {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nume = in.nextLine();

        System.out.println("Numele este: " + nume);

        int n, m;
        System.out.println("n=");
        n = in.nextInt();
        System.out.println("m=");
        m = in.nextInt();

        System.out.println("\n--------ARRAY------------\n");
        array(n, in);
        System.out.println("\n-------MATRIX 2D---------\n");
        matrix2D(n, m);
        System.out.println("\n-------MATRIX 3D---------\n");
        matrix3D(n);

    }

    public static void array(int n, Scanner in) {
        int i;
        int a[] = new int[n];
//1,2,3,4,5
        for (i = 0; i < n; i++) {
            System.out.println("a[" + i + "]=");
            a[i] = in.nextInt();
        }

        for (i = 0; i < n; i++) {
            System.out.println("a[" + i + "]=" + a[i]);
        }
    }

    private static void matrix2D(int n, int m) {
        int i, j;
        Scanner in = new Scanner(System.in);
        int a[][] = new int[n][m];
//1,2,3
//4,5,6
//7,8,9
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                System.out.println("a[" + i + "][" + j + "]=");
                a[i][j] = in.nextInt();
            }
        }


        //display matrix v1
        System.out.println("\ndisplay matrix v1\n");
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
//                System.out.println("a["+i+"]["+j+"]="+ a[i][j]);
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }

        //display matrix v2
        System.out.println("\ndisplay matrix v2\n");
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                System.out.println("a[" + i + "][" + j + "]=" + a[i][j]);
            }
        }
    }

    private static void matrix3D(int n) {
        int i, j, k;
        Scanner in = new Scanner(System.in);
        int a[][][] = new int[n][n][n];

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                for (k = 0; k < n; k++) {
                    System.out.println("a[" + i + "][" + j + "][" + k + "]=");
                    a[i][j][k] = in.nextInt();
                }
            }
        }


        //display matrix v2
        System.out.println("\ndisplay 3D matrix \n");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                for (k = 0; k < n; k++) {
                    System.out.println("a[" + i + "][" + j + "][" + k + "]=" + a[i][j][k]);
                }
            }
        }
    }

}
