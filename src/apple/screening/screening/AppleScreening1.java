package apple.screening.screening;

/**
 * Created by Sanal on 4/3/2019.
 * Problem: An array, find the stable points in the list of velocity.
 */
public class AppleScreening1 {
    public static void main(String[] args) {
        int[] A = {-1,1,3,3,3,2,3,2,1,0};
        System.out.println(new AppleScreening1().solution(A));
/*
        int[] A1 = {5,5,5,5,5,5};
        System.out.println(new AppleScreening1().solution(A1));
*/
        int MAX = 10;
        int[] A2 = new int[MAX];
        for(int i = 0; i<MAX;i++) {
            A2[i] = 0;
        }
        long start = System.nanoTime();
        System.out.println(new AppleScreening1().solution(A2) + " Time : " + ((System.nanoTime() - start)));
    }

    public int solution(int[] A) {
        if(A.length <= 3) {
            return 0;
        }
        int count = 0;
        for(int window = 2; window < A.length; window++) {
            for(int index=1; index <= A.length - window; index++) {
                if(checkIfStable(A, index, index+window)){
                    count++;
                }
            }
        }
        return count;
    }

    private boolean checkIfStable(int[] A, int start, int end) {
        int diff = A[start-1]-A[start];
        for(int i=start; i< end-1; i++) {
            if(diff != (A[i] - A[i+1])) {
                return false;
            }
        }
        return true;
    }
}

