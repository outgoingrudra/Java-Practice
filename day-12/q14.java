import java.util.ArrayList;
import java.util.Collections;

public class q14 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(45);
        nums.add(12);
        nums.add(78);
        nums.add(34);
        nums.add(23);

        System.out.println("Original List: " + nums);
        Collections.sort(nums);
        System.out.println("Sorted List (Ascending): " + nums);

        Collections.sort(nums, Collections.reverseOrder());
        System.out.println("Sorted List (Descending): " + nums);
    }
}
