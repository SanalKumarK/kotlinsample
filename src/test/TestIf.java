package test;

/**
 * Created by Sanal on 3/27/2019.
 */
public interface TestIf extends IfA {
    void method1();

    default void method2() {
        System.out.println("from method");
    }

    static Integer method3() {
        return new Integer(5);
    }

    @Override
    default void methodA() {

    }
}
