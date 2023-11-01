import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFileExample {
    public static void main(String[] args) {
        String fileName = "filewrite3.txt";
        String line = null;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        // method 2
        String fileName2 = "filewrite3.txt";
        FileReader fileReader2 = new FileReader(fileName)2;
        try {
            int i;
            while ((i = fileReader2.read()) != -1) {
                System.out.print((char) i);
            }
        } finally {
            fileReader2.close();
        }
    }
}
