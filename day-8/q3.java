// remove duplicate words

import java.util.ArrayList;
import java.util.Scanner;

class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String s = sc.nextLine();
        String ans = "";

        ArrayList<String> word = new ArrayList<>();
        String w = "";

        for (char x : s.toCharArray()) {
            if (x == ' ') {
                if (!w.isEmpty()) {
                    if (!word.contains(w)) {
                        ans += w + " ";
                        word.add(w);
                    }
                    w = "";
                }
            } else {
                w += x;
            }
        }

        // handle last word
        if (!w.isEmpty() && !word.contains(w)) {
            ans += w;
            word.add(w);
        }

        System.out.println("final String : " + ans.trim());
    }
}
