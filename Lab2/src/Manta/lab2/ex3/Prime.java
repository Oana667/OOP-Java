package Manta.lab2.ex3;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter A and B with A<B");
        int A= in.nextInt();
        int B= in.nextInt();
        int nrPrime=0;

        while(A<B){

            boolean flag = false;

            for(int y = 2; y <= A/2; ++y) {
                if(A % y == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag && A != 0 && A != 1) {
                System.out.print(A + " ");

                nrPrime += 1;
            }
            ++A;
        }
        System.out.println("Number of prime nr:" + nrPrime);
    }
}
