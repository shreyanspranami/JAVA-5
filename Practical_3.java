//shreyans j. pranami 21CE110
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Practical_3 {
    public static void main(String[] args) throws IOException {
        try (
                FileReader in = new FileReader("file2.txt");
                FileWriter out = new FileWriter("file1.txt")
        ) {
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);


            }
            System.out.println("Program successfully executed");
            System.out.println("shreyans 21CE110");
        }
    }
}