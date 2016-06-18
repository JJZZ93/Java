package factura;

import javax.swing.JOptionPane;



public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op1;
		int op2;
		float iva,subtotal,total;
		int afec=0;
		int cont=0;
		
		factura[] fac=new factura[5];
		
		do
		{
			System.out.println("¿TE ENCUENTRAS EN UNA DE LAS PROVINCIAS AFECTADAS POR EL TERREMOTO?\n  1.SI\n  2.NO\n");
			op1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese opcion: "));	
		}while((op1<1)||(op1>2));
		
	    switch(op1)
	    {
	    case 1:
	    	afec=12;
	        break;
	    case 2:
	    	afec=14;
	    	break;
	    }
		
	    System.out.println("****** FACTURA ******");
	    do
	    {
	    	
		op2=Integer.parseInt(JOptionPane.showInputDialog("               MENU\n 1.Ingresar nuevo producto\n 2.Mostrar productos\n 3.Calcular Total\n 4.SALIR\n Ingrese opcion: "));
		switch(op2)
		{
		  case 1:
			        fac[cont]=new factura();
			        fac[cont].setNombre(JOptionPane.showInputDialog("Ingrese nombre de producto: "));
				    fac[cont].setPrecio(Float.parseFloat(JOptionPane.showInputDialog("Ingrese precio de producto: ")));
			        fac[cont].setN_productos(Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de productos: ")));
			        cont=cont+1;
			        break;
		  case 2:	        
			            System.out.println("NOMBRE  \tPRECIO   \tCANTIDAD PRODUCTOS");
			        for(int i=0;i<cont;i++)
			        {
			        	System.out.println(fac[i].getNombre()+"\t\t"+fac[i].getPrecio()+"\t\t\t"+fac[i].getN_productos());
			        }
			        break;
		  case 3:
			        subtotal=0;
			        iva=0;
			        total=0;
			        for(int i=0;i<cont;i++)
			        {
			        	subtotal=subtotal+fac[i].calcular_subtotal(fac[i].getPrecio(),fac[i].getN_productos());
			        	iva=iva+fac[i].calcular_iva(afec, fac[i].calcular_subtotal(fac[i].getPrecio(), fac[i].getN_productos())); 
			        }
			        total=total+subtotal+iva;	
			        System.out.println("el subtotal es: "+subtotal);
			        System.out.println("el iva "+afec+"% es: "+iva);
			        System.out.println("TOTAL: "+total);
			       
		}
	    }while(op2!=4);
	    
	    System.out.println("\n***** Fin del programa *****\n");
	    System.gc();
	}

}
