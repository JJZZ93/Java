package mayus_minus;

import javax.swing.JOptionPane;
public class main {

	public static void main(String[] args) {
		
	
		mayus cadena = new mayus();
		
		
		do{
			cadena.setCad(JOptionPane.showInputDialog("Ingrese una palabra:"));
		}while(cadena.getCad().equals(""));
		
		JOptionPane.showMessageDialog(null, "palabra ingresada:\n        " + cadena.getCad()
		+ "\nNueva Palabra:\n        " + cadena.mayusculas());
		cadena=null;
		System.gc();
	}
	}
	
