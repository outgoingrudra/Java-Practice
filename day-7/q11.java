// remove all occurance of a character
import java.util.Scanner;

class q11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String :");
        String s = sc.nextLine();
        System.out.println("Enter char :");
        char c = sc.next().charAt(0);
        s=s.replaceAll(String.valueOf(c), "");
        System.out.println("final :"+s);


        
    }
}