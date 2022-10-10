//shreyans j. pranami 21CE110
import java.io.*;
public class Practical_3_1 {
    public static void main(String[] args) throws IOException
    {

        try (
                FileInputStream sourceStream = new FileInputStream("file1.txt");
                FileOutputStream targetStream = new FileOutputStream("file2.txt")
        ) {

            int temp;
            while ((temp = sourceStream.read()) != -1)
                targetStream.write((byte) temp);

            System.out.println("Program successfully executed");
            System.out.println("shreyans 21CE110");
        }
    }
}