import java.util.Scanner;

public class ATM {
  private static Scanner scanner = new Scanner(System.in);
  private static float balance = 1000.0f;

  public static void main(String[] args) {
    boolean quit = false;
    int choice;
    while (!quit) {
      System.out.println("Welcome to the ATM");
      System.out.println("1. Check balance");
      System.out.println("2. Withdraw");
      System.out.println("3. Deposit");
      System.out.println("4. Quit");
      System.out.print("Enter your choice: ");
      choice = scanner.nextInt();
      switch (choice) {
        case 1:
          checkBalance();
          break;
        case 2:
          withdraw();
          break;
        case 3:
          deposit();
          break;
        case 4:
          quit = true;
          break;
        default:
          System.out.println("Invalid choice. Try again.");
      }
    }
  }

  private static void checkBalance() {
    System.out.println("Your balance is: $" + balance);
  }

  private static void withdraw() {
    System.out.print("Enter amount to withdraw: $");
    float amount = scanner.nextFloat();
    if (amount > balance) {
      System.out.println("Insufficient balance");
    } else {
      balance -= amount;
      System.out.println("Please collect your cash");
    }
  }

  private static void deposit() {
    System.out.print("Enter amount to deposit: $");
    float amount = scanner.nextFloat();
    balance += amount;
    System.out.println("Your deposit of $" + amount + " was successful");
  }
}
