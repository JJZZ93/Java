package autos;

import javax.swing.JOptionPane;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int cont=0,cont1,cont2,cont3,cont4; 
        int op,acu_cen1,acu_cen2,acu_cen3,acu_cen4;    //acumuladores del total de ventas por centro
        int total;
        
		autos[] car=new autos[10];
		
		do
	    {
	    	
		op=Integer.parseInt(JOptionPane.showInputDialog("               MENU\n 1.Ingresar nuevo auto\n 2.Mostrar informacion de autos\n 3.Mostrar volumen de ventas total\n 4.Mostrar volumen de ventas por centro \n 5.Porcentaje de cada modelo por centro\n 6.SALIR  \nIngrese opcion: "));
		switch(op)
		{
		  case 1:
			        car[cont]=new autos();
			        car[cont].setCentro(Integer.parseInt(JOptionPane.showInputDialog("Centros de distribución \n1.Norte \n2.Sur \n3.Este \n4.Oeste")));
			        car[cont].setModelo(Integer.parseInt(JOptionPane.showInputDialog("TIPOS DE AUTOS \n1.Auto Aveo family-> $10.000 \n2.Camioneta BT50-> $12.500\n3.Hyundai tucson-> $15.600\n4.Toyota hilux-> $18.200")));
			        car[cont].setPrecio(car[cont].getModelo());
			        cont=cont+1;
			        break;
		  case 2:	        
			            System.out.println("CENTRO DE DISTRIBUCION  \tMODELO   \tPRECIO");
			        for(int i=0;i<cont;i++)
			        {
			        	System.out.println("\t"+car[i].getCentro()+"\t\t\t  "+car[i].getModelo()+"\t\t"+car[i].getPrecio());
			        }
			        break;
		  case 3:
			       total=0;
			        for(int i=0;i<cont;i++)
			        {
			        	total=total+car[i].getPrecio();
			        }
			        System.out.println("\nAUTOS VENDIDOS -> "+(cont-1)+"TOTAL DE VENTAS:              "+total);
			        break;
		  case 4:
			      acu_cen1=0;
			      acu_cen2=0;
			      acu_cen3=0;
			      acu_cen4=0;
			      cont1=0;
			      cont2=0;
			      cont3=0;
			      cont4=0;
			        for(int i=0;i<cont;i++)
		            {
		        	    if(car[i].getCentro()==1){
		        	    	acu_cen1=acu_cen1+car[i].getPrecio();
		        	        cont1=cont1+1;
		        	    }
		        	    else
		        	    	if(car[i].getCentro()==2){
			        	    	acu_cen2=acu_cen2+car[i].getPrecio();
			        	    	cont2=cont2+1;
		        	    	}
			        	    else
				        	    	if(car[i].getCentro()==3){
					        	    	acu_cen3=acu_cen3+car[i].getPrecio();
					        	    	cont3=cont3+1;
				        	    	}
				        	    	 else
						        	    	if(car[i].getCentro()==4){
							        	    	acu_cen4=acu_cen4+car[i].getPrecio();
							        	    	cont4=cont4+1;
						        	    	}
		            }
			        
			        car[0].mostrar_por_centro(acu_cen1,cont1, acu_cen2,cont2, acu_cen3,cont3, acu_cen4,cont4);
			        break;
		  case 5: 
		             car[0].porcentaje(car,cont);	        
			  break;
			        
		}
	    }while(op!=6);
	    
	    System.out.println("\n***** Fin del programa *****\n");
	    System.gc();
	}

	}


