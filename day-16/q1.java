
import java.io.FileInputStream;

class q1{
    public static void main(String[] args) {
        

        try(FileInputStream fis = new FileInputStream("abc.txt")){


            int x ;

            while((x=fis.read())!=-1){
                System.out.print((char)x);
                
            }

        }
        catch(Exception e){}
    }
}