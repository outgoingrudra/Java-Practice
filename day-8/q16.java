import java.util.Scanner;

public class q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter k value:");
        int k = sc.nextInt();

        if (k > arr.length) {
            System.out.println("Not Possible");
        } else {
            // Temporary array to store rotated result
            int rotated[] = new int[arr.length];

            // Left rotation by k
            for (int i = 0; i < arr.length; i++) {
                rotated[i] = arr[(i + k) % arr.length];
            }

            System.out.println("Rotated Array:");
            for (int x : rotated) {
                System.out.print(x + " ");
            }
        }
    }
}
