public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0);
        ATMMachine atmMachine = new ATMMachine(account);

        atmMachine.checkBalance();
        atmMachine.withdraw(500.0);
        atmMachine.deposit(200.0);
        atmMachine.checkBalance();
        atmMachine.withdraw(1000.0);
    }
}
