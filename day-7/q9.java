import java.util.Scanner;

class q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String s = sc.nextLine();
        char ans = ' ';
        
        for (char x : s.toCharArray()) {
            int c = 0;
            for (char y : s.toCharArray()) {
                if (x == y) {
                    c++;
                }
            }
            if (c == 1) {  
                ans = x;
                break;
            }
        }

        if (ans == ' ') {
            System.out.println("No Non-Repeating Character !!!!");
        } else {
            System.out.println("First Non-Repeating Character : " + ans);
        }

        sc.close();
    }
}
