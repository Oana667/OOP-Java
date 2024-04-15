package manta.ex4;

import manta.ex4.MyPoint;

public class TestMyPoint {

    public  static void main(String[] args) {
        MyPoint p1 = new MyPoint(3, 0);
        MyPoint p2 = new MyPoint(0, 4);
        MyPoint p3= new MyPoint();
        p1.setXY(3,2);
        p3.setXY(1,1);

        System.out.println(p1.distance(p3));
        System.out.println(p1.distance(p2));
        System.out.println(p1.distance(5, 6));
    }
}


