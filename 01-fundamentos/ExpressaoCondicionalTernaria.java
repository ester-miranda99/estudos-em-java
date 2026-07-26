import java.util.Scanner;

public class ExpressaoCondicionalTernaria {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

// Como era pra ser o código normal, sem a expressão condicional ternária
// double preco = 34.5;
//        double desconto;
//        if (preco < 20.0){
//            desconto = preco * 0.1;
//        } else {
//            desconto = preco * 0.05;
//       }
//        System.out.println(desconto);

// Como fica o código com a expressão condicional ternária
// O operador ternário substitui o bloco "if-else" tradicional:
// "?" equivale ao "if" (o que fazer SE a condição for verdadeira)
// ":" equivale ao "else" (o que fazer SENÃO / se for falsa)
        double preco = 34.5;
        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;

        System.out.println(desconto);

        scanner.close();
    }
}