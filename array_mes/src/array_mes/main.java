package array_mes;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args)
	{  	
	    array mat= new array();
	   do
	   {
		mat.setnum(Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero")));
       }while((mat.getnum()<1)||(mat.getnum()>12));
	   mat.mostrar(mat.getnum());
	   mat=null;
	}
}