import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class fase2 {

	public static void main(String[] args) throws NumberFormatException{
		
			
		int de5, de10, de20, de50, de100, de200, de500;
		int preuTotal;
		String[] menu = new String[5];
		double[] preuPlats = new double[5];
		
		for( int i = 0; i<menu.length; i++) {  //per introduir els 5 plats
			System.out.println("introduzca plato "+(i+1)+"/5:");  
			Scanner scan = new Scanner (System.in); 
	        String plat = scan.nextLine();
	        menu[i]=plat;
	        
	        
	        	try {
	        System.out.println("Introduzca el precio del plato "+(i+1)+"/5:"); //per introduir els 5 preus
			Scanner scan2 = new Scanner (System.in); 
	        double preu = Double.parseDouble(scan2.nextLine());
	        preuPlats[i]=preu;
	        	}catch(Exception e) {
	        		System.out.println("No es un precio correcto, vuelva a introducir plato y precio");
	        		i--;
	        	}
		}
		
		System.out.println("Platos: "+Arrays.toString(menu));
		System.out.println("Precios: "+Arrays.toString(preuPlats));	
		
		
		ArrayList<String> pedido = new ArrayList<String>();
		
		int seguir = 1;
		
		while(seguir == 1) {
			System.out.println("Que plato quiere?");
			Scanner scan3 = new Scanner (System.in); 
	        String platoPedido = scan3.nextLine();
	        pedido.add(platoPedido);
	        
	        System.out.println("quiere seguir pidiendo?(1:Si / 0:No):");
			Scanner scan4 = new Scanner (System.in); 
	        seguir = Integer.parseInt(scan4.nextLine());  
	        
	       /* while((seguir != 1) || (seguir != 0)){
	        	System.out.println("Mal, vuelve a introducir:(1:Si / 0:No)");
	        	Scanner scan5 = new Scanner (System.in); 
		        seguir = Integer.parseInt(scan5.nextLine()); 
	        }*/
		}
		
		System.out.println("Platos pedidos: "+pedido);

	}

}
