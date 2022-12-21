import java.awt.Graphics;
import javax.swing.JFrame;

class DrawSqu extends JFrame {

    int x; 

    DrawSqu(double side){    
        x = (int)side; 
    }
    public void paint(Graphics g, int x) {
        g.drawRect(100, 100, x, x); // square 
    }
}

class DrawRec extends JFrame {

    int x,y;

    DrawRec(double height,double width){
        this.setSize(600,600);
        this.setVisible(true);
        x = (int)height;
        y = (int)width; 
    }
    public void paint(Graphics g, int x, int y) {
        g.drawRect(100, 200, x, y); // square 
    }
}

class DrawCir extends JFrame {

    int x;

    DrawCir(double radius){  
        x = (int)radius;
    }
    public void paint(Graphics g, int x) {
        g.drawOval(100, 100, x, x); // square 
    }
}

abstract class Shape{

    public double area;
    public String color;
    public double perimeter; 
    public String type = "2D"; 
    
    abstract double calArea(); 
    abstract double calPerimeter(); 
    abstract void drawShape(); 

}

class Rectangle extends Shape{

    public double height; 
    public double width; 
    int x,y;

    Rectangle(double height, double width, String color)
    {
        this.height = height; 
        this.width = width;  
        this.color = color; 
    }
    
    public double calArea()
    {
        return this.height*this.width; 
    }

    public double calPerimeter()
    {
        return 2 * (this.height + this.width);
    }

    public void drawShape ()
    {
        DrawRec f = new DrawRec(this.height,this.width);
        /*f.setSize(600,600);
        f.setVisible(true);
        x = (int)this.height;
        y = (int)this.width;*/ 
    }

    public void paint(Graphics g, int x, int y) {
        g.drawRect(100, 100, x, y); // square 
    }

    public void displayDetails()
    {
        System.out.println("This is Rectangle with following Specifications");
        System.out.println("Calculated Area is:" + calArea());
        System.out.println("Calculated Perimeter is:" + calPerimeter());
        System.out.println("Color is:" + this.color);
        System.out.println("Type is:" + this.type);
    }
}

class Square extends Shape{

    public double side; 

    Square(double side, String color)
    {
        this.side = side;  
        this.color = color;
    }

    public double calArea()
    {
        return this.side*this.side; 
    }

    public double calPerimeter()
    {
        return 4*this.side;
    }

    public void drawShape ()
    {
        DrawSqu f = new DrawSqu(this.side);
        f.setSize(600,600);
        f.setVisible(true);
    }

    public void displayDetails()
    {
        System.out.println("This is Square with following Specifications");
        System.out.println("Calculated Area is:" + calArea());
        System.out.println("Calculated Perimeter is:" + calPerimeter());
        System.out.println("Color is:" + this.color);
        System.out.println("Type is:" + this.type);
    }

}

class Circle extends Shape{

    public double radius; 
    
    Circle(double radius, String color)
    {
        this.radius = radius; 
        this.color = color;
    }
    public double calArea()
    {
        return 3.14*this.radius*this.radius; 
    }

    public double calPerimeter()
    {
        return 2*3.14*this.radius;
    }

    public void drawShape ()
    {
        DrawCir f = new DrawCir(this.radius);
        f.setSize(600,600);
        f.setVisible(true);
    }

    public void displayDetails()
    {
        System.out.println("This is Circle with following Specifications");
        System.out.println("Calculated Area is:" + calArea());
        System.out.println("Calculated Perimeter is:" + calPerimeter());
        System.out.println("Color is:" + this.color);
        System.out.println("Type is:" + this.type);
    }
}

class Triangle extends Shape{

    public double height;
    public double base; 
    
    Triangle(double height, double base, String color)
    {
        this.height = height;
        this.base = base;  
        this.color = color; 
    }
    public double calArea()
    {
        return 0.5*this.height*this.base; 
    }

    public double calPerimeter()
    {
        return ((this.height+this.base)+Math.sqrt(this.height*height+this.base*base));
    }

    public void drawShape (){}
    /*{
        DrawCir f = new DrawCir(radius);
        f.setSize(600,600);
        f.setVisible(true);
    }*/

    public void displayDetails()
    {
        System.out.println("This is Triangle with following Specifications");
        System.out.println("Calculated Area is:" + calArea());
        System.out.println("Calculated Perimeter is:" + calPerimeter());
        System.out.println("Color is:" + this.color);
        System.out.println("Type is:" + this.type);
    }
}


public class Solution{
    public static void main(String[] args) throws Exception {

        Rectangle ob1 = new Rectangle(25, 15, "blue");
        Square ob2 = new Square(20, "red");
        Circle ob3 = new Circle(20, "green"); 
        Triangle ob4 = new Triangle(10,15, "yellow");

        ob1.displayDetails();
        ob2.displayDetails();
        ob3.displayDetails(); 
        ob4.displayDetails();
        ob1.drawShape();
        //ob2.drawShape();

        System.out.println("Hello");
    }
}
