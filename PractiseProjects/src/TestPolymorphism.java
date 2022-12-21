class Parents{

    void intro()
    {
        System.out.println("I'm a Parent");
    }
}

class Child extends Parents{
    void intro()
    {
        System.out.println("I'm a child");
    }
}

public class TestPolymorphism{

    public static void main(String args[]){
        Child ob = new Child(); 
        Parents ob1 = new Parents();
        ob.intro();        
        ob1.intro();
    }
}