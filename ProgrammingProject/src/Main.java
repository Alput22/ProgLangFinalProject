import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank account1 = new Bank("133700", "noob@yahoo.com" , "Newbie", 100000);
        Bank account2 = new Bank("42069", "cracc@gmail.com", "Cracker", 2500000);
        Bank account = new Bank();
        System.out.println("Enter username: ");
        Scanner pin = new Scanner(System.in);
        String match = pin.nextLine();
        if (match.equals(account1.getUsername())){
            account = account1;
        } else if (match.equals(account2.getUsername())) {
            account = account2;

        }

        account.EnterPIN();

        //the following is just a random code I tried
        /*String ID;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your PIN: ");
        ID = input.nextLine();
        if (ID.equals(account.getPIN())) {
            System.out.println("Welcome, " + account.getName());
            int choice;
            String choose;
            while (true) {
                System.out.println("Choose what you want to do: ");
                System.out.println("1. Deposit Money");
                System.out.println("2. Withdraw Money");
                System.out.println("3. Check Balance");
                choice = input.nextInt();
                if (choice == 1) {
                    account.deposit();

                }
                else if (choice == 2) {
                    account.withdraw();

                }
                else if (choice == 3) {
                    account.getBalance();
                    System.out.println("You have a balance of Rp." + account.getBalance());

                }
                System.out.println("Would you like to do another transaction? Y/N");
                Scanner input2 = new Scanner(System.in);
                choose = input2.nextLine();
                if (choose.equals("Y")) {
                    continue;
                }
                else if (choose.equals("N")) {
                    System.out.println("Thank you for your transactions.");
                    break;
                }
            }
        } else if (!(ID.equals(account.getPIN()))){
            System.out.println("Wrong PIN.");

        }*/

    }
}
