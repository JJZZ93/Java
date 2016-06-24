package jeni;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int opcion,opcion2;
		float iva,subtotal,total;
		int afec=0,cont=0;
		
		factura[] factu=new factura[5];
		
			System.out.println("¿TU CIUDAD RESULTO AFECTADA POR EL TERREMOTO?\n  1.SI        2.NO\n");
			opcion=Integer.parseInt(JOptionPane.showInputDialog("Ingrese opcion: "));	

		
	    switch(opcion)
	    {
	    case 1:
	    	afec=12;
	        break;
	    case 2:
	    	afec=14;
	    	break;
	    }
		
	    	
		opcion2=Integer.parseInt(JOptionPane.showInputDialog("               MENU\n 1.Ingresar nuevo producto    2.Mostrar productos     3.Calcular Total   4.SALIR\n Ingrese opcion: "));
		switch(opcion2)
		{
		  case 1:
			        //factu[cont]=new factura();
			        factu[cont].setNombre(JOptionPane.showInputDialog("Nombre de producto: "));
				    factu[cont].setPrecio(Float.parseFloat(JOptionPane.showInputDialog("Precio de producto: ")));
			        factu[cont].setN_productos(Integer.parseInt(JOptionPane.showInputDialog("Cantidad de productos: ")));
			        cont=cont+1;
			        break;
		  case 2:	        
			            System.out.println("NOMBRE       PRECIO          CANTIDAD");
			        for(int i=0;i<cont;i++)
			        {
			        	System.out.println(factu[i].getNombre()+"           "+factu[i].getPrecio()+"                "+factu[i].getN_productos());
			        }
			        break;
		  case 3:
			        subtotal=0;
			        iva=0;
			        total=0;
			        for(int i=0;i<cont;i++)
			        {
			        	subtotal=subtotal+factu[i].calcular_subtotal(factu[i].getPrecio(),factu[i].getN_productos());
			        	iva=iva+factu[i].calcular_iva(afec, factu[i].calcular_subtotal(factu[i].getPrecio(), factu[i].getN_productos())); 
			        }
			        total=total+subtotal+iva;	
			        System.out.println("el subtotal es: "+subtotal);
			        System.out.println("el iva "+afec+"% es: "+iva);
			        System.out.println("TOTAL: "+total);
		  default:
			       System.out.println("Opcion incorrecta");
			       
		}
	    
	   
	}

	}


