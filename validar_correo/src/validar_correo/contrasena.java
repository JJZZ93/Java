package validar_correo;

public interface contrasena {

	int getLongitud_Contrasena();
	void setLongitud_Contrasena(int contrasena);
	String getContrasena();
	void setContrasena(String contrasena);
	String generar_contrasena();
	boolean validar();
	boolean validar_correo();
	String fuerte_debil(boolean a);
	String getEmail();
	void setEmail(String email);
	
}
