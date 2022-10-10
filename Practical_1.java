//shreyans j. pranami 21CE110
import java.io.File;
import java.io.IOException;

public class Practical_1 {
    public static void main(String[] args) {
        try {
            String path;
            boolean b;
            File file = new File("file1.txt");
            if (file.createNewFile()) {
                System.out.println("New File is created!");
            } else {
                System.out.println("File already exists.");
            }

            File file2 = file.getCanonicalFile();
            path = file2.getAbsolutePath();
            System.out.println(path + " is Exist in Computer");

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("shreyans 21CE110");
    }
}