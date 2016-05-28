package calculo;

import javax.swing.JOptionPane;

public class main {

     public static void main(String[] args)
     {
    	 float num1;
    	 float num2;
    	 num1=Float.parseFloat(JOptionPane.showInputDialog("Ingrese primer numero"));
    	 num2=Float.parseFloat(JOptionPane.showInputDialog("Ingrese segundo numero"));
    	 calculo cal=new calculo(num1,num2);   
    	 cal.suma();
    	 cal.resta();
    	 cal.multiplicacion();
    	 cal.division();
    	 cal.raiz(num1);
    	 cal.seno(num1);
    	 cal.coseno(num1);
     }
}
