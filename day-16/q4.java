
import java.io.FileInputStream;
import java.io.FileOutputStream;

// copy a file

class q4{
    public static void main(String[] args) {
        try {
            
            FileInputStream fis = new FileInputStream("abc.txt");
            FileOutputStream fos = new FileOutputStream("xyz.txt");
             
             int x ;
            while((x=fis.read())!=-1){
                fos.write(x);
            }
            fos.close();
            fis.close();
            System.out.println("file copied successfully");
            
            
        } catch (Exception e) {
        }
    }
}