package problemSolving;

public class TrianglePatterClass {

    public static void main(String[] args) {
        int m = 5;
        int n = 4;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int k = 1; k <= n; k++ ) {
            for (int l = n; l >= k; l--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
