// replace space with - using no built in methods
import java.util.Scanner;

class q13{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String :");
        String s = sc.nextLine();
       String ns ;
       ns ="";
       for(char  c : s.toCharArray()){
        if(c==' '){
            ns+='-';
            continue;
        }
        ns+=c;
       }
       System.out.println("After work : "+ns);

        
    }
}