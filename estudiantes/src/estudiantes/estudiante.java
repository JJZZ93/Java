package estudiantes;

public class estudiante {
	
	private String matricula;
	private String nombres;
	private String materia;
	private int nota_paciales;
	private int nota_final;
	public String buscar;
	public int opcion;
	
	
	public String getBuscar() {
		return buscar;
	}
	public void setBuscar(String buscar) {
		this.buscar = buscar;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	public int getNota_paciales() {
		return nota_paciales;
	}
	public void setNota_paciales(int nota_paciales) {
		this.nota_paciales = nota_paciales;
	}
	public int getNota_final() {
		return nota_final;
	}
	public void setNota_final(int nota_final) {
		this.nota_final = nota_final;
	}
	
	private void mostrar()
	{
	   System.out.println("matricula-> "+this.matricula+" |nombres-> "+this.nombres+" |materia-> "+this.materia+" |nota parciales-> "+this.nota_paciales+" |nota final-> "+this.nota_final);	
	}
	
    private void aprobados(int not_parciales,int not_final)
    {
    	if((not_parciales+not_final)>=30)
    	{
    		mostrar();
    	}
    }

    private void buscar(String matricula)
    {
    	if(matricula==this.matricula)
    	{
    	  mostrar();
    
    	}
    }
    
    public int getOpcion() {
		return opcion;
	}
	public void setOpcion(int opcion) {
		this.opcion = opcion;
	}
    
    public void menu(int num)
    {
    	switch(num)
    	{
    	case 1:
    		System.out.println("ESTUDIANTES APROBADOS");
    		aprobados(this.nota_paciales,this.nota_final);
    		break;
    	case 2:
    		buscar(this.buscar);
    		break;
    		default:
    			System.out.println("numero fuera de rango");
    	}
    }
	
}
