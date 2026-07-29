// Programa básico para aprender a ESTRUTURA REPETITIVA FOR		
		
import java.util.Scanner;

public class EstruturaRepetitivaFor {
    public static void main(String[] args) {
    	
    	// 1. Abre a "porta" para ler o que for digitado pelo o usuário
        java.util.Scanner scanner = new Scanner(System.in);
        
        // 2. Lê o 1º número digitado:
        // Esse "N" definite a QUANTIDADE DE RODADAS que o laço vai fazer
        // Exemplo: se o usuário digitar "5", o programa vai saber que será digitado 5 números
        System.out.println("Quantos números você quer somar? ");
        int N = scanner.nextInt();
        
        
        // 3. Caixa registradora (acumulador):
        // Ela começa zerada para poder ir guardando o total das somas
        int soma = 0;
        
        
        // 4. Início do laço FOR:
        // int i = 0 -> começa o contador no 0
        // i > N -> vai repetir ENQUANTO "i" for MENOR que a quantidade armazenada na variável "N"
        // i++ -> a cada volta, adiciona +1 no contador "i"
        for (int i = 0; i < N; i++) {
        	
        	// A cada volta, lê o PRÓXIMO NÚMERO digitado pelo usuário
        	System.out.println("Digite um número para somar: ");
        	int X = scanner.nextInt();
        	
        	// Pega o valor antigo de "soma" e adiciona "X" atual
        	soma =  soma + X;
        }
        
        // 5.  MOSTRAR O RESULTADO:
        // Só executa essa linha DEPOIS que o "for" terminar todas as rodadas
        System.out.println(soma);
        
        scanner.close();
    }
}