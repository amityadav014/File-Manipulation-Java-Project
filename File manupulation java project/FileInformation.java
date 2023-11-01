import java.io.File;

public class FileInformation {

    public static void main(String args[])
    {
        File f=new File("filewrite1.txt");
         File f2=new File("filewrite11.txt");
        //String s="filewrite11.txt";
        if(f.exists())
        {
            System.out.println("file path : "+f.getAbsolutePath());
             System.out.println("file name : "+f.getName());
              System.out.println("file length : "+f.length());
               System.out.println("file canread: "+f.canRead());
                System.out.println("file can write : "+f.canWrite());
                System.out.println("file can write : "+f.renameTo(f2));
                
                





        }
        
    }
    
}
