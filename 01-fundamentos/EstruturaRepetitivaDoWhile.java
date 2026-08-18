// Programa que lê o valor em temperatura digitado em Celsius pelo usuário e
// transcreve para Fahrenheit .

import java.until.Scanner;

public class EstruturaRepetitivaDoWhile {
	public static void main(String[] args) {
		
		// Prepara o Scanner para ler o que o usuário digitar:
		Scanner scanner = new Scanner(System.in);
		
		
		// Declara variável "resp" (tipo char = guarda 1 caractere)
		// Ela precisa ficar FORA do "do-while" para o "while" conseguir ler ela no final
		char resp;
		
		// Início da estrutura do-while:
		// O bloco "do" garante que todo o código interno vai rodar pelo menos uma vez
		do {
			// Pergunta e lê a temperatura em Celsius:
			System.out.print("Digite a temperatura em Celsius: ");
			double C = scanner.nextDouble();
			
			// Fórmula matemática de conversão para Fah
			double F = 9.0 * C / 5.0 + 32;
			
			// Mostra o resultado formatado  com uma casa decimal (%.1f) e quebra de linha (%n)
			System.out.printf("Equivalemnte em Fahrenheit: %.1f%n", F );
			
			
			// Pergunta ao usuário se ele quer continuar no programa
			System.out.println("Deseja repetir (n/s)? ");
			
			// Lê a resposta do usuário:
			// scanner.next() lê o texto digitado
			// charAt(0) pega a PRIMEIRA letra digitada (índice 0) e guarda em "resp"
			resp = scanner.next().charAt(0);
			
			
			// Condição de repetição:
			// Se o usuário digitou "s", a condição (resp == "s") é VERDADEIRA e o laço volta pro início do "do"
			// Se digitou qualquer outra letra (como "n"), a condição é FALSA e o programa encerra
		} while (resp != 'n');
		
		scanner.close();
		
	}
}
