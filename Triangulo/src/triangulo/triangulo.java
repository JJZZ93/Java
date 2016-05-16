package triangulo;

public class triangulo {
	
	int tamanio;
    public triangulo(){
  	  
    }
    
    public int get_tamano(){
    	  return this.tamanio;
    }
      
    public void set_tamano(int tamanio){
    	  this.tamanio = tamanio;
    }
    
    public void dibujar(int tamanio){
        int x = tamanio, y, aux = 0, i;
        boolean flag = false;
        do {
            y = 1;
            do {
                if (y >= x) {
                    if (flag == false) {
                        System.out.print("*");
                        if (aux > 0) {
                            i = aux;
                            do {
                            	System.out.print (" ");
                                i--;
                            } while (i > 1);
                            System.out.print("*");
                        }
                        flag = true;
                    }
                } else
                	System.out.print(" ");
                y++;
            } while (y <= tamanio * 2 - 1);
            aux += 2;
            flag = false;
            System.out.print("\n");
            x--;
        } while (x > 0);
     } 
}
