
import java.io.FileReader;



class q3{
    public static void main(String[] args) {
        
try(  FileReader fr = new FileReader("abc.txt")){
      

      int x ;
      while((x=fr.read()) != -1){
          System.out.print((char)x);
      }
     fr.close();

}
catch(Exception e ){

}

    }
}