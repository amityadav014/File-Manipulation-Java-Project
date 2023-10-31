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
    }
}
