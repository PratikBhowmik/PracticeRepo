package problemSolving;

public class FibonacciSeries {
    public static void fibonnacci(int totalDigityouWant) {
        int zero = 0;
        int one = 1;
        for (int i = 0; i <= totalDigityouWant; i++) {
            int added = zero + one;
            System.out.print(added+ "  ");
            zero = one;
            one = added;
            //0 ,1 ,1 , 2, 3, 5, 8, 13...
        }
    }
    public static void main(String[] args) {
        fibonnacci(10);
    }
}
