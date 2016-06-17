package herencia;

public class main {

	public static void main(String[] args) {
		
      triangle t1=new triangle();
      triangle t2=new triangle();
      
      t1.width=4;
      t1.height=2.5;
      t1.style="filled";
      
      t2.width=10;
      t2.height=5;
      t2.style="outline";
      
      System.out.println("información del triangulo 1");
      t1.showDim();
      t1.ShowStyle();
      System.out.println("el area es: "+t1.area());
      
      System.out.println("****************************");
      
      System.out.println("información del triangulo 2");
      t2.showDim();
      t2.ShowStyle();
      System.out.println("el area es: "+t2.area());
      
	}

}
