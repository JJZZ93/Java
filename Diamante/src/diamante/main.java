package diamante;
import javax.swing.JOptionPane;
public class main {

	public static void main(String[] args) {
		
		diamante figura = new diamante();
		figura.set_tamanio(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamano")));
		System.out.print("Tu tamano es: ");
		System.out.println(figura.get_tamanio());
		figura.dibujar(figura.get_tamanio());

	}

}
