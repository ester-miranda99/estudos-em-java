import java.util.Scanner;

public class FuncoesSintaxe {
    
    /* MINHAS ANOTAÇÕES DA AULA: FUNÇÕES (SINTAXE)
     * 
     * 1. O QUE SÃO FUNÇÕES?
     *    - Elas representam um processamento que tem um significado próprio.
     *    - Exemplos que já usamos: Math.sqrt(double) ou System.out.println(string).
     *    - Aprendi que, quando defino uma função dentro de uma classe na Orientação 
     *      a Objetos, dou a ela o nome de "método".
     * 
     * 2. QUAIS SÃO AS VANTAGENS?
     *    - Modularização: consigo dividir meu código em partes menores e mais fáceis de organizar.
     *    - Delegação: separo melhor as responsabilidades.
     *    - Reaproveitamento: evito repetir código.
     * 
     * 3. ENTRADA E SAÍDA:
     *    - Entrada: Posso passar dados para a função através de parâmetros ou argumentos.
     *    - Saída: A função pode ou não me devolver (retornar) um resultado depois de processar.
     * 
     * 4. EXERCÍCIO DA AULA:
     *    - O problema era ler três números inteiros e exibir na tela qual deles é o maior.
     *    - Para organizar melhor, criei:
     *      * A função 'max' para descobrir o maior número.
     *      * A função 'showResult' para imprimir o resultado na tela.
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Chamo a função 'max' para processar e me retornar o maior valor entre a, b e c
        int higher = max(a, b, c);

        // Chamo a função 'showResult' apenas para exibir o valor na tela
        showResult(higher);

        sc.close();
    }

    // Minha função para calcular o maior entre três números
    public static int max(int x, int y, int z) {
        int aux;
        if (x > y && x > z) {
            aux = x;
        } 
        else if (y > z) {
            aux = y;
        } 
        else {
            aux = z;
        }
        return aux; // Devolvo o maior valor encontrado
    }

    // Minha função para mostrar o resultado (como só imprime e não retorna nada, uso 'void')
    public static void showResult(int value) {
        System.out.println("Higher = " + value);
    }
}