package proyecto_estudiante;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int opcion;
        String buscar;
		estudiantes[] items=new estudiantes[5];	
		items[0]=new estudiantes("001","jose zamora","calculo",15,15);
		items[1]=new estudiantes("002","piero palacios","estadistica",18,8);
		items[2]=new estudiantes("003","denis cabezas","ecuaciones",19,12);
		items[3]=new estudiantes("004","andres recalde","estructura",14,11);
		items[4]=new estudiantes("005","carlos reyna","ingles",16,15);
		
		do
		{
			
		do
		{
			opcion=Integer.parseInt(JOptionPane.showInputDialog("MENU\n"+"1.lista de estudiantes\n"+"2.buscar estudiante por matricula\n"+"3.mostrar aprobados\n"+"4.salir\n"+"ingrese opcion: "));	
		}while((opcion<0)|(opcion>4));
	
	    switch(opcion)
	    {
	    case 1: 
	    	System.out.println("************************************************************************");
	    	for(int i=0;i<5;i++)
	    	{
	    		items[i].mostrar();
	    	}
	    	System.out.println("************************************************************************");
	    	break;
	    
	    case 2:
	    	buscar=JOptionPane.showInputDialog("ingrese matricula a buscar: ");
	    	System.out.println("************************************************************************");
	    	for(int i=0;i<5;i++)
	    	{
	    	   items[i].buscar(buscar);
	    	}
	    	System.out.println("************************************************************************");
	        break;
	    case 3:
	    	System.out.println("************************************************************************");
	    	for(int i=0;i<5;i++)
	    	{
	    		items[i].aprobados(items[i].getNota_parciales(), items[i].getNota_final());
	    	}
	    	System.out.println("************************************************************************");
	    	break;
	    case 4:
	    	System.out.println("fin del programa");
	    	break;
	    default:
	    	System.out.println("opcion no valida");
	    }
		}while(opcion!=4);
	}

}
