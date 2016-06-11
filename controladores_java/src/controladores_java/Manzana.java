package controladores_java;

public class Manzana {
	
	private String codigo;
	private int tamanio;
	public String color;
	
	public Manzana(){

	}
	
	public Manzana(String codigo){
		this.codigo = codigo;
	}
	
	public Manzana(int tamanio){
		this.tamanio = tamanio;
	}

	public Manzana(String codigo, int tamanio){
		this.codigo = codigo;
		this.tamanio = tamanio;
	}
	
	public Manzana(String codigo, int tamanio, String color){
		this.codigo = codigo;
		this.tamanio = tamanio;
		this.color = color;
	}
	
		
	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getTamanio() {
		return tamanio;
	}
	
	public void setTamanio(int tamanio) {
		this.tamanio = tamanio;
	}
	
	public void show_inf(){
		System.out.println("Codigo->"+this.codigo+" | Color->"+this.color+" | Tama�o->"+int_to_string(this.tamanio));    
	}
	
	private String int_to_string(int tam){
		switch(tam)
		{
		case 1:
			return "Peque�o";
		case 2:
			return "Mediano";
		case 3:
			return "Grande";
		default:
			return "Tama�o desconocido";
		}
	}

}
