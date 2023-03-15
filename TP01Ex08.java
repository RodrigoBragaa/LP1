import java.util.Scanner;

public class TP01Ex08 {
    
    public static void main(String[] args){
			final float MILHA_EM_METROS = 1852;
			final float QUILOMETRO_EM_METROS = 1000;

      float milhas, quilometros;
    	Scanner scan = new Scanner(System.in);
        
    	System.out.print("Entre com o valor em milhas: ");
    	milhas = scan.nextFloat();

    	quilometros = (milhas * MILHA_EM_METROS) / QUILOMETRO_EM_METROS;
    	
    	System.out.println("A medida das milhas em quilômetros " + quilometros);
    }
}