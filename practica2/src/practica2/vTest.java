package practica2;

public class vTest {
	
	String v[];
	public vTest()
	{
		
	}

	public void view_args(String ...a)
	{
		System.out.println("numero de argumentos: "+a.length);
	}
	
	public void ingresar(String ...a)
	{
		this.v=a;
		
	}
	
    public void ordenar_ascendente()
    {
    	for(int i=0;i<v.length;i++)
    	{
    		for(int j=0;j<v.length;j++)
    		{
    			if(v[i].compareTo(v[j])<0)
    			{
    				String aux=v[i];
    				v[i]=v[j];
    				v[j]=aux;
    			}
    		}
    	}
    		
    }
    
    
    public void ordenar_descendente()
    {
    	String aux;
    	for(int i=0;i<v.length;i++)
    	{
    		for(int j=0;j<v.length;j++)
    		{
    			if(v[i].compareTo(v[j])>0)
    			{
    				aux=v[i];
    				v[i]=v[j];
    				v[j]=aux;
    			}
    		}
    	}
    		
    }
    public void mostrar()
    {
    	 for(int i=0;i<this.v.length;i++)
    	 {
    		 System.out.println(this.v[i]);
    	 }
    }
}

