public class Rectangle implements IShape
{
    int length, width;
    String color;

    Rectangle(String color, int length, int width) 										// Cunstructor 
	{
        this.color = color;
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() 														// Calculating Area
	{
        return this.length * this.width;
    }

    @Override
    public double calculatePerimeter() 													// Calculating Perimeter 
	{
        return 2 * (this.length + this.width);
    }

}
