package decansar;

import javax.swing.JOptionPane;

public class descansar {
	int vacacion,dia_sem;
    
    public descansar(int vacacion, int dia_sem){
    	this.vacacion = vacacion;
    	this.dia_sem = dia_sem;	
    }
    
    public int get_vacacion()
	{
		return this.vacacion;
	}
    
	public void set_vacacion(int vacacion){
		this.vacacion = vacacion;
	}
	
	public int get_dia_semana()
	{
		return this.dia_sem;
	}
	
	public void set_dia_semana(int dia_sem){
		this.dia_sem = dia_sem;
	}
	
	public boolean condicion(int vacacion, int dia_sem){
		int respuesta,respuesta2;
		respuesta=JOptionPane.showConfirmDialog(null,"¿Estas en dia de semana?");
		respuesta2=JOptionPane.showConfirmDialog(null,"¿Estas en vacaciones?");
		if(respuesta!= 0 && respuesta2!=1){
	System.out.println("Puedes descansar");
		return true;}
		else{
	System.out.println("No,Puedes descansar");
		return false;}
				
	}
	
}


