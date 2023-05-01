package corejavatwo;

import java.util.ArrayList;
import java.util.Scanner;

public class Prime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            nums.add(n);
        }
        ArrayList<Boolean> ans = checkPrime(t, nums);
        for (boolean res : ans) {
            System.out.println(res);
        }
    }
    static boolean primeCheck(int number)
    {
        for (int i = 2; i < number; i++)
        {
            if (number % i == 0)
            {
                return false;
            }
        }
        return true;
    }
    // TODO: Implement this method
    static ArrayList<Boolean> checkPrime(int t, ArrayList<Integer> nums)
    {
        ArrayList<Boolean> listoftruefalse = new ArrayList<>();
        for (Integer numbers : nums)
        {
            if (primeCheck(t) == true) {
                listoftruefalse.add(true);
            } else {
                listoftruefalse.add(false);
            }
        }
        return listoftruefalse;
    }
}
