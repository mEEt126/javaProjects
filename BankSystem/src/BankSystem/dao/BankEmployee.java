package BankSystem.dao;

public class BankEmployee {
    
    public String empName;
    public String empCode; 
    public Double empContact; 
    
    public BankEmployee(String empName, String empCode, Double empContact){
           this.empName = empName; 
           this.empCode = empCode; 
           this.empContact = empContact;  
    }

    public void DisplayDetails(){
        System.out.println("Details of the BankEmployee is as Following");
        System.out.print("Employee Name:" + this.empName + "  ");
        System.out.print("Employee Code:" + this.empCode +  "  ");
        System.out.print("Contact Number:" + this.empContact);
    }
}
