package generics;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>();
        pair.setFirst("first");
        pair.setSecond(2);
        List<Pair<String, Integer>> list = new ArrayList<>();
        list.add(pair);
        System.out.println(list .toString());
    }
}
