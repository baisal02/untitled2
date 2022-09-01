package Hw21;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Alfavit {
    public static void main(String[] args) throws IOException {
        FileWriter f = new FileWriter("alphabet1.txt");
        int k = 97;
        for (int i = 65; i <= 90; i++) {
            f.write(i);
            f.write(k);
            f.write("\n");
        }
        for (int i = 48; i < 58; i++) {
            f.write(i);
            f.write("\n");
        }
        f.close();

        FileReader fileReader = new FileReader("alphabet1.txt");
        Scanner scanner = new Scanner(fileReader);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }

    }
}
