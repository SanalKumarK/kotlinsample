package apple.screening.screening;

/**
 * Created by Sanal on 4/12/2019.
 */
public class AppleScreening3 {

    public static void main(String[] args) {
        int[] A = {2,-2,3,0,4,-7};
        System.out.println(new AppleScreening3().solution(A));
/*
        int[] A1 = {0};
        System.out.println(new AppleScreening3().solution(A1));

        int[] A2 = new int[1000000];
        for(int i=0;i<1000000;i++) {
            A2[i] =0;
        }
        System.out.println(new AppleScreening3().solution(A2));*/
    }

    public int solution(int[] A) {
        // write your code in Java SE 8
        if(A.length > 100000 && inValidContinoursZero(A)){
            return -1;
        }

        int count = 0;
        for(int end = 0, window = 0; window <= A.length; window++) {
            end = A.length-window;
            for(int index = 1; index <= end ;index++) {
                if(sum(A, index, index+window) == 0) {
                    count++;
                }
            }
        }
        return validatedOP(count);
    }

    private boolean inValidContinoursZero(int[] A) {
        for (int i = 0; i <= 100000; i++) {
            if (A[i] != 0) {
                return false;
            }
        }
        return true;
    }

    private int validatedOP(int count) {
        if(count > 1000000000) {
            return -1;
        }
        return count;
    }

    private int sum(int[] A, int start , int end) {
        int sum = 0;
        for(int i=start;i<=end;i++) {
            sum += A[i-1];
        }
        return sum;
    }
}
