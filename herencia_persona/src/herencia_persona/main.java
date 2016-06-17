package herencia_persona;

public class main {

	public static void main(String[] args) {
		
       estudiante est=new estudiante("0803233287","10107");
       estudiante est2=new estudiante("0855776341","andres","zambrano","23456");
       estudiante est3=new estudiante("joan","vera","enfermeria");
       estudiante est4=new estudiante("0965784532","melisa","gruezo","esmeraldas","56666","comercio exterior");
       
       est.setNombres("jose");
       est.setApellidos("zamora");
       est.setCiudad("quito");
       est.setCarrera("sistemas");
       
       est2.setCiudad("esmeraldas");
       est2.setCarrera("diseño grafico");
       
       est3.setCedula("0967453212");
       est3.setCiudad("guayaquil");
       est3.setMatricula("45673");
       
       System.out.println("ESTUDIANTE 1");
       est.mostrar();
       System.out.println("ESTUDIANTE 2");
       est2.mostrar();
       System.out.println("ESTUDIANTE 3");
       est3.mostrar();
       System.out.println("ESTUDIANTE 4");
       est4.mostrar();
       
       
       System.out.println("ESTUDIANTES QUE VIVEN EN ESMERALDAS\n");
       est.buscar();
       est2.buscar();
       est3.buscar();
       est4.buscar();
	}

}
