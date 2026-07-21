import java.util.Scanner;

public class MatematicaAdicao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        double num1 = scanner.nextDouble();
        System.out.println("Digite o segundo número:");
        double num2 = scanner.nextDouble();
        System.out.println("A soma dos números é: " + (num1 + num2));
        scanner.close();
    }
}