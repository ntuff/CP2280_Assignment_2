import java.util.Scanner;

public class PrimeNumberCalculatorApplication {
    public static void main(String[] args) {

        System.out.println("Prime Number Calculator Application");
        Scanner input = new Scanner(System.in);
        char c; //Char to drive menu choice

        do{
            printMenu();
            //Get user input
            c = Character.toUpperCase(input.next().charAt(0));

            if(c=='A'){
                System.out.println("Enter number: ");
                int n = input.nextInt();
                for(int i = 0; i <= n; i++){
                    if (PrimeNumberCalculator.isPrime(i)) {
                        System.out.println(i);

                    }
                }
            } else  if(c=='B'){
                System.out.println("Enter starting number: ");
                int startNumber = input.nextInt();
                System.out.println("Enter ending number: ");
                int endNumber = input.nextInt();
                for(int i = startNumber; i <= endNumber; i++){
                    if (PrimeNumberCalculator.isPrime(i)) {
                        System.out.println(i);

                    }
                }
            } else if (c=='C'){
                System.out.println("Enter number: ");
                int n = input.nextInt();
                System.out.println(PrimeNumberCalculator.getUniquePrimeFactorization(n));

            } else if (c=='D'){
                System.out.println("Enter number: ");
                int n = input.nextInt();
                for(int i = 0; i <= n; i++){
                    System.out.printf("\nPrime Factorization is: %d %s",i, PrimeNumberCalculator.isPrime(i) ? "PRIME" : PrimeNumberCalculator.getUniquePrimeFactorization(i));

                }
            }
        } while(c!='Q');
        System.out.println("\nGOODBYE!");
    }

    public static void printMenu(){
        System.out.println("\n\nPlease select an option:");
        System.out.println("(A) Display all prime numbers less than 'n'");
        System.out.println("(B) Display all prime numbers between two 'n's");
        System.out.println("(C) Display the unique factorization of a number");
        System.out.println("(D) Display the unique factorization of all numbers less than 'n'");
        System.out.println("(Q) Quit");
    }
}

