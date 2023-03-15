
import java.util.Scanner;

public class TP01Ex17 {

	public static void main(String[] args) {
		double x, y, resultado;
		Scanner scan = new Scanner(System.in);

		System.out.print("Entre com o valor x (base): ");
		x = scan.nextDouble();

		System.out.print("Entre com o valor y (expoente): ");
		y = scan.nextDouble();

		resultado = Math.pow(x, y);

		System.out.println("O resultado da potencição é: " + resultado);
	}

}