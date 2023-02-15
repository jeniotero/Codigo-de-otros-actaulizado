import java.util.Scanner; // añadi el importe de scanner//
public class CodigoOtros {
	 
	    
	    System.out.println("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
	    String j1 = sc.nextLine();// faltaban algunas letras y las añadí//
	    Scanner sc = new Scanner();
	    /*System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");*/
	 
	    String j2 = sc.nextLine();
	    
	    if (j1 == j2) {
	      System.out.println("Empate");
	    } else {
	      int g = 2;
	      switch(j1) {
	        case "piedra":
	          if (j2 == "tijeras") {
	            g = 1;
	          }

	        case "papel":
	          if (j2 == "piedra") {
	            g = 1;}
	          
	        case "tijera":
	          if (j2.equals("papel")) {
	            g = 1;
	          }
	          break;
	        default:
	      
	      System.out.println("Gana el jugador " + g);
	      
	      }	    

	      
}
	    }