// anagram
import java.util.Arrays;
import java.util.Scanner;

class q10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String :");
        String s1 = sc.nextLine();
        System.out.print("Enter String :");
        String s2 = sc.nextLine();



        char []x=s1.toLowerCase().toCharArray();
        Arrays.sort(x);

       
        char []y=s2.toLowerCase().toCharArray();
        Arrays.sort(y);

        int l1 = x.length;
        int l2 = y.length;
        if(l1!=l2){
            System.out.println("Not Anagram !");
        }
        else {
            boolean f=true;
            for(int i=0;i<l1;i++){
                if(x[i]!=y[i]){
                    f=false;
                    break;
                }
            }
            if(f){
                System.out.println("Anagrams");
            }
            else {
                System.out.println("Not Anagrams");
            }
        }

        

        

    }
}