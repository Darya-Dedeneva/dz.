package Fitness;


import java.util.function.DoubleUnaryOperator;

public  interface Calculator <T extends Number>{

    double calculateFees(T clubID);

  /*  static  <T> double calculateFees (T clubID, DoubleUnaryOperator operator) {
        return operator.applyAsDouble (0);
    }*/
}
