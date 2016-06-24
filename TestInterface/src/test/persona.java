package test;

public interface persona {
	int calcular_edad(int anio_nacimiento,int anio_actual);
	void setAnioNacimiento(int anio);
	int getAnioNacimiento();
	void setNombres(String nombres);
    String getNombres();
}
