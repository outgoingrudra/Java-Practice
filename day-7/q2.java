
import java.util.Scanner;

// reverse
class q2{
    public static void main(String[] args) {
        System.out.println("Enter a string :");
        Scanner s = new Scanner(System.in);
        String x = s.nextLine();
        String rev ="";
        for(int i=0;i<x.length();i++){
            rev = x.charAt(i)+rev;
        }
        System.out.println("Reversed String : "+rev);

    }
}