package bankApp;
public class BankAccount {
    private int balance = 1000;

    public void deposit(int amount){
        this.balance += amount;
        System.out.println("deposit: " + amount);
    }
    public void withdrawal(int amount){
        if(this.balance > amount){
            this.balance = this.balance - amount;
            System.out.println("withdrawal: " + amount);
        }else {
            System.out.println("Balance amount is not enough to withdrawal");
        }

    }
    public void display(){
        System.out.println("Balance: " + this.balance);
    }
}