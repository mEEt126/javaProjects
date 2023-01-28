import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;

public class DrawShapeAdv {

    public static void main(String[] args) throws Exception 
    {
        RectangleMod ob1 = new RectangleMod(25, 15, "blue");
        SquareMod ob2 = new SquareMod(20, "red"); 

        ob1.drawShape(25.0, 15.0);
        ob2.drawShape();
    }
}

// Interface IShape

interface IShape{
 
    final String type = "2D";
    
    double calArea(); 
    double calPerimeter(); 
    void drawShape(); 
}

class RectangleMod implements IShape{

    public double height; 
    public double width; 
    public double area;
    public String color;
    public double perimeter;

    RectangleMod()
    {

    }

    RectangleMod(double height, double width, String color)
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

    public void drawShape()
    {
        System.out.println("Please enter values for height and width");
        System.out.println("Complie time polymorphism");
    }

    public void drawShape(double height, double width)
    {
        JFrame fr = new JFrame(); 
        fr.setBounds(10,10,500,500);
        fr.setDefaultCloseOperation(3);
        JPanel pn = new JPanel()
        {
            public void paint(Graphics g){
                g.drawRect(100, 100, (int)width, (int)height);
            };
        };
        fr.add(pn);
        fr.setVisible(true);
    }
}

class SquareMod extends RectangleMod{
 
    SquareMod()
    {
        super();
    }

    SquareMod(double side, String color)
    {
        super(side,side,color);
    }

    @Override 
    public double calArea()
    {
        return super.width*super.height; 
    }

    public double calPerimeter()
    {
        return 2*super.height + 2*super.width;
        //return 4*super.height; 
    }

    public void drawShape ()
    {
        JFrame fr = new JFrame(); 
        fr.setBounds(10,10,500,500);
        fr.setDefaultCloseOperation(3);                                       
    
        JPanel pn = new JPanel()
        {
            public void paint(Graphics g){
                g.drawRect(100, 100, (int)height, (int)height);
            };
        };
        fr.add(pn);
        fr.setVisible(true);
    }
} 