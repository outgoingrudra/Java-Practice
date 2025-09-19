// largest and smallest word

import java.util.Scanner;

class q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String :");
        String s = sc.nextLine();

        String small =s;
       
        String big;
        big ="";
     String w ;
     w="";


        for(char x : s.toCharArray()){
            if (x==' '){
                if(w.length() > big.length()){
                    big = w;
                }
                if(w.length()<small.length()){
                    small = w;
                }
                w="";
            }
            else {
                w= w+x;
            }
        }
         if(w.length() > big.length()){
                    big = w;
                }
        
        System.out.println("Biggest :"+big);
        System.out.println("Smallest :"+small);
     


        
    }
}