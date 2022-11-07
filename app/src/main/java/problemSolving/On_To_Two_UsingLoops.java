package problemSolving;

public class On_To_Two_UsingLoops {
    public static void usingFor() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(" " + i);
        }
    }

    public static void usingWhile() {
        int i = 1;
        while (i <= 10) {
            System.out.println(" " + i);
            i++;
        }
    }

    public static void main(String[] args) {
        usingFor();
        usingWhile();
    }
}
