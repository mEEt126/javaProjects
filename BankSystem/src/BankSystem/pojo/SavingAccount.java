package BankSystem.pojo;

public class SavingAccount extends Account{

    public float rateOfInterest;

    public SavingAccount()
    {
        super();
    }

    public float getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(float rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    public double calInterest(){
           return (getBalance()*this.rateOfInterest*1) / 100;     /// Calculated Simple Rate of Interest PRN/100, Year == 1 
    }
    
    void withdraw(double amount){
        setBalance(getBalance() - amount);
    }

    void deposit(double amount){
        setBalance(getBalance() + amount); 
    }
}
