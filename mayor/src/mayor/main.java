package mayor;

import javax.swing.JOptionPane;


public class main {

	public static void main(String[] args)
	{
		int a;
		int b;
		int c;
		
		a=Integer.parseInt(JOptionPane.showInputDialog("Ingrese primer numero: "));
		b=Integer.parseInt(JOptionPane.showInputDialog("Ingrese segundo numero: "));
		c=Integer.parseInt(JOptionPane.showInputDialog("Ingrese tercer numero: "));
		mayor cal= new mayor(a,b,c);
		
		cal.hallar_mayor();
	}
}
