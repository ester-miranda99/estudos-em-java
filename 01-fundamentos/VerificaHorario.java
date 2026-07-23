// Programa que irá verificar o horário digitado pelo usuário
// e irá verificar o horário para poder exibir a mensagem de
// "bom dia", ou "boa tarde", ou "boa noite".

import java.util.Scanner;

public class VerificaHorario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite o horário
        System.out.println("Digite o horário (0 a 23): ");
        int hora = scanner.nextInt();

        // Verifica o horário e exibe a mensagem correspondente
        // "if" é = se
        if (hora >= 0 && hora < 12) {
            System.out.println("Bom dia!");
        // "else if" é = se não, se
        // caso a primeira condição não for verdadeira, ele irá verificar a segunda condição
        } else if (hora >= 12 && hora < 18) {
            System.out.println("Boa tarde!");
        // "else" é = se não
        // caso nenhuma das condições anteriores forem verdadeiras, ele irá executar o bloco de código do "else"
        } else if (hora >= 18 && hora <= 23) {
            System.out.println("Boa noite!");
        // fim do if else, última condição, caso nenhuma das condições anteriores forem verdadeiras, ele irá executar o bloco de código do "else"
        } else {
            System.out.println("Horário inválido!");
        }

        scanner.close();
    }
}
