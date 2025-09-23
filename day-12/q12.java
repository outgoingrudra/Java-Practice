import java.util.ArrayList;
import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("ArrayList: " + numbers);
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        if (numbers.contains(key))
            System.out.println(key + " found at index " + numbers.indexOf(key));
        else
            System.out.println(key + " not found!");
    }
}
