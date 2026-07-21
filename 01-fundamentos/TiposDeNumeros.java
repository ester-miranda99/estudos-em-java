import java.util.Scanner;

public class TiposDeNumeros {
    public static void main(String[] args) {
        // Aqui foi criado um objeto do tipo Scanner.
        // Nomeado de "scanner" para indicar que ele vai ler dados do usuário.
        // O 'new Scanner(System.in)' indica que o Scanner vai ler dados do teclado (entrada padrão).
        Scanner scanner = new Scanner(System.in);

        // Lendo um número inteiro (int)
        System.out.print("Digite uma quantidade de produtos (int - ex: 5): ");
        int numeroInteiro = scanner.nextInt();

        // Lendo um número decimal de alta precisão (double)
        System.out.print("Digite o preço unitário do produto (double - ex: 19.99): ");
        double numeroDecimal = scanner.nextDouble();

        // Lendo um número decimal de baixa precisão (float)
        System.out.print("Digite a taxa de desconto em % (float - ex: 5.5): ");
        float taxaDesconto = scanner.nextFloat();

        // Lendo um número inteiro grande (long)
        System.out.print("Digite a população de uma cidade (long - ex: 1000000): ");
        long populacaoCidade = scanner.nextLong();

        // Exibindo os valores lidos
        // É adicionado um "+" pra o programa conseguir concatenar (juntar) o texto com os valores das variáveis.
        System.out.println("\n === RESUMO DOS DADOS ===");  
        System.out.println("Quantidade: " + numeroInteiro);
        System.out.println("Preço R$: " + numeroDecimal);
        System.out.println("Desconto: " + taxaDesconto + " %");
        System.out.println("Número da população digitada: " + populacaoCidade);

        scanner.close();
    }
}