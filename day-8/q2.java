// substring freq 

import java.util.Scanner;

class q2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String :");
        String s = sc.nextLine();
        System.out.println("Enter Substring :");
        String ss = sc.nextLine();

        int ssl  = ss.length();
        int l = s.length();
        int ans =0;
        for(int i=0;i<=l-ssl;i++){
            int flag =1;
            for(int j =0;j<ssl;j++){
                if(s.charAt(i+j)!=ss.charAt(j)){
                flag=0;
                break;}

            }
            if(flag==1){
                ans +=1;

            }
            
        }

        System.out.println("total :"+ans);



    }}
