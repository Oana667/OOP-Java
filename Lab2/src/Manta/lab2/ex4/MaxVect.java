package Manta.lab2.ex4;

import java.util.Collections;
import java.util.Vector;


public class MaxVect {
    public static void main(String[] args)
    {
        // initializing a Vector
        Vector<Integer> v = new Vector<Integer>();

        // adding values to the Vector
        v.add(7);
        v.add(50);
        v.add(0);
        v.add(56);
        v.add(38);
        v.add(67);
        v.add(98);

        int n = Collections.max(v);

        System.out.println("The largest number is :" +n);
    }}
