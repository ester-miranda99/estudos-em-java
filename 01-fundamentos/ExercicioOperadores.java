// Uma operadora de telefonia cobra R$ 50,00 por um plano básico que dá direito a 100 minutos
// de telefone. Cada minuto que exceder a franquia de 100 minutos custa R$ 2,00.
// Faça um programa para ler a quantidade de minutos que uma pessoa consumiu,
// daí mostrar o valor a ser pago.

import java.util.Scanner;

public class ExercicioOperadores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados:
        System.out.print("Digite a quantidade de minutos consumidos: ");
        // Lê a quantidade digita de minutos consumidos pelo usuário:
        int MinutosConsumidos = scanner.nextInt();

        // Cálculo do valor a ser pago:

        double conta = 50.0; // Valor do plano básico
        if (MinutosConsumidos > 100) {
            // conta += é o mesmo que: conta = conta +
            conta += (MinutosConsumidos - 100) * 2.0; // Cálculo do valor excedente
        }

        // Saída de dados:
        System.out.printf("Valor a ser pago: R$ %.2f%n", conta);

        scanner.close();
    }
}

// Operadores de atribuição cumulativa são usados para simplificar expressões que 
// envolvem a atualização de uma variável com base em seu valor atual. 
// No exemplo acima, o operador `+=` é utilizado para adicionar o custo dos minutos excedentes ao 
// valor da conta, tornando o código mais conciso e legível.

// Exemplos: 

// a += b; // é equivalente a: a = a + b;
// a -= b; // é equivalente a: a = a - b;
// a *= b; // é equivalente a: a = a * b;
// a /= b; // é equivalente a: a = a / b;
// a %= b; // é equivalente a: a = a % b;