
import java.io.ByteArrayInputStream;

class q6{
    public static void main(String[] args) {

        byte b[] = {'a','b','c','d','e','f'};
        
        ByteArrayInputStream bis = new ByteArrayInputStream(b);

        System.out.println(bis.readAllBytes());

       
    }
}