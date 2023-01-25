import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*class DrawSqu extends JFrame {

    int x; 

    DrawSqu(double side){ 
        this.setSize(600,600);
        this.setVisible(true);   
        x = (int)side; 
    }
    public void paint(Graphics g, int x) {
        g.drawRect(100, 100, x, x); // square 
    }
}

class DrawRec extends JFrame {

    int x,y;
    //Graphics g = new Graphics(); 

    DrawRec(double height,double width){
        this.setSize(600,600);
        this.setVisible(true);
        x = (int)height;
        y = (int)width; 
        //paint(g, x, y); 
    }

    public void paint(Graphics g, int x, int y) {
        g.drawRect(100, 200, 100,85); // square 
    }
}

class DrawCir extends JFrame {

    int x;

    DrawCir(double radius){  
        this.setSize(600,600);
        this.setVisible(true);
        x = (int)radius;
    }
    public void paint(Graphics g, int x) {
        g.drawOval(100, 100, x, x); // square 
    }
}*/

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
        JFrame fr = new JFrame(); 
        fr.setBounds(10,10,500,500);
        fr.setDefaultCloseOperation(3);
        x = (int)this.height;                                       
        y = (int)this.width;
        JPanel pn = new JPanel()
        {
            public void paint(Graphics g){
                g.drawRect(100, 100, x, y);
            }
        };
        fr.add(pn);
        fr.setVisible(true);
    }

    public void displayDetails()
    {
        System.out.println("This is Rectangle with following Specifications");
        System.out.println("Calculated Area is:" + calArea());
        System.out.println("Calculated Perimeter is:" + calPerimeter());
        System.out.println("Color is:" + this.color);
        System.out.println("Type is:" + this.type);
        System.out.println();
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
        JFrame fr = new JFrame(); 
        fr.setBounds(10,10,500,500);
        fr.setDefaultCloseOperation(3);
        int x = (int)this.side;                                       
    
        JPanel pn = new JPanel()
        {
            public void paint(Graphics g){
                g.drawRect(100, 100, x, x);
            }
        };
        fr.add(pn);
        fr.setVisible(true);
    }

    public void displayDetails()
    {
        System.out.println("This is Square with following Specifications");
        System.out.println("Calculated Area is:" + calArea());
        System.out.println("Calculated Perimeter is:" + calPerimeter());
        System.out.println("Color is:" + this.color);
        System.out.println("Type is:" + this.type);
        System.out.println();
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
        JFrame fr = new JFrame(); 
        fr.setBounds(10,10,500,500);
        fr.setDefaultCloseOperation(3);
        int x = (int)this.radius;                                       
        
        JPanel pn = new JPanel()
        {
            public void paint(Graphics g){
                g.drawOval(100, 100, x, x);
            }
        };
        fr.add(pn);
        fr.setVisible(true);
    }

    public void displayDetails()
    {
        System.out.println("This is Circle with following Specifications");
        System.out.println("Calculated Area is:" + calArea());
        System.out.println("Calculated Perimeter is:" + calPerimeter());
        System.out.println("Color is:" + this.color);
        System.out.println("Type is:" + this.type);
        System.out.println();
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

    public void drawShape ()
    {
        JFrame fr = new JFrame(); 
        fr.setBounds(10,10,500,500);
        fr.setDefaultCloseOperation(3);
        int x = (int)this.height;                                       
        int y = (int)this.base;
        JPanel pn = new JPanel()
        {
            public void paint(Graphics g){
                g.drawLine(100, 100, x, y);
            }
        };
        fr.add(pn);
        fr.setVisible(true);
    }

    public void displayDetails()
    {
        System.out.println("This is Triangle with following Specifications");
        System.out.println("Calculated Area is:" + calArea());
        System.out.println("Calculated Perimeter is:" + calPerimeter());
        System.out.println("Color is:" + this.color);
        System.out.println("Type is:" + this.type);
        System.out.println();
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
        ob2.drawShape();
        ob3.drawShape();
        ob4.drawShape(); 

        System.out.println("Execution Ends Here!");
    }
}
