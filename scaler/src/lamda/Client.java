package lamda;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
       // lamda function can refer via functional interface
        Runnable task = () -> {
            System.out.println("hello world");
        };
        Thread thread = new Thread(task);
        thread.start();
//        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
//        list.stream()
//                .filter(e -> e % 2 == 0)
//                .forEach(System.out::println);
    }
}
