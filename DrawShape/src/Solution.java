import java.awt.Graphics;
import javax.swing.JFrame;

class DrawSqu extends JFrame {

    int x; 

    DrawSqu(double side){    
        setSize(600,600);
        setVisible(true);
        x = (int)side; 
    }
    public void paint(Graphics g, int x) {
        g.drawRect(100, 100, x, x); // square 
    }
}

class DrawRec extends JFrame {

    int x,y;

    DrawRec(double height,double width){
        setSize(600,600);
        setVisible(true);
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
        setSize(600,600);
        setVisible(true);
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
    public String type; 
    
    abstract double calArea(); 
    abstract double calPerimeter(); 
    abstract void drawShape(String color); 

}

class Rectangle extends Shape{

    public double height; 
    public double width; 

    Rectangle(double height, double width)
    {
        this.height = height; 
        this.width = width;  
    }
    
    public double calArea()
    {
        return height*width; 
    }

    public double calPerimeter()
    {
        return 2 * (height + width);
    }

    public void drawShape (String color)
    {
        DrawRec f = new DrawRec(height,width);
    }

    public void displayDetails()
    {
        System.out.println("This is Rectangle with following Specifications");
        System.out.println("Calculated Area is:" + calArea());
        System.out.println("Calculated Perimeter is:" + calPerimeter());
        System.out.println("Color is:" + color);
        System.out.println("Type is:" + type);
    }
}

class Square extends Shape{

    public double side; 

    Square(double side)
    {
        this.side = side;  
    }

    public double calArea()
    {
        return side*side; 
    }

    public double calPerimeter()
    {
        return 4*side;
    }

    public void drawShape (String color)
    {
        DrawSqu f = new DrawSqu(side);
    }

    public void displayDetails()
    {
        System.out.println("This is Square with following Specifications");
        System.out.println("Calculated Area is:" + calArea());
        System.out.println("Calculated Perimeter is:" + calPerimeter());
        System.out.println("Color is:" + color);
        System.out.println("Type is:" + type);
    }

}

class Circle extends Shape{

    public double radius; 
    
    Circle(double radius)
    {
        this.radius = radius; 
    }
    public double calArea()
    {
        return 3.14*radius*radius; 
    }

    public double calPerimeter()
    {
        return 2*3.14*radius;
    }

    public void drawShape (String color)
    {
        DrawCir f = new DrawCir(radius);
    }

    public void displayDetails()
    {
        System.out.println("This is Circle with following Specifications");
        System.out.println("Calculated Area is:" + calArea());
        System.out.println("Calculated Perimeter is:" + calPerimeter());
        System.out.println("Color is:" + color);
        System.out.println("Type is:" + type);
    }
}


public class Solution{
    public static void main(String[] args) throws Exception {

        Rectangle ob1 = new Rectangle(25, 15);
        Square ob2 = new Square(20);
        Circle ob3 = new Circle(20); 

        ob1.displayDetails();
        ob2.displayDetails();
        ob3.displayDetails(); 
    }
}
