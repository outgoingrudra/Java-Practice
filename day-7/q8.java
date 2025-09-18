// count words 

import java.util.Scanner;

class q8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String :");
        String s = sc.nextLine();
        int l = s.length();
        int count =1;
        for(int i = 0;i<l;i++){
            if(s.charAt(i)==' '){
               count ++;
            }

        }
        System.out.println("Words : "+count);

        

    }
}