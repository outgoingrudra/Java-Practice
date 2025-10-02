
import java.io.CharArrayReader;

class q7{
    public static void main(String[] args) throws  Exception {
        char c[] = {'a','b','c','d'};

        CharArrayReader cr = new CharArrayReader(c);

        int x ;
        while((x= cr.read())!=-1){
            System.out.println(x);
        }
    }
}