package array_mes;

public class array {
	int num;

	String aux[]={"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
	
	public array()
	{
		
	}
	
	public int getnum()
	{
		return num;
	}
	
	public void setnum(int num)
	{
		this.num=num;
	}

	
	public void mostrar(int num)
	{
	  System.out.print("el mes requerido es: "+this.aux[num-1]);	
	}
	
	
}
