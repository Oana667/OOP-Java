package Ex4;


import java.io.Serializable;

public class Car implements Serializable {
    private double price;
    private String model;

    public Car(String model, double price) {
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Model:" + model + " Price:" + price;
    }
}
