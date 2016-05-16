package calculadora;

import javax.swing.JOptionPane;

public class main {

     public static void main(String[] args)
     {
    	 float num1;
    	 float num2;
    	 num1=Float.parseFloat(JOptionPane.showInputDialog("Ingrese primer numero"));
    	 num2=Float.parseFloat(JOptionPane.showInputDialog("Ingrese segundo numero"));
    	 calculadora cal=new calculadora(num1,num2);   
    	 cal.suma();
    	 cal.resta();
    	 cal.multiplicacion();
    	 cal.division();
     }
}
