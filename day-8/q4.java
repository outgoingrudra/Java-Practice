
import java.util.Scanner;

// check equality
class q4{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter First string :");
        String s1 = s.nextLine();
        System.out.print("Enter Second string :");
        String s2 = s.nextLine();

        if(s1.length()==s2.length()){
            int flag = 1;
            for(int i=0;i<s1.length();i++){
                if(s1.charAt(i)!=s2.charAt(i)){
                    flag=0;
                    break;
                }

            }
            if(flag==1){
                System.out.println("equal");
            }
            else {
                System.out.println("Not Equal");
            }

        }
        else{
            System.out.println("Not equal");
        }
    }
}