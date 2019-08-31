package apple.screening.screening;

import java.util.Hashtable;
import java.util.Map;

/**
 * Created by Sanal on 4/13/2019.
 */
public class SumZeroSubset {
    public static void main(String[] args) {
        //int[] A = {2,-2,4,2,0,-7,1};
        int[] A = {2,-2,3,0,4,-7};
        //int[] A = {2,-2,-4,2,0};
        //int[] A = {2,-2,0};
        int[] solution = solution(A, 0);
        System.out.println("Count : " + solution[2]);
    }

    private static int[] solution(int[] A, int i) {
        int[] res = new int[3];
        if(i == A.length-1) {
            res[0]=A[i];
            if(A[i]==0){
                res[2]=1;
            }
            return res;
        } else {
            int[] nextRes = solution(A, i+1);
            res[0] = A[i] + nextRes[0];
            res[1] = nextRes[1];
            res[2] += nextRes[2];
            if(res[0] == 0) {
                res[2]++;
            }
            if(res[1] == 0) {
                res[2]++;
            }
            return res;
        }
    }
}
