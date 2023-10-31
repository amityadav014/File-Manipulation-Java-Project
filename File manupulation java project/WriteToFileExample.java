import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFileExample {
    public static void main(String args[]){
        String data="Hello i am text here 2.";

        // try(FileWriter writer=new FileWriter("filewrite1.txt")){
              
        //       writer.write(data);
        //       System.out.println("data written to the file.");
        // }catch(IOException e){
        //     System.out.println("error");
        //     e.printStackTrace();
        // }
        File filename=new File("filewrite3.txt");
        BufferedWriter writer;
        try {
            writer = new BufferedWriter(new FileWriter(filename));
            writer.write(data);
             writer.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
         
    }
    
}
