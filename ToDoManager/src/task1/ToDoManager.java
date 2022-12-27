package task1;

public class ToDoManager {
    public static void main(String[] args) throws Exception {

        String task1 = "abc";
        String task2 = "xyz";
        String task3 = "abc";
        String temp; 

        System.out.println("task1 is:" + task1);  // without sorting 
        System.out.println("task2 is:" + task2);
        System.out.println("task3 is:" + task3);

        if((task1.compareTo(task2)>0))
        {
            temp = task1;
            task1 = task2; 
            task2 = temp; 
        } 

        if((task1.compareTo(task3)>0))
        {
            temp = task1;
            task1 = task3; 
            task3 = temp; 
        }

        if((task2.compareTo(task3)>0))
        {
            temp = task2;
            task2 = task3; 
            task3 = temp; 
        }

        System.out.println("task1 is:" + task1);  // with sorting 
        System.out.println("task2 is:" + task2);
        System.out.println("task3 is:" + task3);

        if(task1.compareTo(task2)==0 || task1.compareTo(task3)==0)
        {
            System.out.println("task1 is duplicate");
        }

        if(task2.compareTo(task3)==0)
        {
            System.out.println("task2 is duplicate");
        }
    }
}
