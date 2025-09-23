import java.util.ArrayList;
import java.util.Scanner;

public class q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.print("Enter item " + (i+1) + ": ");
            list.add(sc.nextLine());
        }

        System.out.println("Your List: " + list);
    }
}
