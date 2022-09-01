package pak;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Javamain {
    public static void main(String[] args) throws IOException {
        Song song = new Song();
        FileWriter file = new FileWriter("metallic.txt");
        file.write("Metaallica");
        file.write("\nNothing else matters");
        file.write("\nSo close, no matter how far"+"\n"+"Couldn't be much more from the heaven"+"\n"+"Forever trusting who else matters"+"\n"+"And nothing else matters");
        file.close();
        FileReader fi = new FileReader("metallic.txt");
        Scanner scanner = new Scanner(fi);
        song.setAuthor(scanner.nextLine());
        song.setTitle(scanner.nextLine());
        while(scanner.hasNextLine()){
            song.setText(new StringBuilder(scanner.nextLine()));
        }
        System.out.println(song);
    }

}
