//remove duplicates 

import java.util.Scanner;

class q7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String :");
        String s = sc.nextLine();
        StringBuilder ns = new StringBuilder();
        for(char x : s.toCharArray()){
            int flag = 0;
            for(char y : ns.toString().toCharArray() ){
                if(x==y){
                    flag =1;
                    break;
                }

            }
            if(flag==1){
                continue;
            }
            ns.append(x);

       
        }
        System.out.println("Final Ans : "+ns);

        
}
}