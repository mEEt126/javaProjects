class SavingAccount{
    private int accno; 

    void setAccno(int x){
        this.accno = x;
    }

    int getAccno(){
        return this.accno; 
    }
}

public class Demo {
    public static void main(String[] args) throws Exception {
        SavingAccount ob = new SavingAccount(); 
        ob.setAccno(1234);
        System.out.println(ob.getAccno());

        SavingAccount ob1 = new SavingAccount();
        ob1.setAccno(89);
        System.out.println(ob1.getAccno()); 
    }
}