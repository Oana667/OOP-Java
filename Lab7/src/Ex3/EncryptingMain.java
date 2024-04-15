package Ex3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.util.Scanner;

class EncyptingMain {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce the operation you want to perform: ");
        String node = scanner.nextLine();

        System.out.println("Introduce the file in which the operatrion will be performed: ");
        String filePath = "C:\\Users\\manta\\OneDrive\\Desktop\\SE\\30321_manta_oana_labs\\Lab7\\src\\Ex3\\" + scanner.nextLine();

        switch (node) {
            case "encrypt": case "Encrypt":
                File encryptedFile = new File(filePath + ".enc");
                encryptedFile.createNewFile();
                encryptFile(filePath);
                break;
            case "decrypt": case "Decrypt":
                File decryptedFile = new File(filePath + ".dec");
                decryptedFile.createNewFile();
                decryptFile(filePath);
                break;
        }
    }



    static void encryptFile(String filePath) throws IOException {
        File file = new File(filePath+".txt");
        Scanner fileScanner = new Scanner(file);
        FileWriter fileWriter = new FileWriter(filePath+".enc");
        int c;
        while(fileScanner.hasNextLine()){
            String line = fileScanner.nextLine();
            StringReader stringReader = new StringReader(line);

            while((c = stringReader.read()) != -1){
                char encryptedChar = (char) (c-1);
                fileWriter.write(encryptedChar);
            }

        }
        fileWriter.close();
        fileScanner.close();
    }

    static void decryptFile(String filePath) throws IOException {
        File file = new File(filePath+".enc");
        Scanner fileScanner = new Scanner(file);
        FileWriter fileWriter = new FileWriter(filePath+".dec");
        int c;
        while(fileScanner.hasNextLine()){
            String line = fileScanner.nextLine();
            StringReader stringReader = new StringReader(line);

            while((c = stringReader.read()) != -1){
                char encryptedChar = (char) (c+1);
                fileWriter.write(encryptedChar);
            }

        }
        fileWriter.close();
        fileScanner.close();
    }
}