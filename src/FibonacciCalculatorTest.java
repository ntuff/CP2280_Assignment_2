import java.util.Arrays;

public class FibonacciCalculatorTest {

    public static void main(String[] args) {
        System.out.println("Fibonacci Calculator Test");

        //Test 1: set a number and check if perfect square
        FibonacciCalculator fibonacciCalculator = new FibonacciCalculator();
        System.out.printf("Is perfect square = %b\n", fibonacciCalculator.isPerfectSquare(21));
        fibonacciCalculator.setNumber(40);
        System.out.printf("Is perfect square = %b\n", fibonacciCalculator.isPerfectSquare(16));


    }

//    public static void printIsPerfectSquare(FibonacciCalculator fibonacciCalculator){
//        System.out.printf("Is perfect square = %b", fibonacciCalculator.isPerfectSquare();
//    }
}
