package dsa;

import java.util.*;

public class MathProfessor {
    static int[] mathProfessor(int n, String B, String[] a) {
        char[] arrayB = B.toCharArray();
        Set<Character> setB = new HashSet<>();
        List<Integer> result = new ArrayList<>();


        for (int i = 0; i < arrayB.length; i++) {
            setB.add(arrayB[i]);
        }


        List<Set> listC = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            Set<Character> setA = new HashSet<>();
            for (int j = 0; j < a[i].length(); j++) {
                if (!a[i].charAt(j)) {
                    setA.add(a[i].charAt(j));
                }
            }
            listC.add(setA);
        }
        for (Set s : listC) {
            int count = 0;
            Iterator<Character> it = setB.iterator();

            while (it.hasNext()) {
                if (s.contains(it.next())) {
                    count++;
                }
            }
            result.add(count);

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String B = sc.nextLine();
        String a[] = new String[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLine();
        }
        int[] res = mathProfessor(n, B, a);
        for (int i : res)
            System.out.print(i + " ");

    }
}
