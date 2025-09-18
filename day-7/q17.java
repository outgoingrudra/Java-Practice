// remove white spaces 
import java.util.Scanner;

class q17{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String :");
        String s = sc.nextLine();
       StringBuilder ns = new StringBuilder();
       for(char x : s.toCharArray()){
        if(x!=' '){
            ns.append(x);
        }
       }
       System.out.println("ans ="+ns);


        
    }
}