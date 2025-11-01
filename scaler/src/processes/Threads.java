package processes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Threads {

    public static void main(String[] args) {
        Client thread = new Client();
//        thread.start();


        List list = List.of(1, 2, 3, 4, 5);
        for (int i = 0; i < list.size(); i++) {
            thread.start();
        }


        List<String> names1 = List.of("Alice", "Abd", "Bsjd");
        List<String> res =  names1.stream().filter(name -> name.charAt(0) == 'A' )
                .map((name) -> name.toUpperCase())
                .sorted()
                .collect(Collectors.toList());

        System.out.println(res);
    }
}
