package test;

public class estudiante implements persona {

	int anio_nacimiento;
	String nombres;
	@Override
	public int calcular_edad(int anio_nacimiento,int anio_actual) {
		// TODO Auto-generated method stub
		return anio_actual-anio_nacimiento;
	}

	@Override
	public void setAnioNacimiento(int anio) {
		// TODO Auto-generated method stub
		this.anio_nacimiento=anio;
		
	}

	@Override
	public int getAnioNacimiento() {
		// TODO Auto-generated method stub
		return this.anio_nacimiento;
	}

	@Override
	public void setNombres(String nombres) {
		// TODO Auto-generated method stub
		this.nombres=nombres;
	}

	@Override
	public String getNombres() {
		// TODO Auto-generated method stub
		return this.nombres;
	}

	
}
