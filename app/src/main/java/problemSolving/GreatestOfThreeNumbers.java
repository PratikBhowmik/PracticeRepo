package problemSolving;

import java.util.Scanner;

public class GreatestOfThreeNumbers {
    public static int threeNumbers(int a, int b, int c) {
        int largestoffirstTwo = Math.max(a,b);
        int largestNumber = Math.max(largestoffirstTwo, c);
        return largestNumber;
    }

    public static void main(String[] args) {
        System.out.println(threeNumbers(18,-5555,9));
    }
}
