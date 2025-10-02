
import java.io.BufferedInputStream;
import java.io.FileInputStream;

class q8{
    public static void main(String[] args) throws  Exception {
        
        FileInputStream fis = new FileInputStream("abc.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);


        System.out.println("file-> "+fis.markSupported());
        System.out.println("buffer-> "+bis.markSupported());


    }
}