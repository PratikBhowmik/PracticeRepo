package dsa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RotateArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }
        ArrayList<Integer> ans = rotateArray(numbers, k);
        for (Integer x : ans) {
            System.out.print(x + " ");
        }
    }

    static ArrayList<Integer> rotateArray(ArrayList<Integer> numbers, int k) {
        ArrayList<Integer> rotatedList = new ArrayList<>();
        for (int index = 0; index < k; index++) {
            rotatedList.add(numbers.get(index));
            Collections.rotate(rotatedList, k);
        }
        return rotatedList;
    }
}
