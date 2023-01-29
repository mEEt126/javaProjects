import javax.swing.JFrame;
import javax.swing.JPanel;
//import javax.swing.Renderer;
//import java.awt.Component;
import java.awt.Graphics;

public class DrawShapeAdv {

    public static void main(String[] args) throws Exception 
    {
        RectangleMod ob1 = new RectangleMod(25, 15, "blue");
        SquareMod ob2 = new SquareMod(20, "red"); 
        CircleMod ob3 = new CircleMod(10, "Blue"); 
        TriangleMod ob4 = new TriangleMod(10, 15, "Green"); 

        ob1.renderer.drawShape(25.0, 15.0, "2D_Rectangle");
        ob2.renderer.drawShape();
        System.out.println(ob3.calPerimeter()); 
        System.out.println(ob4.calArea());
    }
}

// Interface IShape

interface IShape{
    
    public Render renderer = new Render();
    double calArea(); 
    double calPerimeter(); 
    //void drawShape(); 
}

class Render{
    
    public void drawShape()
    {
        System.out.println("This is composition relationship");
        System.out.println("Please enter values for height and width");
        System.out.println("Complie time polymorphism");
    }
        
    public void drawShape(double height, double width, String type) // rec
    {
            if(type == "2D_Rectangle")
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
            else if(type == "2D_Square")
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

            else if(type == "2D_Circle")
            {
                JFrame fr = new JFrame(); 
                fr.setBounds(10,10,500,500);
                fr.setDefaultCloseOperation(3);
                int x = (int)height;                                       
                
                JPanel pn = new JPanel()
                {
                    public void paint(Graphics g){
                        g.drawOval(100, 100, x, x);
                    };
                };
                fr.add(pn);
                fr.setVisible(true);
            }

            else if(type == "2D_Triangle")
            {
                JFrame fr = new JFrame(); 
                fr.setBounds(10,10,500,500);
                fr.setDefaultCloseOperation(3);
                int x = (int)height;                                       
                int y = (int)width; // base
                JPanel pn = new JPanel()
                {
                    public void paint(Graphics g){
                        g.drawLine(100, 100,100+x, 100+y);     // can be made using maths and 2 points(x1,y1) (x2,y2)
                    };
                };
                fr.add(pn);
                fr.setVisible(true);
            }
    }       
}

class RectangleMod implements IShape{

    public double height; 
    public double width; 
    public String color;
    String type = "2D_Rectangle";

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
}

class SquareMod extends RectangleMod{
 
    // for 
    String type = "2D_Square";
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

    @Override
    public double calPerimeter()
    {
        return 2*super.height + 2*super.width;
        //return 4*super.height; 
    }
} 

class CircleMod implements IShape{

    public double radius; 
    public String color; 
    String type = "2D_Circle";
    
    CircleMod(double radius, String color)
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
}

class TriangleMod implements IShape{

    public double height;
    public double base; 
    public String color; 
    String type = "2D_Triangle";
    
    TriangleMod(double height, double base, String color)
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

}