package Project1;


import java.util.function.DoubleUnaryOperator;

public  interface Calculator {


    static  <T> double calculateFees (T clubID, DoubleUnaryOperator operator) {
        return operator.applyAsDouble (0);
    }
}
