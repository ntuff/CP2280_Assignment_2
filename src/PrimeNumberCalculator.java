/**
 * A class that allows someone to determine if an integer is a prime number.            <p>
 * A natural number (positive Integer) is prime if it’s divisible by only 1 and itself.
 * For example:                                                                         <p>
 * 2, 3, 5 and 7 are prime                                                              <p>
 * but:                                                                                 <p>
 * 4, 6, 8 and 9 are not.                                                               <p>
 * The number 1, by definition, is not prime.                                           <p>
 * </pre>
 * @author 20148596
 */

public class PrimeNumberCalculator {
    /**
     * Check to see if a number is prime
     * @param number integer to check
     * @return true if number is prime
     */
    public static boolean isPrime(int number){
        if (number <= 1){
            return false;

        } else{
            return number == getLowestCommonDenominator(number);
        }
    }

    /**
     * returns the number's lowest common denominator or number
     * @param number integer to check
     * @return lowest common denominator or prime number
     */
    private static int getLowestCommonDenominator(int number){
        // remove number == 0
        if(number == 0) {
            return 0;
        }
        if(number % 2 == 0) {
            return 2;
        }
        for (int i = 3; i <= Math.sqrt(number); i+=2){
            if (number % i == 0){
                return i;
            }
        }

        return number;
    }

    /**
     *  returns the unique prime factorization of a number
     * @param number integer to get unique prime factorization from
     * @return string of the numbers prime factors
     */
    public static String getUniquePrimeFactorization(int number){
        int i = getLowestCommonDenominator(number);
        if (i == number){
            return String.valueOf(i);
        }

        number = number / i;
        return i + " * " + getUniquePrimeFactorization(number);
    }

}