import java.util.ArrayList;
import java.util.Scanner;

public class q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        names.add("Ravi");
        names.add("Anita");
        names.add("Kiran");
        names.add("Mohan");

        System.out.println("Names: " + names);
        System.out.print("Enter name to remove: ");
        String toRemove = sc.nextLine();

        if (names.remove(toRemove))
            System.out.println(toRemove + " removed. New List: " + names);
        else
            System.out.println(toRemove + " not found in the list!");
    }
}
