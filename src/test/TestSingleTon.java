package test;

/**
 * Created by Sanal on 3/29/2019.
 */
public class TestSingleTon {
    public static void main(String[] args) {
        /*SingleTone sing = SingleTone.getInstance();
        System.out.println(sing.printMe());

        EnumSingleTone enumSingleTone = EnumSingleTone.ENUM_SINGLE_TONE;
        EnumSingleTone enumSingleTone1 = EnumSingleTone.ENUM_SINGLE_TONE;
        System.out.println(enumSingleTone.printme());
        System.out.println(enumSingleTone.printme());
        System.out.println(enumSingleTone.printme());
        System.out.println(enumSingleTone1.printme());
        System.out.println(enumSingleTone1.printme());
        System.out.println(enumSingleTone1.printme());*/
        long startTime = System.currentTimeMillis();
        Long sum = 0l;
        for(long i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        System.out.println(String.format("Sum : %d", sum));
        System.out.println(String.format("Option 1 : Total Time : %d", System.currentTimeMillis() - startTime));

        long startTime1 = System.currentTimeMillis();
        Long sum1 = 0l;
        for(Long i = 0l; i < Integer.MAX_VALUE; i++) {
            sum1 += i;
        }
        System.out.println(String.format("Option 2 : Total Time : %d", System.currentTimeMillis() - startTime1));

        long startTime2 = System.currentTimeMillis();
        long sum2 = 0l;
        for(long i = 0l; i < Integer.MAX_VALUE; i++) {
            sum2 += i;
        }
        System.out.println(String.format("Option 3 : Total Time : %d", System.currentTimeMillis() - startTime2));


        

    }
}
