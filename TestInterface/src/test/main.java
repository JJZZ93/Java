package test;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		estudiante estu=new estudiante();
		estu.setAnioNacimiento(Integer.parseInt(JOptionPane.showInputDialog("Ingrese año de nacimiento: ")));
		estu.setNombres(JOptionPane.showInputDialog("Ingrese nombre: "));
		System.out.println("la edad de "+estu.getNombres()+" es: "+estu.calcular_edad(estu.getAnioNacimiento(), 2016));
	}

}
