// count upper lower char
import java.util.Scanner;

class q18{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String :");
        String s = sc.nextLine();
        int up=0;
        int low=0;
        int sp=0;
        
        for(char x : s.toCharArray()){
            if(x>=65 && x<=90){
              up++;
            }
            else if(x>=97 && x <= 122){
               low++;
            }
            else{
                sp++;
            }
        }
        System.out.println("Upper:"+up);
        System.out.println("lower:"+low);
        System.out.println("spaces:"+sp);


        
    }
}