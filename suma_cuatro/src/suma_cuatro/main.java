package suma_cuatro;

import javax.swing.JOptionPane;

public class main {
	
	public static void main(String[] args)
	{
		String a;
		String b;
		String c;
		String d;
		suma cal= new suma();
		cal.setA(JOptionPane.showInputDialog("Ingrese primer numero: "));
   	    cal.setB(JOptionPane.showInputDialog("Ingrese segundo numero: "));
   	    cal.setC(JOptionPane.showInputDialog("Ingrese tercer numero: "));
	    cal.setD(JOptionPane.showInputDialog("Ingrese cuarto numero: "));
		
		cal.sumar(cal.getA(),cal.getB(),cal.getC(),cal.getD());
	}

}