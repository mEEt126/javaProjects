public class Circle implements IShape
{
	int radius; 
	String colour; 
	final double PI = 3.14; 

	public Circle ( String colour, int radius)							// Constructor 
	{
		this.colour = colour;
		this.radius = radius;
	}

	@Override
	public double calculatePerimeter()									// Calculating Perimeter of Circle
	{
		return 2 * PI * this.radius;
	}

	@Override
	public double calculateArea()										// Calculating Area of Circle
	{
		return PI * this.radius * this.radiius; 
	}

}