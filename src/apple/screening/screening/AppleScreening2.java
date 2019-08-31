package apple.screening.screening;

/**
 * Created by Sanal on 4/12/2019.
 */
public class AppleScreening2 {
    public static void main(String[] args) {
        int[] A = {6,1,4,6,3,2,7,4};
        System.out.println(new AppleScreening2().solution(A, 3, 2));
        int[] B = {10,19,15};
        System.out.println(new AppleScreening2().solution(B, 2, 2));
    }

    public int solution(int[] A, int K, int L) {
        // write your code in Java SE 8

        if(K+L > A.length) {
            return -1;
        }

        int sum = 0, aliceMax=0, aliceStart =0, bobMax=0;
        for(int row=1; row <= A.length - K+1; row++) {
            sum = findSum(A,row,row+K);
            if( aliceMax < sum){
                aliceMax = sum;
                aliceStart = row;
            }
        }

        for(int i=aliceStart; i<aliceStart+K; i++) {
            A[i-1] = 0;
        }

        for(int row=1; row <= A.length - L+1; row++) {
            sum = findSum(A,row,row+L);
            if( bobMax < sum){
                bobMax = sum;
            }
        }
        return aliceMax + bobMax;
    }

    private int findSum(int[] A, int start, int end) {
        int sum = 0;
        for(int i=start-1;i<end-1;i++) {
            sum += A[i];
        }
        return sum;
    }
}
