// Programa que simula o funcionamento de uma caixa de loja
// Esse programa calcula o valor total de um produto (preço x quantidade)
// e informa o troco que deve ser revolvido ao cliente.

import java.util.Scanner;

public class CaixaLoja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o preço do produto
        System.out.print("Digite o preço do produto: ");
        double precoUnitario = scanner.nextDouble();

        // Solicita a quantidade do produto
        System.out.print("Digite a quantidade do produto: ");
        int quantidade = scanner.nextInt();

        // Valor em dinheiro entregue pelo cliente
        System.out.print("Digite o valor em dinheiro entregue pelo cliente: ");
        double valorPago = scanner.nextDouble();

        // Processamento: cálculos do total e do troco

        double valorTotal = precoUnitario * quantidade;
        double troco = valorPago - valorTotal;

        // Exibição dos resultados
        // DICA DE FORMATAÇÃO DO printf:
        // %.2f -> insere um número decimal (double/float) formatado com 2 casas decimais.
        // %n -> pula para a próxima linha.
        System.out.printf("\n=== RESUMO DA COMPRA ===%n");
        System.out.printf("Valor total da compra: R$ %.2f%n", valorTotal);
        System.out.printf("Valor pago: R$ %.2f%n", valorPago);
        System.out.printf("Troco a ser devolvido: R$ %.2f%n", troco);

        // Fechando o scanner

        scanner.close();
    }
}