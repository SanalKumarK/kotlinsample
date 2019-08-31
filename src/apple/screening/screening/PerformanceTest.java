package apple.screening.screening;

import kotlin.ranges.IntRange;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Created by Sanal on 4/16/2019.
 */
public class PerformanceTest {
    public static void main(String[] args) {
        /*long startTime = System.nanoTime();
        int[] list = new int[Integer.MAX_VALUE];
        IntStream.rangeClosed(0,Integer.MAX_VALUE).forEach(e->list[e] = e);
        System.out.println(list.length);
        System.out.println(System.nanoTime()-startTime);*/
        Double size = Integer.MAX_VALUE * 4.0;
        System.out.println(size);
    }
}
