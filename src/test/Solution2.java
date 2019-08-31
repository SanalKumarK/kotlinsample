package test;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Created by Sanal on 4/1/2019.
 */
public class Solution2 {
    public static void main(String[] args) {
        System.out.println(16 << 2);
        System.out.println(8 >> 2);

        try{
            throw new Exception("Test");
        } catch(Throwable e) {
            e.getMessage();
        }
        //int[] arr = {5,3,4,1,2};
        /*int[] arr = {5,4,3,2,1};
        System.out.println(new Solution2().treeSolution(arr));
        int[] arr1 = {4,2,5,9,1};
        System.out.println(new Solution2().treeSolution(arr1));
        int[] arr2 = {-4,-2,-5,-9,-1};
        System.out.println(new Solution2().treeSolution(arr2));
        int[] arr4 = new int[2*100000];
        int id=0;
        for(int i=-100000;i<100000;i++) {
            arr4[id++] = i;
        }
        System.out.println(new Solution2().treeSolution(arr4));*/
    }

    public int solution(int[] A) {
        // write your code in Java SE 8
        int t = 0;
        for(int i=0;i<A.length-1;i++) {
            for(int j=0;j<A.length-1;j++) {
                if(A[j] > A[j+1]) {
                    t = A[j];
                    A[j] = A[j+1];
                    A[j+1] = t;
                }
            }
        }
        for(int i =0; i<A.length;i++) {
            System.out.print(A[i] + " ");
        }

        return 0;
    }

    public int treeSolution(int[] A) {
        // write your code in Java SE 8
        TreeSet<Integer> treeSet = new TreeSet<>();
        for(int i=0;i<A.length;i++) {
            treeSet.add(Integer.valueOf(A[i]));
        }
        Integer min = 1;
        Iterator iterator = treeSet.tailSet(1).iterator();
        while(iterator.hasNext()) {
            if(!min.equals(iterator.next())) {
                return min;
            }
            min++;
        }
        return min;
    }
}