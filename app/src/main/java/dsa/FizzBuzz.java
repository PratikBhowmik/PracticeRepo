package dsa;
import java.util.Scanner;
public class FizzBuzz {
    public static String[] fizzBuzz(int n) {

        //Declared a new Object array of size n
        //Object[] fizz = new Object[n];

        String[] str = new String[n];

        //Iterating through the array and updating the elements

        for (Integer i = 1; i <= n; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                str[i - 1] = "FizzBuzz";
            } else if (i % 3 == 0) {
                str[i - 1] = "Fizz";
            } else if (i % 5 == 0) {
                str[i - 1] = "Buzz";
            } else {
                str[i - 1] = Integer.toString(i);
            }

        }

        return str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] ans = fizzBuzz(n);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}
