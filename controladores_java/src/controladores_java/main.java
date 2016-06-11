package controladores_java;

public class main {

	public static void main(String[] args) {
		
		Manzana item1 = new Manzana(2);
		Manzana item2 = new Manzana("001");
		Manzana item3 = new Manzana("002",3);
		Manzana item4 = new Manzana("003",2,"Verde");
		Manzana[] items=new Manzana[5];	
		items[0]=new Manzana("004",2,"azul");
		
		item1.show_inf();
		item2.show_inf();
		item3.show_inf();
		item4.show_inf();
		items[0].show_inf();
	}

}
