package validar_correo;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		User persona[]=new User[4];
        System.out.println("NUM\t  CORREO\t         CONTRASE�A\t   TIPO DE CONTRASE�A\t "); 		
		for(int i=0;i<4;i++)
		{
			System.out.println();
			System.out.print((i+1)+"\t");
			persona[i]=new User();
			do
			{
			  persona[i].setEmail(JOptionPane.showInputDialog("Ingrese correo: "));
			}while(persona[i].validar_correo()==false);
			
			
			persona[i].setContrasena(persona[i].generar_contrasena());
			System.out.print(persona[i].getEmail()+"\t\t"+persona[i].generar_contrasena()+"\t"+persona[i].fuerte_debil(persona[i].validar()));	
		}
		
	}

}