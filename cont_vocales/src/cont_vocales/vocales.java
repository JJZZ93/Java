package cont_vocales;

public class vocales {

	private String cadena;
	private int num_vocales;
	
	public String getCadena() {
		return cadena;
	}
	
	public void setCadena(String cadena) {
		this.cadena = cadena;
	}
	
	public void mostrar()
	{
		contar(this.cadena);
		System.out.println("existen "+Integer.toString(this.num_vocales)+" vocales");
	}
	
	private void contar(String cadena)
	{
		int a;
		a=cadena.length();
		for(int i=0;i<a;i++)
		{
			if((cadena.charAt(i)=='a')||(cadena.charAt(i)=='e')||(cadena.charAt(i)=='i')||(cadena.charAt(i)=='o')||(cadena.charAt(i)=='u'))
			{
				this.num_vocales=this.num_vocales+1;
			}
		}

	}
}
