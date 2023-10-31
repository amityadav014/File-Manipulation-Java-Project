import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReplaceWordInFile {
    public static void main(String[] args) {
        String fileName = "textfileOriginal.txt";
        String tempFileName = "textfileOriginalwordchange.txt";
        String searchTerm = "Lorem";
        String replacement = "XXXXXXXX";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName));
             BufferedWriter writer = new BufferedWriter(new FileWriter(tempFileName))) {

            String line;
            while ((line = reader.readLine()) != null) {
                // Replace 'ram' with 'site' in the current line
                line = line.replaceAll(searchTerm, replacement);
                // Write the modified line to the temporary file
                writer.write(line);
                writer.newLine();
            }

            System.out.println("Occurrences of '" + searchTerm + "' replaced with '" + replacement + "' in the file.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        // Rename the temporary file to the original file
        File tempFile = new File(tempFileName);
        File originalFile = new File(fileName);
        if (tempFile.renameTo(originalFile)) {
            System.out.println("File renamed successfully.");
        } else {
            System.out.println("Failed to rename the file.");
        }
    }
}
