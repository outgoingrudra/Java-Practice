//check only digit
import java.util.Scanner;

class q14{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String :");
        String s = sc.nextLine();
        int flag =1;
        for(char x : s.toCharArray()){
            if(!(x>=48 && x <=58)){
                flag=0;
                break;
            }
        }
        if(flag==1){
            System.out.println("only digit ");
        }
        else{
            System.out.println("not only digit");
        }
        

        
    }
}