package dsa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Tesla {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] diffs = new int[n];
        for (int i = 0; i < n; i++) {
            diffs[i] = sc.nextInt();
        }
        int[] ans = tesla(n, diffs);
        System.out.println(ans[0] + " " + ans[1]);
    }
    static int[] tesla(int n, int[] diffs) {

        int initialSpeed = 1500;

//declaring array to store the elements one by one
        List<Integer> li = new ArrayList<>();

//just iterating the array and storing the updated result in another place one by onne

//now iterate add and store updated values

        for (int i = 0; i < n; i++){
            int update = initialSpeed + diffs[i];
            li.add(update);
        }






        // for (int i = 0; i < diffs.length; i++){

        //     initialSpeed +=diffs[i];
        // }


        return null;
    }
}
