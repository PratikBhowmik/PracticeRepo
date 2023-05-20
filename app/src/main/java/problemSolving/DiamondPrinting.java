package problemSolving;

import java.util.Scanner;

class DiamondPrinting {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] pattern = diamondPrinting(n);
        for (int i = 0; i < 2 * n - 1; i++)
            System.out.println(pattern[i]);
    }

    static String[] diamondPrinting(int n) {
        String[] pattern = new String[2 * n - 1];
        int stars = 1;
        int spaces = n - 1;

        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < stars; j++)
                sb.append("*");
            for (int j = 0; j < spaces; j++)
                sb.append(" ");
            pattern[i] = sb.toString();
            stars++;
            spaces--;
        }

        stars = n - 1;
        spaces = 1;

        for (int i = n; i < 2 * n - 1; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < stars; j++)
                sb.append("*");
            for (int j = 0; j < spaces; j++)
                sb.append(" ");
            pattern[i] = sb.toString();
            spaces++;
            stars--;
        }

        return pattern;
    }
}
