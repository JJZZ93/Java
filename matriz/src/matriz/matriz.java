package matriz;

public class matriz {

	public matriz(int aux[][])
	{
		
	}
	
	
	public void ordenar_asc(int aux[][])      //ordena descendente
	{
		for( int i=0; i < 4; i++){
            for( int j=0;j< 4; j++){
                for(int x=0; x < 4; x++){
                    for(int y=0; y <4; y++){
                        if(aux[i][j] < aux[x][y]){
                            int t = aux[i][j];
                            aux[i][j] = aux[x][y];
                            aux[x][y] = t;
                        }
                    }
                }
             }
         }

     }

	

	public void ordenar_desc(int aux[][])   //ordena ascendente
	{
		for( int i=0; i < 4; i++){
            for( int j=0;j< 4; j++){
                for(int x=0; x < 4; x++){
                    for(int y=0; y <4; y++){
                        if(aux[i][j] > aux[x][y]){
                            int t = aux[i][j];
                            aux[i][j] = aux[x][y];
                            aux[x][y] = t;
                        }
                    }
                }
             }
         }

     }
		

	
	public void mayor(int aux[][])
	{
		System.out.println("el mayor es: "+aux[3][3]);
	}
	
	
	public void menor(int aux[][])
	{
		System.out.println("el menor es:"+aux[0][0]);
	}
	
	public void mostrar(int aux[][])
	{
		
			for(int i=0;i<4;i++)
		    {	
			   for(int j=0;j<4;j++)
			   {
				   System.out.print(aux[i][j]+" ");
			   }
			   System.out.println();
		    }
		
	}
	
	public void promedio(int aux[][])
	{
		int suma=0;
		float prom;
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
			   suma=suma+aux[i][j];
			}
		}
		prom=suma/16;
		System.out.println("el promedio es: "+prom);
	}
	
}






