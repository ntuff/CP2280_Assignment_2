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

            System.out.printf("\nEcho: %c", c);

            if(c=='A'){
//                System.out.printf("\nIn Option %c\n", c);
                System.out.println("Enter number: ");
//
//                int depositAmount = input.nextInt();
//                account.credit(depositAmount);
//
//                printAccountInfo(account);

            } else  if(c=='B'){
//                System.out.printf("\nIn Option %c\n", c);
                System.out.println("Enter number: ");
//
//                int withdrawalAmount = input.nextInt();
//                account.debit(withdrawalAmount);
//
//                printAccountInfo(account);

            } else if (c=='C'){
//                System.out.printf("\nIn Option %c", c);
                //number = System.out.println("Enter number: ");
                //System.out.printf(FibonacciCalculator.isFibonacciNumber(number));
//                printAccountInfo(account);

            } else if (c=='D'){
//                System.out.printf("\nIn Option %c", c);
                System.out.println("Enter number: ");
//
//                printAccountInfo(account);
            }

        }while(c!='Q');

        System.out.println("\nGOODBYE!");
    }

    public static void printMenu(){
        System.out.println("\n\nPlease select an option:");
        System.out.println("(A) Deposit funds");
        System.out.println("(B) Withdraw funds");
        System.out.println("(C) Reset balance");
        System.out.println("(D) todo");
        System.out.println("(Q) Quit");
    }

    public static void printIsFibonachiNumberResult(FibonacciCalculator number){
        //System.out.printf(FibonacciCalculator.isFibonacciNumber(number));
        //System.out.printf("Account name: %s\nBalance: $%.2f", account.getName(), account.getBalance());
    }
}
