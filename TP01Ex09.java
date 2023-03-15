import java.util.Scanner;

public class TP01Ex09 {

	public static void main(String[] args) {
		double resistencia, corrente, tensao;
		Scanner scan = new Scanner(System.in);

		System.out.print("Entre com o valor da resistencia: ");
		resistencia = scan.nextDouble();

		System.out.print("Entre com o valor da corrente: ");
		corrente = scan.nextDouble();

		tensao = resistencia * corrente;

		System.out.println("A tensão do circuito é: " + tensao);
	}

}
