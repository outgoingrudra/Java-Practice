
import java.util.Scanner;

class q6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String :");
        String s = sc.nextLine();
        for(char x : s.toCharArray()){
            int c = 0;
            for(char y : s.toCharArray()){
                if(x==y){
                    c+=1;
                }
            }
            System.out.println("Frequency of "+x+" : "+c);
        }

        
}
}