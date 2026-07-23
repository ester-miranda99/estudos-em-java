// Verifica se uma pessoa é maior ou menor de idade com base na idade fornecida pelo usuário.
// Método simples para entender como funciona a expressão comparativa: false ou true. 

import java.util.Scanner;

public class VerificaMaiorIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();

       boolean ehMaiorDeIdade = idade >= 18;
       boolean ehMenorDeIdade = idade < 18;

       System.out.println("\n === RESULTADO DA VERIFICAÇÃO ===");
       System.out.println("É maior de idade (18 anos ou mais): " + ehMaiorDeIdade);
       System.out.println("É menor de idade (menos de 18 anos): " + ehMenorDeIdade);

        scanner.close();
    }
}
