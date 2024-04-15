package Manta.lab2.ex6;

import java.util.Scanner;

public class Factorial {

    static int factorial( int n ) {
        if (n != 0)  // termination condition
            return n * factorial(n-1); // recursive call
        else
            return 1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int result;
        System.out.println("Input a number");
        int number = in.nextInt();
        result = factorial(number);
        System.out.println(number + " factorial = " + result);
    }
}
