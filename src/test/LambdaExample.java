package test;

/**
 * Created by Sanal on 4/2/2019.
 */
public class LambdaExample {
    public static void main(String[] args) {
        System.out.println(DoubleOperation.PLUS.apply(5.0,8.0));
        System.out.println(DoubleOperation.MINUS.apply(8.0,1.0));
    }
}

enum DoubleOperation {
    PLUS("+", (x,y) -> x+y),
    MINUS("-", (x,y) -> x-y);

    private String symbol;
    private Operation op;

    DoubleOperation(String symbol, Operation op) {
        this.symbol = symbol;
        this.op = op;
    }

    public Double apply(Double x, Double y) {
        return op.apply(x,y);
    }
}

@FunctionalInterface
interface Operation {
    Double apply(Double x, Double y);
}