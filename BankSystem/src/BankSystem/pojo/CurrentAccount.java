package BankSystem.pojo;

public class CurrentAccount extends Account {

    public float transFee; 

    public void setTransFee(float transFee) {
        this.transFee = transFee;
    }

    public float getTransFee() {
        return transFee;
    }

    public CurrentAccount()
    {
        super(); 
    }

    void withdraw(double amount){
        setBalance(getBalance() - amount);
    }

    void deposit(double amount){
        setBalance(getBalance() + amount); 
    }

    void applyTransFee(){
         setBalance(getBalance() - this.transFee);   
    }

}
