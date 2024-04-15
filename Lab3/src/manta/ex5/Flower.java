package manta.ex5;

import javax.swing.text.FlowView;

public class Flower{
    int petal;
    static int noFlowers;
    Flower(int p){
        petal=p;
        System.out.println("New flower has been created!");
        noFlowers+=1;
    }
public static void NoFlowers(){
    System.out.println("Numbers of flowers: " + noFlowers);
}
    public static void main(String[] args) {
        Flower f1 = new Flower(4);
        Flower f2 = new Flower(6);
        Flower f3 =new Flower(2);
        NoFlowers();
    }
}
