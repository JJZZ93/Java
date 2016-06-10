package cont_vocales;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		vocales voc=new vocales();
		voc.setCadena(JOptionPane.showInputDialog("Ingrese palabra: "));
        voc.mostrar();
        voc=null;
	}

}
