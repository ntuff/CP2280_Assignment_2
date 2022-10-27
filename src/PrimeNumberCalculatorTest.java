public class PrimeNumberCalculatorTest {
    //TODO: Create tester for PrimeNumberCalculator
    public static void main(String[] args) {
        System.out.println("Prime Number Calculator Test");

        //Test 1: Check to see if a given number is prime
        System.out.println("Test 1:");
        System.out.println(PrimeNumberCalculator.isPrime(7));
        System.out.println(PrimeNumberCalculator.isPrime(8));
        System.out.println(PrimeNumberCalculator.isPrime(79));
        System.out.println(PrimeNumberCalculator.isPrime(82));
        System.out.println(PrimeNumberCalculator.isPrime(0));
        System.out.println(PrimeNumberCalculator.isPrime(-4));
        System.out.println("");
        System.out.println("LCD for 25 test");
        System.out.println(PrimeNumberCalculator.getLowestCommonDenominator(25));


        //Test 2: Check to see if unique prime factorization for a given number is correct
        System.out.println("Test 2:");
        System.out.println(PrimeNumberCalculator.getUniquePrimeFactorization(42));
        System.out.println(PrimeNumberCalculator.getUniquePrimeFactorization(125));
        System.out.println(PrimeNumberCalculator.getUniquePrimeFactorization(3));
        System.out.println(PrimeNumberCalculator.getUniquePrimeFactorization(0));
        System.out.println(PrimeNumberCalculator.getUniquePrimeFactorization(4));
        System.out.println(PrimeNumberCalculator.getUniquePrimeFactorization(25));


        //Test 2: Prints n Fibonacci numbers (ie. Print the first 25 Fibonacci numbers)
//        System.out.println("Test 2:");
//        int n = 14;
//        for(int i = 0; i < n; i++){
//            System.out.println(FibonacciCalculator.getFibonacciNumber(i));}

        //Test 3: set a number to specify a place in the fibonacci sequence and print its value
//        System.out.println("");
//        System.out.println("Test 3:");
//        System.out.println(FibonacciCalculator.getFibonacciNumber(4));
//        System.out.println(FibonacciCalculator.getFibonacciNumber(7));
//        System.out.println(FibonacciCalculator.getFibonacciNumber(14));
//        System.out.println("");

        //Test 4:  displays all the Fibonacci numbers less than a value input by the user
//        System.out.println("Test 4:");
//        int n2 = 14;
//        for(int i = 0; FibonacciCalculator.getFibonacciNumber(i) <= n2; i++){
//            System.out.println(FibonacciCalculator.getFibonacciNumber(i));}
    }
}
