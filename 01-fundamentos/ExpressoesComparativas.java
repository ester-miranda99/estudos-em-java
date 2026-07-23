// Exemplos de expressões comparativas em Java utilizando variáveis com valores já atribuídos.

public class ExpressoesComparativas {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Comparação de igualdade
        boolean igual = (a == b);
        System.out.println("a é igual a b? " + igual);

        // Comparação de desigualdade
        boolean diferente = (a != b);
        System.out.println("a é diferente de b? " + diferente);

        // Comparação maior que
        boolean maiorQue = (a > b);
        System.out.println("a é maior que b? " + maiorQue);

        // Comparação menor que
        boolean menorQue = (a < b);
        System.out.println("a é menor que b? " + menorQue);

        // Comparação maior ou igual a
        boolean maiorOuIgual = (a >= b);
        System.out.println("a é maior ou igual a b? " + maiorOuIgual);

        // Comparação menor ou igual a
        boolean menorOuIgual = (a <= b);
        System.out.println("a é menor ou igual a b? " + menorOuIgual);
    }
}