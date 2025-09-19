
import java.util.ArrayList;
import java.util.Scanner;

//uniques 

class q5{
    public static void main(String[] args) {

        System.out.println("Enter String :");
        String s = new Scanner(System.in).nextLine();
        ArrayList<Character> cr = new ArrayList<>();
        for(Character x : s.toCharArray()){

            if(!cr.contains(x)){
                cr.add(x);
               

            }
        }
        System.out.print("Ans :");
        for(Character c : cr){
            System.out.print(c);
        }
        
    }
}