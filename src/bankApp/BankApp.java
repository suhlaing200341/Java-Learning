package bankApp;
public class BankApp {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(500);
        bankAccount.display();
        bankAccount.withdrawal(200);
        bankAccount.display();
    }
}