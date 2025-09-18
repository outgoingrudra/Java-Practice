// longest palindrome substring 
import java.util.Scanner;

class q15{
       static     boolean check(String s ){
        StringBuilder ns = new StringBuilder();
        for(int i=s.length()-1;i>=0;i-- ){
            ns.append(s.charAt(i));
        }
        if(ns.toString().equals(s)){
                    return true;
        }
        return false ;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String :");
        String s = sc.nextLine();
        String ans ;
        ans ="";

        int l = s.length();
        for(int i=0;i<l-1;i++){
            for(int j =i+1;j<l;j++){
                String pi = s.substring(i,j+1);
                if(check(pi)){
                    if(pi.length()>ans.length()){
                        ans =pi;
                    }
                }

            }
        }
        System.out.println("ans :"+ans);
         


        
    }
}