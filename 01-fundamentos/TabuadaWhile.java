import java.util.Scanner;

public class TabuadaWhile {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número para ver a tabuada: ");
		int numero = scanner.nextInt();
		
		int i = 1; // variável de controle (começa em 1)
		
		System.out.println("----- TABUADA DO " + numero + " -----");
		
		// Condição de parada (vai repetir enquanto "i" for menor ou igual a 10)
		
		while (i <= 10) {
			int resultado = numero * i;
			System.out.println(numero +  " x " + i + " = " + resultado);
			
			i++; // Passo importante: incrementa o "i" (equivale a: i = i + i
		}
		
		scanner.close();
	}
}
