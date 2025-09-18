
import java.util.Scanner;

// count vowel and consonant

class q3{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String :");
        String s = sc.nextLine();
        int v = 0;
        int c =0;
        int l =s.length();
        for(int i =0;i<l;i++){
            char x = s.toLowerCase().charAt(i);
            if(x=='a' || x=='e'|| x=='i' || x=='o'|| x=='u'){
                v++;

            }
            else if(x>=97 && x<=122){
                c+=1;
            }
        }

        System.out.println("Vowels :"+v);
        System.out.println("Consonants :"+c);
    }
}