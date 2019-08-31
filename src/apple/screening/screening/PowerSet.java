package apple.screening.screening;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by Sanal on 4/16/2019.
 */
public class PowerSet {
    public static void main(String[] args) {
        int limit = 30;
        Integer[] array = new Integer[limit];
        IntStream.range(0,limit).forEach(e-> array[e]=e);
        long startTime = System.nanoTime();
        System.out.println(limit + " - " + powerSet(array, 0).size());
        System.out.println("Time : " + (System.nanoTime() - startTime));
    }

    private static List<List> powerSet(Integer[] A, int i) {
        System.out.println("Invoking PowerSet for " + i);
        List<List> powerSet = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        if(i == A.length -1) {
            list.add(A[i]);
            powerSet.add(list);
            list.clear();
            list = null;
        } else {
            //Add current element to the set.
            list.add(A[i]);
            powerSet.add(list);
            list.clear();
            list = null;
            //Find the remaining elements possible powerset
            powerSet(A,i+1).forEach(e-> {
                powerSet.add(e);
                List set = new ArrayList<>();
                set.addAll(e);
                set.add(A[i]);
                powerSet.add(set);
            });
        }

        return powerSet;
    }
}
