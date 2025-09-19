import java.util.Scanner;

public class q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[4]; 
        System.out.println("Enter 4 numbers (from 1 to 5):");
        for (int i = 0; i < 4; i++) {
            arr[i] = sc.nextInt();
        }

        int check[] = new int[6];  // index 1..5

        // mark entered numbers
        for (int i = 0; i < 4; i++) {
            check[arr[i]] = 1;
        }

        // find missing
        for (int i = 1; i <= 5; i++) {
            if (check[i] == 0) {
                System.out.println("Missing Number: " + i);
            }
        }
    }
}
