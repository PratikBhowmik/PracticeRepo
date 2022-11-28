package corejavatwo;

import java.util.Arrays;
import java.util.Scanner;

public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {


        int len = nums.length;

        boolean [] isPresent = new boolean [len];

        for (int n : nums){

            if (n >= 0 && n < len){
                isPresent[n] = true;
            }

        }

        for (int i = 0; i < len; i++){

            if (!isPresent[i]){

                return i;

            }
        }
        return len + 1;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; ++i) {
            nums[i] = in.nextInt();
        }
        int result = new FirstMissingPositive().firstMissingPositive(nums);
        System.out.println(result);
    }
}
