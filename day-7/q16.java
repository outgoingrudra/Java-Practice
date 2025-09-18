// toggle case 
import java.util.Scanner;

class q16{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String :");
        String s = sc.nextLine();
        StringBuilder ns = new StringBuilder();
        for(char x : s.toCharArray()){
            if(x>=65 && x<=90){
                ns.append((char)(x+32));
            }
            else if(x>=97 && x <= 122){
                ns.append((char)(x-32));
            }
            else{
                ns.append(x);
            }
        }
        System.out.println("Ans : "+ns);

        
    }
}