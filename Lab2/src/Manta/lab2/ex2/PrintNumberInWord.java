package Manta.lab2.ex2;

import java.util.Scanner;
public class PrintNumberInWord {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int x= in.nextInt();

        if(x==0)
        {
            System.out.println("ZERO");
        }else if(x==1)
        {
            System.out.println("ONE");
        }else if(x==2)
        {
            System.out.println("TWO");
        }else if(x==3)
        {
            System.out.println("THREE");
        }else if(x==4)
        {
            System.out.println("FOUR");
        }else if(x==5)
        {
            System.out.println("FIVE");
        }else if(x==6)
        {
            System.out.println("SIX");
        }else if(x==7)
        {
            System.out.println("SEVEN");
        }else if(x==8)
        {
            System.out.println("EIGHT");
        }
        else if(x==9)
        {
            System.out.println("NINE");
        }else
        {
            System.out.println("OTHER");
        }




switch(x) {
    case 0:
        System.out.println("ZERO");
        break;
    case 1:
        System.out.println("One");
        break;

    case 2:
        System.out.println("TWO");
        break;
    default:
    }
    }
}
