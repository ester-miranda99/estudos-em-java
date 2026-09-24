package estoque.application;

import java.util.Locale;
import java.util.Scanner;
// Importando a classe Product do outro pacote
import estoque.entities.Product;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Instanciando o objeto product
        Product product = new Product();

        // Leitura inicial dos dados do produto
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();

        // Exibindo os dados iniciais do produto usando o toString() que foi criado lá na classe Product
        System.out.println();
        System.out.println("Product data: " + product);

        // Entrada de estoque (adicionando produtos)
        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int quantityToAdd = sc.nextInt();
        product.addProducts(quantityToAdd); // Atualiza a quantidade no objeto

        // Exibindo os dados atualizados
        System.out.println();
        System.out.println("Updated data: " + product);

        // Saída de estoque (removendo produtos)
        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        int quantityToRemove = sc.nextInt();
        product.removeProducts(quantityToRemove); // Atualiza a quantidade no objeto

        // Exibindo os dados atualizados novamente
        System.out.println();
        System.out.println("Updated data: " + product);

        sc.close();
    }
}