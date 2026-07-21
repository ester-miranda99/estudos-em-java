// Toda aplicação Java precisa estar dentro de uma classe. 
// O nome da classe deve ser o mesmo do arquivo, neste caso HelloWorld.java
// 'public' significa que a classe é pública e pode ser acessada de qualquer lugar.
// 'class' é a palavra-chave que define uma classe em Java.
// 'HelloWorld' é o nome da classe, que deve começar com letra maiúscula por convenção.

public class HelloWorld {
    // O método main é o ponto de entrada da aplicação Java.
    // 'public' significa que o ambiente de execução do Java (JVM) pode acessar esse método de qualquer lugar.
    // 'static' permite que o Java rode esse método sem precisar criar um objeto da classe.
    // 'void' significa que o método não retorna nenhum valor.
    // 'main' é o nome do método, que é especial e reconhecido pela JVM como o ponto de início da aplicação.
    // 'String[] args' é um parâmetro que permite receber dados/entradas do terminal (em formato de texto)

    public static void main(String[] args) {

        //'System' é uma classe nativa do Java que dá acesso ao sistema.
        // 'out' é o objeto de saída padrão (o console/terminal).
        // 'println' é um método que imprime uma linha de texto no console.
        // "Hello, World!" é a mensagem que será exibida no console/terminal.
        System.out.println("Hello, World!");
        
    } // Fecha o bloco do método main
} // Fecha o bloco da classe HelloWorld