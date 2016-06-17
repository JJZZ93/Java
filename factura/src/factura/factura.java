package factura;

public class factura {
	
	public factura()
	{
		
	}

	private String nombre;
	private float precio;
	private int n_productos;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public int getN_productos() {
		return n_productos;
	}
	public void setN_productos(int n_productos) {
		this.n_productos = n_productos;
	}
	
	
	public float calcular_subtotal(float precio,int n_productos)
	{
		float sub;
		sub=precio*n_productos;
		return sub;
	}
	
	public float calcular_iva(int porcen,float subtotal)
	{
		float iva;
		iva=(subtotal*porcen)/100;
		return iva;
	}
	
	protected void finalize()
	{
		System.gc();
	}
}
