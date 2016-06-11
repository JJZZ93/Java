package proyecto_estudiante;

public class estudiantes {
	
	private String matricula;
	private String nombres;
	private String materia;
	private double nota_parciales;
	private double nota_final;
	
	public estudiantes(String matricula,String nombres,String materia,float nota_parciales,float nota_final)
	{
		this.matricula=matricula;
		this.nombres=nombres;
		this.materia=materia;
		this.nota_parciales=nota_parciales;
		this.nota_final=nota_final;
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

	public double getNota_parciales() {
		return nota_parciales;
	}

	public void setNota_parciales(double nota_parciales) {
		this.nota_parciales = nota_parciales;
	}

	public double getNota_final() {
		return nota_final;
	}

	public void setNota_final(double nota_final) {
		this.nota_final = nota_final;
	}
	
	public void mostrar()
	{
		System.out.println("matricula-> "+this.matricula+" |nombres-> "+this.nombres+" |materia-> "+this.materia+" |nota parciales-> "+this.nota_parciales+" |nota final-> "+this.nota_final);
	}
	
	public void aprobados(double not_parciales,double not_final)
    {
    	if((not_parciales+not_final)>=30)
    	{
    		mostrar();
    	}
    	
    }

	 public void buscar(String matricula)
	    {
	    	if(matricula.equals(this.matricula))
	    	{
	    	  mostrar();
	    
	    	}
	    }
	    
}
