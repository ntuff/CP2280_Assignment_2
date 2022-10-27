//TODO: Complete test 4, test for negatives in all
public class FibonacciCalculatorTest {

    public static void main(String[] args) {
        System.out.println("Fibonacci Calculator Test");

        //Test 1: set a number and check to see if it's a fibonacci square
        System.out.println("Test 1:");
        System.out.println(FibonacciCalculator.isFibonacciNumber(23));
        System.out.println(FibonacciCalculator.isFibonacciNumber(40));
        System.out.println(FibonacciCalculator.isFibonacciNumber(7));
        System.out.println(FibonacciCalculator.isFibonacciNumber(8));

        //Test 2: Prints n Fibonacci numbers (ie. Print the first 25 Fibonacci numbers)
        System.out.println("\nTest 2:");
        int n = 14;
        for(int i = 0; i < n; i++){
            System.out.println(FibonacciCalculator.getFibonacciNumber(i));}

        //Test 3: set a number to specify a place in the fibonacci sequence and print its value
        System.out.println("\nTest 3:");
        System.out.println(FibonacciCalculator.getFibonacciNumber(4));
        System.out.println(FibonacciCalculator.getFibonacciNumber(7));
        System.out.println(FibonacciCalculator.getFibonacciNumber(14));

        //Test 4:  displays all the Fibonacci numbers less than a value input by the user
        System.out.println("\nTest 4:");
        int n2 = 14;
        for(int i = 0; FibonacciCalculator.getFibonacciNumber(i) <= n2; i++){
            System.out.println(FibonacciCalculator.getFibonacciNumber(i));}
    }
}
