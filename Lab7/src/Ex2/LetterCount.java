package Ex2;

import java.io.*;

public class LetterCount {
    private char lookfor;
    private FileReader f = new FileReader("C:\\Users\\manta\\OneDrive\\Desktop\\SE\\30321_manta_oana_labs\\Lab7\\src\\Ex2\\data.txt");

    public LetterCount(char lookfor) throws FileNotFoundException {
        this.lookfor = lookfor;
    }

    private String readFile() throws IOException {
        String all;

        try (BufferedReader br = new BufferedReader(f)) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            all = sb.toString();
        }
        return all;
    }

    private int count(String line) {
        int cout=0;
        for(int i=0; i<line.length();i++){
            if(line.charAt(i)== lookfor) cout++;
        }
        return cout;
    }
    public static void main(String[]args) throws IOException {

        LetterCount lt = new LetterCount('e');
        System.out.println("Number of " + lt.lookfor+ ": " + lt.count(lt.readFile()));

        LetterCount lt1 = new LetterCount('m');
        System.out.println("Number of " + lt1.lookfor+ ": " + lt1.count(lt1.readFile()));
    }
}

