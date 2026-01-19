import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserAccount account = new UserAccount(10000);
        int pin = 1234;

        System.out.print("Enter PIN: ");
        int enteredPin = sc.nextInt();

        if (enteredPin != pin) {
            System.out.println("Incorrect PIN. Access denied.");
            return;
        }

        while (true) {
            System.out.println("\n--- ATM MENU ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Balance: ₹" + account.getBalance());
                    break;
                case 2:
                    System.out.print("Enter amount: ");
                    account.deposit(sc.nextDouble());
                    break;
                case 3:
                    System.out.print("Enter amount: ");
                    account.withdraw(sc.nextDouble());
                    break;
                case 4:
                    System.out.println("Thank you!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
