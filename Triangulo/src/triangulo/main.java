package triangulo;
import javax.swing.JOptionPane;
public class main {

	public static void main(String[] args) {
		
		triangulo figura = new triangulo();
		figura.set_tamano(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamano")));
		System.out.print("Tu tamano es: ");
		System.out.println(figura.get_tamano());
		figura.dibujar(figura.get_tamano());

	}

}