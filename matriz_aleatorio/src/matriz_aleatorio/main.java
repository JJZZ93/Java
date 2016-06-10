package matriz_aleatorio;

import javax.swing.JOptionPane;


public class main {

	public static void main(String[] args)
	{  	
	    matriz_a mat= new matriz_a();
	   
		mat.set_fila(Integer.parseInt(JOptionPane.showInputDialog("Ingrese fila: ")));
		mat.set_columna(Integer.parseInt(JOptionPane.showInputDialog("Ingrese columna: ")));
	    mat.set_digito(Integer.parseInt(JOptionPane.showInputDialog("Ingrese digito a buscar: ")));   
		
	   mat.llenar_matriz(mat.get_fila(),mat.get_columna());
	   mat.mostrar_matriz(mat.get_fila(), mat.get_columna());
	   System.out.println("Los valores que terminan en: "+mat.get_digito()+" son: ");
	   mat.buscar_digito(mat.get_fila(), mat.get_columna(), mat.get_digito());
	   mat=null;
	}
}
