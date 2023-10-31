import java.io.File;

public class CreateFileExample{
    public static void main(String args[]){
        File file=new File("CreateFile1.txt");
        try{
             if(file.createNewFile()){
                    System.out.println("file created :"+file.getName());
             } else{
                System.out.println("file is already exits");
             }
        }catch(Exception e){
          System.out.println("error");

        }
    }
}