package matriz_aleatorio;

import java.util.Random;

public class matriz_a {
	
	Random rnd=new Random();

	int fila,columna,digito;
	int aux[][]=new int[10][10];
	
	public matriz_a()
	{
	}
	
	public int get_fila()
	{
		return fila;
	}
	
	public void set_fila(int fila)
	{
		this.fila=fila;
	}

	
	public int get_columna()
	{
		return columna;
	}
	
	public void set_columna(int columna)
	{
		this.columna=columna;
	}
	
	public int get_digito()
	{
		return digito;
	}
	
	public void set_digito(int digito)
	{
		this.digito=digito;
	}
	
	public void llenar_matriz(int fila,int columna)
	{
	  for(int i=0;i<fila;i++)
	  {
		  for(int j=0;j<columna;j++)
		  {
			  this.aux[i][j]=(int)(rnd.nextDouble()*100+1);
		  }
	  }
	}
	
	public void mostrar_matriz(int fila,int columna)
	{
	  for(int i=0;i<fila;i++)
	  {
		  for(int j=0;j<columna;j++)
		  {
			  System.out.print(this.aux[i][j]+" ");
		  }
		  System.out.println();
	  }
	}
	
	public void buscar_digito(int fila,int columna,int digito)
	{
		
		for(int i=0;i<fila;i++)
		  {
			  for(int j=0;j<columna;j++)
			  {
				  if(this.aux[i][j]>10)
				  {
					  if(this.aux[i][j]%10==digito)
					  {
						  System.out.println(this.aux[i][j]);
					  }
				  }
				  else
					  if(this.aux[i][j]==digito)
					  {
						  System.out.println(this.aux[i][j]);
					  }
			  }
		  }
	}
	{
		
	}
}
