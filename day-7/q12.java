// longest word
// remove all occurance of a character
import java.util.Scanner;

class q12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String :");
        String s = sc.nextLine();
       

       String ans[]=new String[10];
       int pos =0;
       String w =new String();
       for(char c : s.toCharArray()){
            
        if (c==' '){
            ans[pos++]=w;;
            w="";

        }
        else {
            w+= c;
        }
       }
       ans[pos++] = w;

       String m ;
       m ="";
       for(String x  : ans ){
        if( x != null && x.length()>m.length()){

            m=x;
        }
       }
       System.out.println("Ans : "+m);

        


        
    }
}