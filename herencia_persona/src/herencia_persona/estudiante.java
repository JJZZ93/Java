package herencia_persona;

public class estudiante extends persona {
	private String matricula;
    private String carrera;
	
	public estudiante(String cedula,String matricula)
	{
       this.setCedula(cedula);
       this.matricula=matricula;
	}
	
	public estudiante(String cedula,String nombres,String apellidos,String matricula)
	{
		this.setCedula(cedula);
		this.setNombres(nombres);
		this.setApellidos(apellidos);
		this.matricula=matricula;
	}
	
	public estudiante(String nombres,String apellidos,String carrera)
	{
		this.setNombres(nombres);
		this.setApellidos(apellidos);
		this.carrera=carrera;
	}
	
    public estudiante(String cedula,String nombres,String apellidos,String ciudad,String matricula,String carrera)
    {
    	this.setCedula(cedula);
    	this.setNombres(nombres);
		this.setApellidos(apellidos);
		this.setCiudad(ciudad);
		this.matricula=matricula;
		this.carrera=carrera;
    }
    
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
    
    public void mostrar()
    {
    	System.out.println("cedula-> "+this.getCedula()+"\nnombres-> "+this.getNombres()+"\napellidos-> "+this.getApellidos()+"\nciudad-> "+this.getCiudad()+"\nmatricula-> "+this.matricula+"\ncarrera-> "+this.carrera+"\n\n");
    }
    
    public void buscar()
    {
    	if(this.getCiudad().equals("esmeraldas"))
    	{
    		mostrar();
    	}
    }
}
