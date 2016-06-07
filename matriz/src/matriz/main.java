package matriz;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args)
	{
		
	int aux[][]={{3,6,9,3},{5,7,1,2},{4,5,7,2},{9,3,1,2}};
	matriz mat= new matriz(aux);
	mat.ordenar_desc(aux);
	System.out.println("ORDENADO DESCENDENTE");
	mat.mostrar(aux);
	System.out.println();
	mat.ordenar_asc(aux);
	System.out.println("ORDENADO ASCENDENTE");
	mat.mostrar(aux);
	System.out.println();
	mat.mayor(aux);
	mat.menor(aux);
	
	mat.promedio(aux);
	mat=null;
	}
}
