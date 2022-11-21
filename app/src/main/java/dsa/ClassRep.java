package dsa;
import java.util.Scanner;
public class ClassRep {
    static String classRep(int[] num, int n) {
        for (int index = 0; index < num.length; index++) {
            if (index % 2 == 0 && num[index] < num[index + 2]) {
                return "increasing";
            } else if (index % 2 == 0 && num[index] > num[index + 2]) {
                return "decreasing";
            }
        }
        return "none";
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = scan.nextInt();
        }
        System.out.println(classRep(num, n));
    }
}
