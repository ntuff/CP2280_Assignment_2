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
    public int number;
    public int n;
//
//    public void setNumber(int number) {
//        this.number = number;
//    }
//
//    public int getNumber(int number) {
//        return number;
//    }
//
//    public void setN(int n) {
//        this.n = n;
//    }
//
//    public int getN(int n) {
//        return n;
//    }


    /**
     * Check to see if an integer is a perfect square
     * @param number integer to check
     * @return true if n is a perfect square
     */
    private static boolean isPerfectSquare(int number)
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
    public static boolean isFibonacciNumber(int number){
        return isPerfectSquare(5 * number * number + 4) ||
                isPerfectSquare(5 * number * number - 4);
    }

    /**
     * Returns the nth fibonacci number
     * @param n
     * @return
     */
    public static int getFibonacciNumber(int n){
        if(n == 0){
            return 0;
        }
        else if(n == 1){
            return 1;
        }
        else{
            return getFibonacciNumber(n-2) + getFibonacciNumber(n-1);
        }
    }
}
