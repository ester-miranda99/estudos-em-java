// Programa para calcular a média escolar de três notas

import java.util.Scanner;

public class MediaEscolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a primeira nota:");

        double nota1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota:");

        double nota2 = scanner.nextDouble();
        System.out.println("Digite a terceira nota:");

        double nota3 = scanner.nextDouble();

        // Para o programa funcionar corretamente, é necessário que as notas sejam números válidos (double).
        // O programa calcula a média das três notas e exibe o resultado.
        // Por isso foi colocado o sinal de "+" (para o programa ler e calcular as variáveis)
        // e o sinal de "/3" para calcular a média.
        double media = (nota1 + nota2 + nota3) / 3;
        System.out.println("A média das notas é: " + media);
        
        scanner.close();
    }
}