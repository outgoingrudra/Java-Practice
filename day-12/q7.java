import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num, sum = 0, digits = String.valueOf(num).length();

        while (num > 0) {
            int d = num % 10;
            sum += Math.pow(d, digits);
            num /= 10;
        }

        if (sum == original)
            System.out.println(original + " is an Armstrong Number");
        else
            System.out.println(original + " is NOT an Armstrong Number");
    }
}
