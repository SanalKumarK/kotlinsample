package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Collectors;

/**
 * Created by Sanal on 3/27/2019.
 */
public class TestStream {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);

        Spliterator<Integer> l1 = list.spliterator();
        Spliterator<Integer> l2 = l1.trySplit();
        l1.forEachRemaining(System.out::println);
        System.out.println("#######################");
        l2.forEachRemaining(System.out::println);

        List<Integer> newList = list.stream()
                .filter( x -> x%2 == 0)
                .collect(Collectors.toList());

        System.out.println(newList);
    }
}
