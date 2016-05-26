package eliminar_caracter;

import javax.swing.JOptionPane;
public class main {
	
	public static void main(String[] args) {
		eliminar_caracter cadena = new eliminar_caracter();
		do{
			cadena.setCad(JOptionPane.showInputDialog("Ingrese una palabra:"));
		}while(cadena.getCad().equals(""));
		do{
			cadena.setNum(Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entre 0 y "+ (cadena.getCad().length()-1) +":")));
		}while(cadena.getNum() > cadena.getCad().length()-1 || cadena.getNum() < 0);
		
		JOptionPane.showMessageDialog(null, "Palabra Ingresada:\n        " + cadena.getCad()
		+ "\nNueva Palabra:\n        " + cadena.deleteChar(cadena.getCad(), cadena.getNum()));
	}

}
