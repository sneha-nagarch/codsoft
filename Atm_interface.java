import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(double withdrawamount) {
        if (withdrawamount > 0 && withdrawamount <= balance) {
            balance -= withdrawamount;
            System.out.println("withdraw of $" + withdrawamount + " successfully");
        } else {
            System.out.println("Invalid withdraw amount OR Insufficient Balance!");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit of $" + amount + " Successfully");
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public double GetBalance() {
        return balance;
    }

}

class Atm_interface {
    private BankAccount account;

    public Atm_interface(BankAccount account) {
        this.account = account;
    }

    public void display() {
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Amount");
        System.out.println("3. Withdraw Amount");
        System.out.println("4. Exit");

    }

    public void start() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            display();
            System.out.println("Enter your Choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your account Balance is " + account.GetBalance());
                    break;
                case 2:
                    System.out.println("Enter the Amount to Deposit");
                    double amount = sc.nextDouble();
                    account.deposit(amount);
                    break;
                case 3:
                    System.out.println("Enter ammount to withdraw");
                    double withdrawamount = sc.nextDouble();
                    account.withdraw(withdrawamount);
                    break;
                case 4:
                    System.out.println("Thank you for Using ATM");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice, Please select a valid option");

            }

        }
    }

    public static void main(String[] args) {
        BankAccount obj = new BankAccount(0);
        Atm_interface obj1 = new Atm_interface(obj);
        obj1.start();
    }
}
