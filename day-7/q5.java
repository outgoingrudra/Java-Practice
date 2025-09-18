
import java.util.Scanner;

class q5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String :");
        String s = sc.nextLine();
        StringBuilder ns = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            ns.append(s.charAt(i));
        }
        if(s.equals(ns.toString())){
            System.out.println("palindrome String !");

        }
        else {
            System.out.println("Not Palindrome String !");
        }

        
}
}