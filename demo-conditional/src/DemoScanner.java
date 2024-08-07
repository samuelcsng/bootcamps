import java.util.Scanner;

public class DemoScanner {
  public static void main(String[] args) {

    // Example 1
    // User input
    Scanner s = new Scanner(System.in);
    System.out.println("Please input a number: ");

    int input = s.nextInt();
    // terminal will stop at "s.nextInt()", and wait for a user input
    // After capturing the user input -> assignment

    if (input % 2 == 0) {
      System.out.println("The user input is an even number");
    } else {
      System.out.println("the user input is an odd number");
    }

    s.close();
    // the user input is an odd number
    // the user input is an even number




    // Example 2
    // "Choose an option: 1) Deposit 2) Withdraw 3) Check Balance"

    // if user input 1
    // Question -> "Please input the deposit amount:"
    // print out the amount after deposit

    // if user input 2
    // Question -> "Please input the withdrawal amount:"
    // print out the amount after withdrawal

    // if user input 3
    // Print out current balance

    double currentBalance = 300.0;

    System.out
        .println("Choose an option: 1) Deposit 2) Withdraw 3) Check Balance");
    Scanner option = new Scanner(System.in);
    int optionInput = option.nextInt();

    if (optionInput == 1) {
      System.out.println("Please input the deposit amount: ");
      optionInput = option.nextInt();
      currentBalance = currentBalance + optionInput;
      System.out.println("Print out current balance: " + currentBalance);
    } else if (optionInput == 2) {
      System.out.println("Please input the withdrawal amount:");
      optionInput = option.nextInt();
      currentBalance = currentBalance - optionInput;
      System.out.println("Print out current balance: " + currentBalance);
    } else if (optionInput == 3) {
      System.out.println("Print out current balance: " + currentBalance);
    }

    option.close();


  }
}
