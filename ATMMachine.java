public class ATMMachine {

    private BankAccount bankAccount;

    public ATMMachine(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= bankAccount.getBalance()) {
            bankAccount.setBalance(bankAccount.getBalance() - amount);
            System.out.println("Withdrawal successful. Current balance: " + bankAccount.getBalance());
        } else {
            System.out.println("Insufficient balance. Withdrawal failed.");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            bankAccount.setBalance(bankAccount.getBalance() + amount);
            System.out.println("Deposit successful. Current balance: " + bankAccount.getBalance());
        } else {
            System.out.println("Invalid deposit amount. Deposit failed.");
        }
    }

    public void checkBalance() {
        System.out.println("Current balance: " + bankAccount.getBalance());
    }
}
