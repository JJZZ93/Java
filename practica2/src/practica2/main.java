package practica2;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		vTest ob=new vTest();
		ob.view_args("jose","maria","juan","pedro");
		ob.ingresar("jose","maria","juan","pedro");
		ob.ordenar_ascendente();
		System.out.println("ORDENADOS ASCENDENTE");
		ob.mostrar();
		ob.ordenar_descendente();
		System.out.println("ORDENADOS DESCENDENTE");
		ob.mostrar();
	}

}
