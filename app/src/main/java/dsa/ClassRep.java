package dsa;

import java.util.Scanner;

public class ClassRep {
    static String classRepresentative(int[] num, int n) {
//        for (int index = 0; index < num.length; index += 2) {
//            if (num[index] < num[index + 2]) {
//                return "increasing";
//            } else if (num[index] > num[index + 2]) {
//                return "decreasing";
//            }
//        }
//        return "none";

        if (increasing(num)) {
            return "increasing";
        } else if (decreasing(num)) {
            return "decreasing";
        } else {
            return "none";
        }
    }

    public static boolean increasing(int[] num) {
        for (int i = 0; i < num.length - 2; i++) {
            if (num[i] < num[i + 2]) {
            }
        }
        return true;
    }

    public static boolean decreasing(int[] num) {
        for (int i = 0; i < num.length - 2; i++) {
            if (num[i] > num[i + 2]) {
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = scan.nextInt();
        }
        System.out.println(classRepresentative(num, n));
    }
}
