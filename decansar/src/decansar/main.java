package decansar;

public class main {
	
	public static void main(String[] args) {
		int vacacion=0, dia_sem=0;
		descansar descanso;
		descanso = new descansar(vacacion,dia_sem);
		System.out.print(descanso.condicion(vacacion,dia_sem));
	}

}
