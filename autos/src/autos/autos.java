package autos;

public class autos {

private int centro; 
private int modelo;
private int precio;

	
public autos()
{
	
}



public int getModelo() {
	return modelo;
}

public void setModelo(int modelo) {
	this.modelo = modelo;
}



public int getCentro() {
	return centro;
}

public void setCentro(int centro) {
	this.centro = centro;
}


public int getPrecio() {
	return precio;
}


public void setPrecio(int precio) {
if(precio==1)
	this.precio = 10000;
else
	if(precio==2)
		this.precio=12500;
	else
		if(precio==3)
			this.precio=15600;
		else
			if(precio==4)
				this.precio=18200;
}
	

public void mostrar()
{
	System.out.println("centro de distribucion-> "+this.centro+" |precio-> "+this.precio);
}

public void mostrar_por_centro(int acu1,int cont1,int acu2,int cont2,int acu3,int cont3,int acu4,int cont4)
{
	System.out.println("\nTOTAL VENTAS POR CENTRO DE DISTRIBUCION \n1.NORTE->  autos vendidos-> "+cont1+" total ventas "+acu1+"\n2.SUR-> autos vendidos-> "+cont2+" total ventas-> "+acu2+"\n3.ESTE-> autos vendidos"+cont3+" total ventas-> "+acu3+"\n4.OESTE-> autos vendidos-> "+cont4+" total ventas-> "+acu4);
}

public void porcentaje(autos car[],int cont)
{
	int cont1=0,cont2=0,cont3=0,cont4=0,cont5=0,cont6=0,cont7=0,cont8=0,cont9=0,cont10=0,cont11=0,cont12=0,cont13=0,cont14=0,cont15=0,cont16=0;
	   for(int i=0;i<cont;i++)
	   {
		   if((car[i].getCentro()==1)&&(car[i].getModelo()==1))
			   cont1=cont1+1;
		   else
			   if((car[i].getCentro()==1)&&(car[i].getModelo()==2))
				   cont2=cont2+1;
			   else
				   if((car[i].getCentro()==1)&&(car[i].getModelo()==3))
					   cont3=cont3+1;
				   else
					   if((car[i].getCentro()==1)&&(car[i].getModelo()==4))
						   cont4=cont4+1;
		               else
		            	   if((car[i].getCentro()==2)&&(car[i].getModelo()==1))
		            		   cont5=cont5+1;
		            	   else
		            		   if((car[i].getCentro()==2)&&(car[i].getModelo()==2))
		            			   cont6=cont6+1;
		            		   else
		            			   if((car[i].getCentro()==2)&&(car[i].getModelo()==3))
		            				   cont7=cont7+1;
		            			   else
		            				   if((car[i].getCentro()==2)&&(car[i].getModelo()==4))
		            					   cont8=cont8+1;
		            				   else
		            					   if((car[i].getCentro()==3)&&(car[i].getModelo()==1))
			            					   cont9=cont9+1;
		            					   else
		            						   if((car[i].getCentro()==3)&&(car[i].getModelo()==2))
				            					   cont10=cont10+1;
		            						   else
		            							   if((car[i].getCentro()==3)&&(car[i].getModelo()==3))
		    		            					   cont11=cont11+1;
		            							   else
		            								   if((car[i].getCentro()==3)&&(car[i].getModelo()==4))
		        		            					   cont12=cont12+1;
		            								   else
		            									   if((car[i].getCentro()==4)&&(car[i].getModelo()==1))
		            		            					   cont13=cont13+1;
		            									   else
		            										   if((car[i].getCentro()==4)&&(car[i].getModelo()==2))
		            			            					   cont14=cont14+1;
		            										   else
		            											   if((car[i].getCentro()==4)&&(car[i].getModelo()==3))
		            				            					   cont15=cont15+1;
		            											   else
		            												   if((car[i].getCentro()==4)&&(car[i].getModelo()==4))
		            					            					   cont16=cont16+1;
		   
		   System.out.println("\nPORCENTAJES DE LOS MODELOS EN CADA UNO DE LOS CENTROS DE DISTRIBUCION CON RESPECTO AL TOTAL DE VENTAS");
		   System.out.println("CENTRO NORTE \nModelo1-> "+(cont1*100)/cont+"% |Modelo2-> "+(cont2*100)/cont+"% |Modelo3-> "+(cont3*100)/cont+"% |Modelo4-> "+(cont4*100)/cont);
		   System.out.println("CENTRO SUR \nModelo1-> "+(cont5*100)/cont+"% |Modelo2-> "+(cont6*100)/cont+"% |Modelo3-> "+(cont7*100)/cont+"% |Modelo4-> "+(cont8*100)/cont);
		   System.out.println("CENTRO ESTE \nModelo1-> "+(cont9*100)/cont+"% |Modelo2-> "+(cont10*100)/cont+"% |Modelo3-> "+(cont11*100)/cont+"% |Modelo4-> "+(cont12*100)/cont);
		   System.out.println("CENTRO OESTE \nModelo1-> "+(cont13*100)/cont+"% |Modelo2-> "+(cont14*100)/cont+"% |Modelo3-> "+(cont15*100)/cont+"% |Modelo4-> "+(cont16*100)/cont);
		   
		   
		   
			   
	   }
}
}
