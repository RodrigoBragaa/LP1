import java.util.Scanner;

public class TP01Ex03 {

	public static void main(String[] args) {
		float area, diagonal;
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite a medida da diagonal do quadrado: ");
		diagonal = scan.nextFloat();

		area = (diagonal * diagonal)/ 2;

		System.out.println("A area do quadrado é: " + area);
	}

}
