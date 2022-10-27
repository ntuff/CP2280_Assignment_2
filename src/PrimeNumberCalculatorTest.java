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

        //Test 2: Check to see if unique prime factorization for a given number is correct
        System.out.println("Test 2:");
        System.out.println(PrimeNumberCalculator.getUniquePrimeFactorization(42));
        System.out.println(PrimeNumberCalculator.getUniquePrimeFactorization(125));
        System.out.println(PrimeNumberCalculator.getUniquePrimeFactorization(3));
        System.out.println(PrimeNumberCalculator.getUniquePrimeFactorization(0));
        System.out.println(PrimeNumberCalculator.getUniquePrimeFactorization(4));
        System.out.println(PrimeNumberCalculator.getUniquePrimeFactorization(25));
        System.out.println(PrimeNumberCalculator.getUniquePrimeFactorization(266));
        System.out.println(PrimeNumberCalculator.getUniquePrimeFactorization(-4));
        System.out.println(PrimeNumberCalculator.getUniquePrimeFactorization(7));
    }
}
