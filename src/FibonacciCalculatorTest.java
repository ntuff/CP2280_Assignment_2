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
        System.out.println("");

        //Test 2: Prints n Fibonacci numbers (ie. Print the first 25 Fibonacci numbers)
        System.out.println("Test 2:");
        int n = 14;
        for(int i = 0; i < n; i++){
            System.out.println(FibonacciCalculator.getFibonacciNumber(i));}

        //Test 3: set a number to specify a place in the fibonacci sequence and print its value
        System.out.println("");
        System.out.println("Test 3:");
        System.out.println(FibonacciCalculator.getFibonacciNumber(4));
        System.out.println(FibonacciCalculator.getFibonacciNumber(7));
        System.out.println(FibonacciCalculator.getFibonacciNumber(14));
        System.out.println("");

        //Test 4:  displays all the Fibonacci numbers less than a value input by the user
        System.out.println("Test 4:");
        int n2 = 14;
        for(int i = 0; FibonacciCalculator.getFibonacciNumber(i) <= n2; i++){
            System.out.println(FibonacciCalculator.getFibonacciNumber(i));}


//        //Test 1: set a number and check to see if it's a perfect square
//        FibonacciCalculator fibonacciCalculator = new FibonacciCalculator();
//        System.out.println("\nTest 1:");
//        fibonacciCalculator.setNumber(40);
//        System.out.printf("Is %d ", fibonacciCalculator.number);
//        System.out.printf("a perfect square? %b\n", fibonacciCalculator.isPerfectSquare(40));
//        fibonacciCalculator.setNumber(16);
//        System.out.printf("Is %d ", fibonacciCalculator.number);
//        System.out.printf("a perfect square? %b\n", fibonacciCalculator.isPerfectSquare(16));
//
//
//        //Test 2: set a number and check to see if it's a fibonacci number
//        System.out.println("\nTest 2:");
//        fibonacciCalculator.setNumber(7);
//        System.out.printf("Is %d ", fibonacciCalculator.number);
//        System.out.printf("a fibonacci number? %b\n", fibonacciCalculator.isFibonacciNumber(7));
//        fibonacciCalculator.setNumber(8);
//        System.out.printf("Is %d ", fibonacciCalculator.number);
//        System.out.printf("a fibonacci number? %b\n", fibonacciCalculator.isFibonacciNumber(8));
//
//
//        //Test 3: set a number and print all fibonacci numbers up to entered value
//        System.out.println("\nTest 3:");
//        int n = 14;
//        for(int i = 0; i <= n; i++){
//            System.out.printf("%d\n", fibonacciCalculator.getFibonacciNumber(i));}
//
//
//        //Test 4: set a number to specify a place in the fibonacci sequence and print its value
//        System.out.println("\nTest 4:");
//        fibonacciCalculator.setN(14);
//        System.out.printf("%d\n", fibonacciCalculator.getFibonacciNumber(14));
    }
}
