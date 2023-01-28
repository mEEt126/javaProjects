public class Main 
{

    public static void main(String[] args) 
    {
    
		Rectangle rectangle = new Rectangle("Red",6,7);                                             // Rectangle Start 

		System.out.println("Perimeter of rectangle is : " + rectangle.calculatePerimeter());        // Rectangle Perimeter
		System.out.println("Area of rectangle is : " + rectangle.calculateArea());                  // Rectangle Area 
		rectangle.renderer.draw();                                                                  // renderer 
		rectangle.renderer.draw("This is a rectangle");                                             // Message 

		System.out.println();                                                                       // End of Rectangle 



		Square square = new Square("Blue",8);                                                       // Square Start 

		System.out.println("Area of square is : " + square.calculateArea());                        // Square Area 
		rectangle.renderer.draw();                                                                  // renderer 
		rectangle.renderer.draw("This is a square");                                                // Message 
		
		System.out.println();                                                                       // End of Square



		Circle circle = new Circle("Green",3);                                                      // Circle Srart

		System.out.println("Perimeter of circle is : " + circle.calculatePerimeter());				// Circle Perimeter		 
		System.out.println("Area of circle is : " + circle.calculateArea());						// Circle Area 
		rectangle.renderer.draw();																	// renderer
		rectangle.renderer.draw("This is a circle");												// Message

		System.out.println();																		// End of Circle 


		
		Triangle triangle = new Triangle("Yellow",4,5);												// Triangle Start

		System.out.println("Perimeter of triangle is : " + triangle.calculatePerimeter());			// Triangle Perimeter 
		System.out.println("Area of triangle is : " + triangle.calculateArea());					// Trianlge Area 
		rectangle.renderer.draw();																	// renderer
		rectangle.renderer.draw("This is a triangle");												// Message

		System.out.println();																		// End of Triangle

    }
}
