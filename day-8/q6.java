// reverse words 


import java.util.ArrayList;
import java.util.Scanner;

class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String s = sc.nextLine();
        String ans = "";

        ArrayList<String> word = new ArrayList<>();
        String w = "";

        for (char x : s.toCharArray()) {
            if (x == ' ') {
                if(!w.isEmpty()){
                    word.add(w);
                    w="";
                }
            } else {
                w += x;
            }
        }

        if (!w.isEmpty()) {
        
            word.add(w);
        }
         
        for(String x : word.reversed()){
            ans+=x+" ";

        }

        System.out.println("final String : " + ans);
    }
}
