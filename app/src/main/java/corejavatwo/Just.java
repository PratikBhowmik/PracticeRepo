package corejavatwo;

import java.util.*;

public class Just {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int[] justConsider = {-1, 2, 3, 4, 5, 2};


        List<Integer> li = new ArrayList<>();
        int initialSpeed = 1500;

        for (int i = 0; i < justConsider.length; i++) {
            int update = initialSpeed + justConsider[i];
            li.add(update);
        }


        int largestElement = Collections.max(li);

        int lastElement = li.get(li.size() - 1);

        int [] twoElements = {largestElement, lastElement};

    }
}
