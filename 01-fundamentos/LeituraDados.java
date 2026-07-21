// 'import' é uma palavra-chave que traz ferramentas extras para o programa.
// Como o Scanner não vem ativado por padrão no Java básico, é preciso importar da biblioteca 'java.util'.
import java.util.Scanner;

// O nome da classe deve ser IGUAL ao nome do ARQUIVO. SEM números no começo do nome da classe. SEM espaços no nome da classe. 
// SEM acentos no nome da classe. SEM caracteres especiais no nome da classe.
public class LeituraDados {
    public static void main(String[] args) {

        // Aqui foi criado um objeto do tipo Scanner.
        // Nomeado de "scanner" para indicar que ele vai ler dados do usuário.
        // O 'new Scanner(System.in)' indica que o Scanner vai ler dados do teclado (entrada padrão).
        Scanner scanner = new Scanner(System.in);
        
        // O 'print' (sem o 'ln') mantém o cursor na mesma linha, permitindo que o usuário digite na mesma linha da pergunta.
        System.out.print("Digite seu nome: ");

        // O 'nextLine()' faz o programa PAUSAR e esperar o usuário digitar algo e apertar ENTER.
        // Todo texto digitado será guardado na variável 'nome' do tipo String.
        String nome = scanner.nextLine();

        // O método 'nextInt()' lê especificamente um número inteiro digitado pelo usuário e sem a vírgula.
        // Se o usuário digitar uma letra aqui o programa irá mostrar uma mensagem de erro e encerrar a execução.
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Olá, " + nome + "! Você tem " + idade + " anos.");
        
        scanner.close();
    }
}