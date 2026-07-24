// Programa para demonstrar OPERADORES LÓGICOS em Java.

import java.util.Scanner;


public class OperadoresLogicos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados:

        System.out.print("Digite sua idade: ");
        // Lê a idade do usuário:
        int idade = scanner.nextInt();

        System.out.print("Você tem o ingresso? (true/false): ");
        // Lê se o usuário tem o ingresso:
        boolean TemIngresso = scanner.nextBoolean();

        System.out.print("Você tem a carteirinha de estudante? (true/false): ");
        // Lê se o usuário tem a carteirinha de estudante:
        boolean TemCarteirinha = scanner.nextBoolean();


        // 1. Operador Lógico AND (&&):
        boolean PodeEntrar = (idade >= 18) && TemIngresso;

        // 2. Operador Lógico OR (||):

        boolean TemDesconto =  TemCarteirinha || TemIngresso;

        // 3. Operador Lógico NOT (!):

        boolean NaoPodeEntrar = !PodeEntrar;

        // Exibindo os resultados booleanos:
        System.out.println("\n ----- RESULTADO DA VERIFICAÇÃO -----");
        System.out.println(" Pode entrar no evento? " + PodeEntrar);
        System.out.println("Tem direito a DESCONTO/MEIA-ENTRADA? " + TemDesconto);
        System.out.println("A entrada foi negada? " + NaoPodeEntrar);

        scanner.close();
    }
}