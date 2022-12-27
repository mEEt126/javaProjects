package BankSystem.ui;

import java.util.Scanner;

import BankSystem.pojo.CurrentAccount;
import BankSystem.pojo.SavingAccount;

public class Main {
    public static void main(String[] args) throws Exception {

        CurrentAccount ac01 = new CurrentAccount(); 
        SavingAccount ac02 = new SavingAccount(); 

        ac01.setAccNum(0265123);
        ac01.setBalance(1000);
        System.out.println(ac01.getBalance());   // Just for check

        ac02.setAccNum(0265321);
        ac02.setBalance(500);
        System.out.println(ac02.getAccNum());   // just for check

        int choice; 
        Scanner sc = new Scanner(System.in); 
        System.out.println("Hello, Customers Welcome to BankPortal!");
        System.out.println("Please Enter your Choice as per following");
        System.out.println("1. For Bank Employee");
        System.out.println("2. For Customer");
        System.out.println("0. Exit, Have a Nice Day.!");
        choice = sc.nextInt(); 
        System.out.println("");

        while(choice!=0)
        {
            switch(choice)
            {
                case 0: 
                        System.out.println("Have a Nice Day,Good Bye!");
                case 1: 

                case 2:

                default: 
                    System.out.println("Please Enter valid Choice");
            }
        }    
    }
}
