
import java.util.Scanner;

// remove all vowels

class q7{
    public static void main(String[] args) {
        
        System.out.println("Enter String ");
        String s = new Scanner(System.in).nextLine();
        StringBuilder ns = new StringBuilder();
        for(char x : s.toCharArray()){
            if(x=='a' || x =='e' || x=='i'|| x=='o'|| x=='u'){

            }
            else {
                ns.append(x);
            }
        }
        System.out.println("Ans : "+ns);
    }
}