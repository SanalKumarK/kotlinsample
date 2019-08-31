package apple.screening.screening;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sanal on 4/16/2019.
 */
public class TestArrayList {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        for(Integer i =0; i<=Integer.MAX_VALUE;i++) {
            System.out.println(i);
        }
        System.out.println(System.nanoTime()-startTime);
    }
}
