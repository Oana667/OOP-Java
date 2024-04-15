package Ex4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


class WriterReader {

    public static void main(String[] args) {

        Car c1 = new Car("renault", 3000);
        Car c2 = new Car("Audi", 5000);

        try {
            FileOutputStream f = new FileOutputStream(new File("Car.txt"));
            ObjectOutputStream o = new ObjectOutputStream(f);

            // Write objects to file
            o.writeObject(c1);
            o.writeObject(c2);

            o.close();
            f.close();

            FileInputStream fi = new FileInputStream(new File("Car.txt"));
            ObjectInputStream oi = new ObjectInputStream(fi);

            // Read objects
            Car car1 = (Car) oi.readObject();
            Car car2 = (Car) oi.readObject();

            System.out.println(car1.toString());
            System.out.println(car2.toString());

            oi.close();
            fi.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
