// Programa básico para entender a estrutura de repetição "while" em Java
import java.util.Scanner;

public class EstruturaEnquantoWhile {
    public static void main(String[] args) {
        // Prepara o Scanner para ler as entradas do teclado
        Scanner scanner = new Scanner(System.in);

        // 1. Leitura inicial: pega o primeiro valor ANTES de entrar no laço
        int x = scanner.nextInt();

        // 2. Estrutura "while": avalia a condição antes de executar o bloco
        // O laço vai REPETIR ENQUANTO o valor de "x" for DIFERENTE de 0
        while (x != 0){
            // Lê um novo número a cada REPETIÇÃO
            // Quando o usuário digitar "0", na próxima verificação do "while"
            // a condição "(0 != 0)" será FALSA e o programa sairá do laço
            x = scanner.nextInt();
        }

        // 3. Ponto de saída: chegou aqui porque o usuário digitou "0" e o "while" encerrou
        System.out.println("Programa finalizado! Você digitou: 0.");

        // Fecha o leitor para liberar recursos (SEMPRE dentro do main, no final do código)
        scanner.close();
    }
}