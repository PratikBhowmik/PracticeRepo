package dsa;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsPractice {
    public static void main(String[] args) {
        String s = "My1name2is3kiran4";
        Map<Integer, String> map = Arrays.asList(s.split("(?<=\\d)"))
                .stream()
                .map(n -> n.split("(?=\\d)"))
                .collect(Collectors.toMap((e -> Integer.parseInt(e[1])), e -> e[0]));
        s = map.values().stream().collect((Collectors.joining(" ")));
        System.out.println("The modified string is as follows -> " + s);
    }
}
