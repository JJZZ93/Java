package mayus_minus;

import javax.swing.JOptionPane;
public class mayus {

	private String cadena;
	public mayus(){}
	
	public String getCad(){
		return this.cadena;
	}
	
	
	public void setCad(String cadena){
		this.cadena = cadena;
	}
	
	public String mayusculas(){
		String cadNueva;
		String n1;
		String n2;
		if(this.cadena.length()<3)
		{
		  cadNueva = this.cadena.toUpperCase();
		}
		else
		{
		    n1=this.cadena.substring(0, this.cadena.length()-3);
		    n2=this.cadena.toUpperCase().substring(this.cadena.length()-3);
		    cadNueva=n1+n2;
		}
		return cadNueva;
	}

}
