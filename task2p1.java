import java.util.Scanner;

public class task2p1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String customerName;
        int accountNumber;
        long depositCents;
        double interestRate;

        System.out.println("===== BANK DEPOSIT SYSTEM =====");

        System.out.print("Enter customer name: ");
        customerName = input.nextLine();

        System.out.print("Enter account number: ");
        accountNumber = input.nextInt();

        System.out.print("Enter deposit amount in cents: ");
        depositCents = input.nextLong();

        System.out.print("Enter annual interest rate (%): ");
        interestRate = input.nextDouble();

        double depositAmount = depositCents / 100.0;
        double accountNumberValue = accountNumber;

        double interest = depositAmount * (interestRate / 100);


        double totalBalance = depositAmount + interest;
        int roundedInterest = (int) interest;
        double originalValue = 1250.75;
        int convertedValue = (int) originalValue;

        System.out.println("\n========== SUMMARY REPORT ==========");
        System.out.println("Customer Name   : " + customerName);
        System.out.println("Account Number  : " + accountNumber);
        System.out.printf("Deposit Amount  : %.2f%n", depositAmount);
        System.out.printf("Interest Rate   : %.2f%%%n", interestRate);
        System.out.printf("Interest Earned : %.2f%n", interest);
        System.out.printf("Total Balance   : %.2f%n", totalBalance);

        System.out.println("\n----- Type Conversion Demonstration -----");

        System.out.println("Original deposit in cents (long): " + depositCents);
        System.out.println("Converted deposit to double     : " + depositAmount);

        System.out.println("Interest as double              : " + interest);
        System.out.println("Interest converted to int       : " + roundedInterest);

        System.out.println("\nAccuracy Demonstration:");
        System.out.println("Original value (double)         : " + originalValue);
        System.out.println("After converting to int         : " + convertedValue);
        System.out.println("Lost decimal value              : "
                + (originalValue - convertedValue));

        input.close();
    }
}