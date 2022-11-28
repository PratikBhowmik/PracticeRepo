package corejavatwo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Just {

    public static void main(String[] args) {

        int [] justConsider = {1, 2, 3, 4, 5};

        List<Integer> li = new ArrayList<>();
        int initialSpeed = 1500;

        for (int i = 0; i < justConsider.length; i++){
            int update = initialSpeed + justConsider[i];
            li.add(update);
        }

        Iterator it = li.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
