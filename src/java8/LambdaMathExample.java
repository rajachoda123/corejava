package java8;

import java.util.function.Function;
import java.util.function.Supplier;

@FunctionalInterface
interface MathsOperation {
    int operation(int a, int b);
}
interface Dummy {
    void dum();
}
public class LambdaMathExample {
    public static void main(String[] args) {
        MathsOperation addition = (a, b) -> a + b;
        MathsOperation subtraction = (a, b) -> a - b;
        MathsOperation multiplication = (a, b) -> a * b;
        MathsOperation division = (a, b) -> a / b;
        System.out.println("addition is :" + addition.operation(5, 3));
        System.out.println("Substraction is :" + subtraction.operation(7, 10));
        System.out.println("multiplication is: " + multiplication.operation(2, 9));
        System.out.println("division is" + division.operation(5, 10));

    }
}
