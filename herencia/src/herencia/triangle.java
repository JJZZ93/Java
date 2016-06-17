package herencia;

public class triangle extends TwoDShape {
	String style;
	
	double area()
	{
	   return width*height/2;
	}

	void ShowStyle()
	{
		System.out.println("el estilo es-> "+style);
	}
}
