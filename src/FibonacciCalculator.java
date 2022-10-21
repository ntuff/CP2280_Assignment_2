/**
 * A class that allows someone to validate and generate fibonacci numbers.              <p>
 * The Fibonacci numbers, commonly denoted Fn, form a sequence, called the
 * Fibonacci sequence, such that each number is the sum of the two preceding
 * ones, starting from 0 and 1. That is:                                                <p>
 * F_0 = 0 and F_1 = 1                                                                  <p>
 *  And                                                                                 <p>
 * F_N = F_N-1 + F_N-2                                                                  <p>
 * The beginning of the sequence is thus: 0, 1, 1, 2, 3, 5, 8, 13, ..                   <p>
 * </pre>
 * @author 20148596
 */

public class FibonacciCalculator {
    //    public||private static final int F_0 = 0;
    //    public||private static final int F_1 = 1;
    public int number;

//    public fibonacciCalculator(int number){
//        this.number = number;
//    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber(int number){
        return number;
    }


    /**
     * Check to see if an integer is a perfect square
     * @param number integer to check
     * @return true if n is a perfect square
     */
    public boolean isPerfectSquare(int number)
    {
        int square = (int) Math.sqrt(number);
        return (square*square == number);
    }

    /**
     * Check to see if an integer passed in is a Fibonacci number
     * Note: //TODO
     * @param number integer to check
     * @return true if n is a Fibonacci number
     */
    public boolean isFibonacciNumber(int number){
        return isPerfectSquare(5 * number * number + 4) ||
                isPerfectSquare(5 * number * number - 4);
    }

    /**
     * Get the nth number in the Fibonacci sequence
     * @param n the position in the Fibonacci sequence
     * @return value of the nth Fibonacci number
     */
    public int getFibonacciNumber(int n){
        if (n <= 1){
            return n;}

        int a = 0, b = 1, c = 1;
        int counter = 1;

        while (c < n){
            c = a + b;
            counter++;
            a = b;
            b = c;
        }
        return counter;
    }
}
