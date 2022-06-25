import java.util.Scanner;

public class Bank {
    private String PIN;
    private String username;
    private String name;
    private int balance;
    Scanner num = new Scanner(System.in);

    //getter and setter
    public String getPIN() {
        return PIN;
    }

    public void setPIN(String PIN) {
        this.PIN = PIN;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Bank() {
        balance = 0;
    }
    public Bank(String Pin, String user, String fname, int bal){
        PIN = Pin;
        username = user;
        name = fname;
        balance = bal;
    }

    public int getBalance() {
        return balance;
    }
    //deposit the amount of money
    public void deposit(){
        int amount;
        System.out.println("Enter the number you wish to deposit: ");
        amount = num.nextInt();
        balance += amount;
    }
    //withdraw the amount of money
    public void withdraw(){
        int amount;
        System.out.println("Enter the number you wish to withdraw: ");
        amount = num.nextInt();
        if (balance <= amount){
            System.out.println("Balance is too low to withdraw.");
            System.out.println("Your balance is " + balance);
        }
        else {
            balance -= amount;
        }
    }
    //enter PIN so the bank recognize the owner of account
    public void EnterPIN(){
        String ID;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your PIN: ");
        ID = input.nextLine();
        if (ID.equals(getPIN())){
            System.out.println("Welcome, " + getName());
            int choice;
            String choose;
            while (true) {
                System.out.println("Choose what you want to do: ");
                System.out.println("1. Deposit Money");
                System.out.println("2. Withdraw Money");
                System.out.println("3. Check Balance");
                choice = input.nextInt();
                if (choice == 1) {
                    deposit();

                }
                else if (choice == 2) {
                    withdraw();

                }
                else if (choice == 3) {
                    getBalance();
                    System.out.println("You have a balance of Rp." + getBalance());

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
        } else if (!(ID.equals(getPIN()))){
            System.out.println("Wrong PIN.");

        }
        }
    }


