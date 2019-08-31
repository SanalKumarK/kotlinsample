package apple.screening.screening;

import java.util.Hashtable;

/**
 * Created by Sanal on 4/13/2019.
 */
public class MaxSum {

    private static int count =0;
    private static Hashtable<Integer, Integer> cacheSumResult = new Hashtable<>();

    public static void main(String[] args) {
        int[] A = {20,30,10,90,100, -100, 30, -80};
        System.out.println(maxSum(A,0));
        System.out.println("Traversal : " + count);
    }

    private static int maxSum(int[] A, int i) {
        if(i>=A.length) {
            return 0;
        } else {
            if(cacheSumResult.get(i+1) == null) {
                count++;
                cacheSumResult.put(i+1,maxSum(A, i+1));
            }
            return Math.max((A[i] + cacheSumResult.get(i+1)), cacheSumResult.get(i+1)) ;
        }
    }
}
