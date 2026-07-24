// Exercício básico sobre switch-case: menu de lanchonete fictícia e preços fictícios.

import java.util.Scanner;

public class MenuLanchonete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exibir o menu da lanchonete
        System.out.println(" ====== CARDÁPIO DA LANCHONETE ====== ");
        System.out.println("1 - Cachorro Quente - R$ 10,00");
        System.out.println("2 - X-Burguer - R$ 15,00");
        System.out.println("3 - X-Salada - R$ 12,50");
        System.out.println("4 - Combo Batata + Refri (500ml) - R$ 8,00");
        System.out.println("\nEscolha o código do seu pedido (1 a 4)");

        // Começo do switch-case para determinar o item e preço com base na escolha do usuário
        // Lê a opção digitada pelo usuário:
        int opcao1 = scanner.nextInt();

        // Variáveis auxiliares para armazenar os dados do items selecionado no switch-case
        double preco = 0.0;
        String item = "";

        // Estrutura switch-case: avalia o valor da variável 'opcao1' e executa 
        // o bloco de código correspondente ao caso correspondente.
        switch (opcao1) {
            case 1: 
                item = "Cachorro Quente";
                preco = 10.00;
                break; // Imterrompe o switch para não executar os casos abaixo e entrar em um looping.
            case 2:
                item = "X-Burguer";
                preco = 15.00;
                break;
            case 3:
                item = "X-Salada";
                preco = 12.50;
                break;
            case 4:
                item = "Combo Batata + Refri (500ml)";
                preco = 8.00;
                break;
            default:
                // Executado caso o valor digitado pelo usuário não corresponda a 
                // nenhuma das opções válidas (1 a 4).
                System.out.println("Opção inválida! Por favor, escolha uma opção entre 1 e 4.");
                return; // Sai do programa se a opção for inválida)
            
        }
        // Exibição dos resultados do pedido feito pelo usuário:
        System.out.println("\nVocê escolhe a opção: " + item + " - Preço: R$ " + preco);
        System.out.println("Total a pagar: R$ " + preco);
        
        // Fechamento do scanner para liberar recursos do sistema.
        scanner.close();
    }
}
