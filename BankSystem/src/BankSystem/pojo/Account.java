package BankSystem.pojo;

public abstract class Account {

    private long accNum;
    private double balance;
    
    public void setAccNum(long accNum) {
        this.accNum = accNum;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public long getAccNum() {
        return accNum;
    }
    public double getBalance() {
        return balance;
    } 

    abstract void deposit(double x);
    abstract void withdraw(double amount); 
    public static void viewBal(){

    } 
}
