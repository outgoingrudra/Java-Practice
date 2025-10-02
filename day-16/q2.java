
import java.io.FileOutputStream;





class q2{
    public static void main(String[] args) {
        

      try {

        FileOutputStream fos = new FileOutputStream("abc.txt");

        String str = "Learn java programming ";
        fos.write(str.getBytes());
        fos.close();
        
          
      } catch (Exception e) {
      }
       
    }
}