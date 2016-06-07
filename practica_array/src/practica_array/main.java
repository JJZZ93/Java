package practica_array;

public class main {
	public static void main(String[] args)
	{
		
	int aux[]={3,6,9,3,5,7,1,10};
	arrays vec= new arrays(aux);
	vec.ordenar(aux);
	vec.mayor(aux);
	vec.menor(aux);
	vec.mostrar(aux);
	vec.promedio(aux);
	}
}
