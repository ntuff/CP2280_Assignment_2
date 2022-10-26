import java.util.Scanner;

public class FibonacciCalculatorApplication {
    public static void main(String[] args) {

        System.out.println("Fibonacci Calculator Application");

        Scanner input = new Scanner(System.in);
        char c; //Char to drive menu choice

        do{

            printMenu();
            //Grab the user input
            c = Character.toUpperCase(input.next().charAt(0));
            //System.out.printf("\nEcho: %c", c);

            if(c=='A'){
                System.out.println("Enter number: ");
                int n = input.nextInt();
                for(int i = 0; i <= n; i++){
                    System.out.println(FibonacciCalculator.getFibonacciNumber(i));}




            } else  if(c=='B'){
                System.out.println("Enter number: ");


            } else if (c=='C'){
                System.out.println("Enter number: ");
                int number = input.nextInt();
                System.out.println(FibonacciCalculator.isFibonacciNumber(number));
            }

        }while(c!='Q');

        System.out.println("\nGOODBYE!");
    }

    public static void printMenu(){
        System.out.println("\n\nPlease select an option:");
        System.out.println("(A) Display all fibonacci numbers less than 'n'");
        System.out.println("(B) Print 'n' fibonacci numbers");
        System.out.println("(C) Determine if a number is a fibonacci number");
        //System.out.println("(D) todo");
        System.out.println("(Q) Quit");
    }
}
