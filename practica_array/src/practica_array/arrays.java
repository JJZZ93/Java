package practica_array;

public class arrays {
	
    
	public arrays(int aux[])
	{
		
	}
	
	
	public void ordenar(int aux[])
	{
		int aux2;
		for(int j=0;j<8;j++)
	    {	
		for(int i=1;i<8;i++)
		{
			if(aux[j]<aux[i])
			{
				aux2=aux[i];
				aux[i]=aux[j];
			    aux[j]=aux2;
			}
		}
	    }
		
	}
	
	public void mayor(int aux[])
	{
		System.out.println("el mayor es: "+aux[7]);
	}
	
	
	public void menor(int aux[])
	{
		System.out.println("el menor es:"+aux[0]);
	}
	
	public void mostrar(int aux[])
	{
		for(int i=0;i<8;i++)
		{
			System.out.println(aux[i]);
		}
	}
	
	public void promedio(int aux[])
	{
		int suma=0;
		float prom;
		for(int i=0;i<8;i++)
		{
			suma=suma+aux[i];
			
		}
		prom=suma/8;
		System.out.println("el promedio es: "+prom);
	}
	
}
