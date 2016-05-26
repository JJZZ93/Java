package eliminar_caracter;

public class eliminar_caracter {
	
	private int num;
	private String cadena;
	public eliminar_caracter(){}
	
	public int getNum(){
		return this.num;
	}
	
	public String getCad(){
		return this.cadena;
	}
	
	public void setNum(int num){
		this.num = num;
	}
	
	public void setCad(String cadena){
		this.cadena = cadena;
	}
	
	public String deleteChar(String cad, int indice){
		String cadNueva = cad.substring(0,indice);
		cadNueva += cad.substring(indice+1);
		return cadNueva;
	}

}
