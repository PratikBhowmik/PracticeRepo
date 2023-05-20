package problemSolving;
import java.util.Scanner;
public class DiamondPrinting {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[][] pattern = diamondPrinting(n);
        for (int i = 0; i < n; i++){
            for (int j = 0; j < i; i++) {
                System.out.println(pattern[i][j]);
            }
        }
    }
    static String[][] diamondPrinting(int n) {
        String [][] str = new String[n][n - 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                str[i][j] = "*";
            }
            System.out.println();
        }
        for (int k = 0; k < n-1; k++ ) {
            for (int l = n-1; l > k; l--){
                str[l][k] = "*";
            }
        }
        return str;
    }
}

