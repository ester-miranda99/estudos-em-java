package triangulo.application;

import java.util.Locale;
import java.util.Scanner;
// Tive que importar o Triangle porque ele tá num pacote diferente (triangulo.entities)
import triangulo.entities.Triangle;

public class Program {

    public static void main(String[] args) {
        
        // Pra usar ponto em vez de vírgula na hora de digitar os decimais no console
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Criando os dois objetos do tipo Triangle na memória (instanciando)
        Triangle x = new Triangle();
        Triangle y = new Triangle();

        // Lendo os lados do triângulo X
        System.out.println("Enter the measures of triangle X: ");
        x.a = sc.nextDouble(); // guarda o valor no lado 'a' do x
        x.b = sc.nextDouble(); // guarda o valor no lado 'b' do x
        x.c = sc.nextDouble(); // guarda o valor no lado 'c' do x

        // Lendo os lados do triângulo Y
        System.out.println("Enter the measures of triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        // Em vez de fazer a conta na mão aqui na Main, eu só chamo o método que criei lá na classe Triangle
        double areaX = x.area();
        double areaY = y.area();

        // Exibindo as áreas formatadas com 4 casas decimais
        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        // Comparando qual das duas áreas é a maior
        if (areaX > areaY) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }

        // Fechando o leitor do teclado
        sc.close();
    }
}