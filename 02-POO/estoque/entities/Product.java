package estoque.entities;

// Classe que representa o produto do estoque (molde)
public class Product {
		
		// Atributos do produto (características)
		public String name;
		public double price;
		public int quantity;
		
		// Método 1: Calcula o valor total desse produto que tá no estoque
		public double totalValueInStock() {
			return price * quantity;
		}

		// Método 2: Adiciona uma quantidade de produtos do estoque atual
		// O "this.quantity" se refere ao atributo (característica) da classe, e "quantity" ao valor passado na função
		public void addProducts(int quantity){
			this.quantity += quantity;
		}
		
		// Método 3: Remove uma quantidade de produtos do estoque atual
		public void removeProducts(int quantity) {
			this.quantity -= quantity;
		}
		
		// Sobreescrevendo o toString para formatar a saída da tela do jeito que o exercício pediu,
		// assim, em vez de imprimir o endereço de memória, ele imprime os dados formatados do produto
		public String toString() {
	        return name
	            + ", $ "
	            + String.format("%.2f", price)
	            + ", "
	            + quantity
	            + " units, Total: $ "
	            + String.format("%.2f", totalValueInStock());
	}

}
