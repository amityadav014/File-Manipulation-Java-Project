import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWriteExample {
    public static void main(String[] args) {
        String inputFile = "textfileOriginal.txt";
        String outputFile = "output.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                // Read a line from the input file and write it to the output file
                writer.write(line);
                writer.newLine(); // Add a newline character after each line
            }

            System.out.println("File read from '" + inputFile + "' and written to '" + outputFile + "'.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
