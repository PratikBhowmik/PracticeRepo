package corejavatwo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StringReverse {
    static String reverseString(String str) {
        String reversedString = " ";
        String[] strAr = str.split(" ");
        char c;

        char[] charArray = str.toCharArray();

        List<String> list = new ArrayList<>();

        for (String allTheWords : strAr) {
            list.add(allTheWords);
        }

        for (int i = 0; i < list.size(); i++) {


            if (list.get(i).length() % 2 != 0) {

                Collections.reverse(list);

            }

        }

        Collections.reverse(list);

        Iterator it = list.iterator();

        while (it.hasNext()) {
            System.out.print(it.next());
        }

//        for (int i = 0; i < strAr.length; i++) {
//
//            char chara;
//
//            for (int j = 0; j < strAr[i].length(); j++) {
//
//                if (strAr[i].length() % 2 != 0) {
//
//                    chara = strAr[i].charAt(j);
//
//                    reversedString = chara + reversedString;
//                }
//            }
//            reversedString = reversedString + " " + strAr[i];
//        }

        return reversedString;
    }

    public static void main(String[] args) {
        System.out.print(reverseString("Pratik is a good boy"));
    }
}
