package manta.ex2;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
        radius = 1.0;
        color = "red";
    }

    public Circle(double r, String s) {
        radius = r;
        color = s;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public static void main(String[] args) {

        Circle c1 = new Circle(2,"blue");
        System.out.println("The circle has radius of " + c1.getRadius() + " area of " + c1.getArea() + " and the color " + c1.color);

        Circle c2 = new Circle(3.5, "green");
        System.out.println("The circle has radius of " + c2.getRadius() + " area of " + c2.getArea() + " and the color " + c2.color);
        Circle c3 =new Circle();
        System.out.println("The circle has radius of " + c3.getRadius() + " area of " + c3.getArea() + " and the color " + c3.color);

    }
}
