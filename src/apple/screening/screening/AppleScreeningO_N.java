package apple.screening.screening;

/**
 * Created by Sanal on 4/3/2019.
 * Problem: An array, find the stable points in the list of velocity.
 */
public class AppleScreeningO_N {

    public static void main(String[] args) {
        int[] A = {-1,1,3,3,3,2,3,2,1,0};
        System.out.println(findPeriods(A));

        int[] A1 = {0,0,0,0};
        System.out.println(findPeriods(A1));

        int MAX = 1000000;
        int[] A2 = new int[MAX];
        for(int i = 0; i<MAX;i++) {
            A2[i] = 0;
        }
        long start = System.nanoTime();
        System.out.println(findPeriods(A2) + " Time : " + ((System.nanoTime() - start)));
        System.out.println(Integer.MAX_VALUE);
    }

    private static int findPeriods(int[] A) {
        int periods = 0;

        int curDiff = 0, prevDiff=0, continuousPeriods = 0;
        for(int i=0; i<A.length-1; i++) {
            curDiff = A[i] - A[i+1];
            if(curDiff == prevDiff) {
                continuousPeriods++;
            } else {
                periods += findPossiblePeriods(continuousPeriods+1);
                continuousPeriods = 1;
                prevDiff = curDiff;
            }
        }
        periods += findPossiblePeriods(continuousPeriods+1);

        return periods;
    }

    private static int findPossiblePeriods(int n) {
        if(n < 3) {
            return 0;
        }
        int periods = 0;
        for(int i=2;i<n;i++) {
            periods += (n-i);
        }
        return periods;
    }
}

