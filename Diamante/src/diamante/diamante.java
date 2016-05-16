package diamante;

public class diamante {
	int tamanio;
    public diamante(){
  	  
    }
    
    public int get_tamanio(){
    	  return this.tamanio;
    }
      
    public void set_tamanio(int tamanio){
    	  this.tamanio = tamanio;
    }
    
    public void dibujar(int tamanio){
    	char espacio = ' '; 
        char asterisco = '*';
        for (int i= 1; i<=tamanio; i++){ 
            for (int espacios = tamanio - i; espacios >0; espacios--)       
                 System.out.print(espacio); 
                  for (int lineas = 1; lineas < 2 * i; lineas++) 
                    System.out.print(asterisco); 
                     System.out.println(""); 
         } 
         for (int i= tamanio-1; i>=1; i--){ 
            for (int espacios = tamanio - i; espacios >0; espacios--)       
                 System.out.print(espacio); 
                  for (int lineas = 1; lineas < 2 * i; lineas++) 
                    System.out.print(asterisco); 
                     System.out.println(""); 
         } 
     } 
}
