package problemSolving;

import java.util.*;
import java.util.stream.Collectors;

public class FindTheDuplicateNumber {
    public int findTheDuplicateNumber(int[] nums) {

        Set<Integer> dupli = new HashSet<>();
        for (int num : nums) {
            if (!dupli.contains(num)) {
                dupli.add(num);
            } else {
                return num;
            }
        }
        return 0;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int nums[] = new int[n + 1];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }
        scanner.close();
        int result = new FindTheDuplicateNumber().findTheDuplicateNumber(nums);
        System.out.println(result);
    }
}
