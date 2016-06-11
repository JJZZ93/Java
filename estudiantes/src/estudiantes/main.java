package estudiantes;

import javax.swing.JOptionPane;


public class main {

	public static void main(String[] args) {
		estudiante est=new estudiante();
		estudiante est2=new estudiante();
		est.setMatricula("10107");
        est.setNombres("jose zamora");
        est.setMateria("matematicas");
        est.setNota_paciales(Integer.parseInt(JOptionPane.showInputDialog("Ingrese nota de los parciaes: ")));
        est.setNota_final(Integer.parseInt(JOptionPane.showInputDialog("ingrese nota del examen final: ")));
       
    	est2.setMatricula("12345");
        est2.setNombres("andres zambrano");
        est2.setMateria("estructura de datos");
        est2.setNota_paciales(Integer.parseInt(JOptionPane.showInputDialog("Ingrese nota de los parciaes: ")));
        est2.setNota_final(Integer.parseInt(JOptionPane.showInputDialog("ingrese nota del examen final: ")));
        
        System.out.println("    MENU ");
        System.out.println("1.mostrar aprobados ");
        System.out.println("2.buscar por matricula ");
        System.out.println("3.salir");
        est.setOpcion(Integer.parseInt(JOptionPane.showInputDialog("Ingrese opcion: ")));
        est.menu(est.getOpcion());
        est2.menu(est2.getOpcion());
        est=null;

	}

}
